package BtResizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double heght;

    public Rectangle() {
    }

    public Rectangle(double width, double heght,String color, int boder) {
        this.width = width;
        this.heght = heght;
        setBoder(boder);
        setColor(color);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeght() {
        return heght;
    }

    public void setHeght(double heght) {
        this.heght = heght;
    }

    @Override
    public double getArea() {
        return this.width*this.heght;
    }
    public double getChuvi(){
        return  (this.heght+this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", heght=" + heght +
                ", color='" + color + '\'' +
                ",S="+String.valueOf(getArea())+
                ",Chu vi="+String.valueOf(getChuvi())+
                ", boder=" + boder +
                '}';
    }

    @Override
    public void resize(double pacent) {
      this.setHeght(getHeght()*pacent);
      this.setWidth(getWidth()*pacent);

    }
}
