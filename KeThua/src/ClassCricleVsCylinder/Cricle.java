package ClassCricleVsCylinder;

public class Cricle {
    private String color;
    private double radius;
    //get
    public String getColor(){
        return this.color;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return radius*2*Math.PI;
    }
    //set
    public void setColor(String color){
        this.color=color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }

    public Cricle(){
    }
    public Cricle(String color,double radius){
        this.color=color;
        this.radius=radius;
    }

}
