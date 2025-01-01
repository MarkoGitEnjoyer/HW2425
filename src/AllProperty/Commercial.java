package AllProperty;

public class Commercial extends Property {
    protected boolean storeroom = false;
    protected double yield = 0.0;

    public Commercial(String address, double area, double price, double yield) {
        super(address, area, price);
        setYield(yield);
    }

    public Commercial(String address, double area, double price, boolean storeroom, double yield) {
        super(address, area, price);
        setStoreroom(storeroom);
        setYield(yield);
    }

    @Override
    public void taxlt() {
        System.out.println(price*0.05);
    }

    public boolean isStoreroom() {
        return storeroom;
    }

    public double getYield() {
        return yield;
    }

    public double getMonthYield()
    {
        return (price*(yield/100))/12;
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public void setYield(double yield) {
        if(yield<0){return;}
        this.yield = yield;
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "storeroom=" + storeroom +
                ", yield=" + yield +
                '}'+super.toString();
    }
}
