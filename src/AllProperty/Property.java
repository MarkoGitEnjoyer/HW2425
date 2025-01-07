package AllProperty;

public abstract class Property {
    protected String address = "Na";
    protected double area = 0;
    protected double price = 0;

    public Property(String address, double area, double price) {
        setArea(area);
        setAddress(address);
        setPrice(price);
    }

    public abstract void taxlt();

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    public void setAddress(String address)
    {
        if(address==null||address.isEmpty()||address.isBlank())
        {
            return;
        }
        int count = 1;
        address = address.trim();
        char ch = address.charAt(0);
        for (int i = 1; i < address.length(); i++) {
            if(address.charAt(i)!=' '&&ch==' ')
            {
                count++;
            }
            ch = address.charAt(i);
        }
        if(count<2)
        {
            return;
        }
        this.address = address;
    }
    public void setArea(double area)
    {
        if(area<0)
        {
            return;
        }
        this.area = area;
    }
    public void setPrice(double price)
    {
        if(price<0)
        {
            return;
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", price=" + price +
                '}';
    }
}
