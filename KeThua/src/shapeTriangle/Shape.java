package shapeTriangle;

public class Shape {
    private String color;
    private double height;
    public Shape(){

    }
    public Shape(String color,double height){
        this.color=color;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                "height="+height+ '\'' +
                '}';
    }
}
