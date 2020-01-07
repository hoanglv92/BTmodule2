package BtResizeable;

public class Square extends Shape implements Resizeable {
    private double side;

    public Square() {
    }

    public Square(double side,String color,int boder) {
        this.side = side;
        setColor(color);
        setBoder(boder);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public double getChuvi() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
//                ", color='" + color + '\'' +
                ",area=" +String.valueOf(getArea())+
                ",chu vi="+ String.valueOf(getChuvi())+
                ", boder=" + boder +
                '}';
    }

    @Override
    public void resize(double pacent) {
        setSide(getSide()*pacent);
    }
}
