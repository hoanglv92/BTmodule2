package BtColorable;

public class Square implements Colorable{
    private double side=2;
    private String color;


    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }


    public Square(double side, String color) {
        this.side = side;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", S="+getArea()+
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("color all four side");
    }
}
