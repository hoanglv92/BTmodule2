package shapeTriangle;

public class Triangle extends Shape {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;
    public Triangle(){

    }
    public Triangle(double side1,double side2, double side3,String color,double height){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        setColor(color);
        setHeight(height);
    }
//get
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public double getArea(){
        return getHeight()*side1*(0.5);
    }
    public double getChivi(){
        return side1+side2+side3;
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ",area="+getArea()+
                ",chuvi="+getChivi()+
                ",color="+getColor()+
                '}';
    }
    //set

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
