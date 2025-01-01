package PropertyManagement;

import AllProperty.Property;

import java.util.ArrayList;

public class RealEstateManager {
    protected String name;
    protected static ArrayList<Property> properties = new ArrayList<>();

    public RealEstateManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ArrayList<Property> getProperties() {
        return properties;
    }

    public void setName(String name) {
        if(name==null||name == " ")
        {
            return;
        }
        this.name = name;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public void addProp(Property property)
    {
        properties.add(property);
    }
    public static ArrayList<Property> getPropsBelow(double price)
    {
        ArrayList<Property> newProps = new ArrayList<>();

        for (Property property : properties) {
            if(property.getPrice()<=price)
            {
                newProps.add(property);
            }
        }
        return newProps;
    }
    public double getNetworth()
    {
        double sum = 0;

        for (Property property : properties) {
            sum+=property.getPrice();
        }
        return sum;
    }
}
