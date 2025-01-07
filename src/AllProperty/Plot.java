package AllProperty;

public class Plot extends Property{
    public enum TYPE {URBAN,AGRICULTURAL,INDUSTRIAL};
    protected static final double arr[] = {0.1,0.02,0.05};
    protected TYPE type;


    public Plot(String address, double area, double price, TYPE type) {
        super(address, area, price);
        setType(type);
    }

    @Override
    public void taxlt() {
        System.out.println(price*arr[type.ordinal()]);
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plot{" +
                "Type=" + type +
                '}'+super.toString();
    }
}
