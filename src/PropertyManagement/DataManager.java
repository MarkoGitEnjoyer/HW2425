package PropertyManagement;

import AllProperty.*;

import java.util.ArrayList;

public class DataManager {
    public static ArrayList<Property> getData()
    {
        ArrayList<Property> properties = new ArrayList<>();

        properties.add(new Plot("Plot, 1",1.1,1, Plot.TYPE.URBAN));
        properties.add(new Plot("Plot, 2",1.2,2,Plot.TYPE.AGRICULTURAL));
        properties.add(new Apartment("Apartment, 1",2.1,3,2,3));
        properties.add(new Apartment("Apartment, 2",2.2,4,4,5));
        properties.add(new Villa("Villa, 1",3.1,5,6,7));
        properties.add(new Villa("Villa, 2",3.2,6,8,9));
        properties.add(new Vacation("Vacation, 1",4.1,7,2,5));
        properties.add(new Vacation("Vacation, 2",4.2,8,3,6));
        properties.add(new Commercial("Commercial, 1",5.1,9,0.4));
        properties.add(new Commercial("Commercial, 2",5.2,10,0.5));
        properties.add(new Office("Office, 1",6.1,11));
        properties.add(new Office("Office, 2",6.2,12));

        return properties;
    }
}
