package BtResizeable;

public class Cricle extends Shape implements Resizeable{
    private double radius;

    public Cricle() {
    }

    public Cricle(double radius, String color,int boder) {
        this.radius = radius;
        setColor(color);
        setBoder(boder);
    }
//get
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getChuvi(){
        return radius*2*Math.PI;
    }
//set
    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
//                ", color='" + color + '\'' +
                ",S="+String.valueOf(getArea())+
                ",Chu vi="+String.valueOf(getChuvi())+
                ", boder=" + boder +
                '}';
    }

    @Override
    public void resize(double pacent) {
        this.setRadius(getRadius()*pacent+getRadius());

    }
}
