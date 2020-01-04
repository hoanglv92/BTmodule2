package ClassCricleVsCylinder;

public class Cylinder extends Cricle {
    private double height;
    public Cylinder(){

    }
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double height,double radius,String color){
        this.height=height;
        setColor(color);
        setRadius(radius);
    }
    public void setHeight(double height){
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getarea() {
        return 2*Math.PI*getRadius()*(getRadius()+height);
    }
    public String printCylinder(){
        return "Cylinder height:"+ height+"radius:"+getRadius()+"color :"+getColor();
    }


}
