package AllProperty;

public class Villa extends Residental{
    protected int levels = 1;

    public Villa(String address, double area, double price, int parkingLots, int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if(levels<1){return;}
        this.levels = levels;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "levels=" + levels +
                '}'+super.toString();
    }
}
