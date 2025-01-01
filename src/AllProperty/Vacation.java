package AllProperty;

public class Vacation extends Residental{
    protected int guests = 1;

    public Vacation(String address, double area, double price, int parkingLots, int guests) {
        super(address, area, price, parkingLots);
        setGuests(guests);
    }

    @Override
    public void taxlt() {
        System.out.println(price*0.25);
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "guests=" + guests +
                '}'+super.toString();
    }
}
