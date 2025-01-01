package AllProperty;

public class Apartment extends Residental {
    protected int rooms = 1;

    public Apartment(String address, double area, double price, int parkingLots, int rooms) {
        super(address, area, price, parkingLots);
        this.rooms = rooms;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if(rooms<1){return;}
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "rooms=" + rooms +
                '}'+super.toString();
    }
}
