package AllProperty;

public class Plot extends Property{
    public enum TYPE {URBAN,AGRICULTURAL,INDUSTRIAL};
    protected static final double arr[] = {0.1,0.02,0.05};
    protected int type;


    public Plot(String address, double area, double price, int type) {
        super(address, area, price);
        setType(type);
    }

    @Override
    public void taxlt() {
        System.out.println(price*arr[type]);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if(type<0){return;}
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plot{" +
                "Type=" + type +
                '}'+super.toString();
    }
}
