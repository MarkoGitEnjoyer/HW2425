import AllProperty.Commercial;
import AllProperty.Property;
import MyExceptions.PriceException;
import MyExceptions.myMissmatchInput;
import PropertyManagement.DataManager;
import PropertyManagement.RealEstateManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static RealEstateManager manager = new RealEstateManager("Guy");

    private static void propertiesList(double price) {
        try {
            if (price < 0) {
                throw new PriceException("Price cannot be negative.");
            }
            ArrayList<Property> properties = RealEstateManager.getPropsBelow(price);
            if (properties.isEmpty()) {
                System.out.println("No properties");
            }
            else {
                for (Property property : properties) {
                    System.out.println(property);
                }
            }
        } catch (PriceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void financialReport() {
        for (Property property : RealEstateManager.getProperties()) {
            System.out.println(property);
            property.taxlt();
        }
    }

    private static void commercialYield() {
        double totalYield = 0;
        for (Property property : RealEstateManager.getProperties()) {
            if (property instanceof Commercial) {
                Commercial commercial = (Commercial) property;
                double monthlyYield = commercial.getMonthYield();
                totalYield += monthlyYield;
                System.out.println(commercial + ", Monthly Yield: " + monthlyYield);
            }
        }
        System.out.println("Total Commercial Yield: " + totalYield);
    }

    private static boolean containsCity(String cityInput,Property property)
    {
        String city = cityInput.replaceAll("[-]", " ").toLowerCase();
        cityInput.trim(); // מוחק רווחים
        return property.getAddress().contains(cityInput);
    }
    private static void propertiesByCity(String cityInput) {

        ArrayList<Property> properties = new ArrayList<>();
        for (Property property : RealEstateManager.getProperties()) {
            if (containsCity(cityInput,property)) {
                properties.add(property);
            }
        }

        if (properties.isEmpty()) {
            System.out.println("No properties found in the specified city.");
        } else {
            for (Property property : properties) {
                System.out.println(property);
            }
        }
    }

    private static void numberOfCities() {
        HashSet<String> cities = new HashSet<>();

        for (Property property : RealEstateManager.getProperties()) {
            String address = property.getAddress();
            if (address != null && !address.isEmpty()) {
                String city = address.split(",")[0].trim().replaceAll("[-]", " ").toLowerCase(); // סיבכת אותי
                cities.add(city);
            }
        }

        System.out.println("Number of different cities: " + cities.size());
        System.out.println("Cities: " + String.join(", ", cities));
    }

    public static int getChoice(int n) throws myMissmatchInput {
        if(n>5||n<-1||n==0){
            throw new myMissmatchInput("Input Missmatch");
        }
        return n;
    }

    public static void main(String[] args) {
        manager.setProperties(DataManager.getData());
        Scanner scanner = new Scanner(System.in);

        int choice;
        while(true)
        {
            System.out.println("Menu:");
            System.out.println("1 > Search Properties");
            System.out.println("2 > Financial Report");
            System.out.println("3 > Commercial Yield");
            System.out.println("4 > Properties By City");
            System.out.println("5 > Number of Cities");
            System.out.println("-1 > Exit");
            System.out.print("Choose an option: ");
            try {
                choice = getChoice(scanner.nextInt());
                scanner.nextLine();
            } catch (myMissmatchInput e) {
                System.out.println("Invalid input. Please enter a number you had to enter.");
                scanner.next();
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter maximum price: ");
                    double price = scanner.nextDouble();
                    propertiesList(price);
                    break;
                case 2:
                    financialReport();
                    break;
                case 3:
                    commercialYield();
                    break;
                case 4:
                    System.out.print("Enter city name: ");
                    String city = scanner.nextLine();
                    propertiesByCity(city);
                    break;
                case 5:
                    numberOfCities();
                    break;
                case -1:
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

        }

    }
}