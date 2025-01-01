package AllProperty;

public abstract class Residental extends Property{
    protected int parkingLots = 0;

    public Residental(String address, double area, double price, int parkingLots) {
        super(address, area, price);
        setParkingLots(parkingLots);
    }

    @Override
    public void taxlt() {
        System.out.println(price*0.08);
    }

    public int getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(int parkingLots) {
        if(parkingLots<0){return;}
        this.parkingLots = parkingLots;
    }

    @Override
    public String toString() {
        return "Residental{" +
                "parkingLots=" + parkingLots +
                '}'+super.toString();
    }
}
