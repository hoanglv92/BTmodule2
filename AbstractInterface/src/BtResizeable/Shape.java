package BtResizeable;

 abstract public class Shape implements Resizeable{
     String color="red";
     public int boder=1;


     public void setColor(String color) {
         this.color = color;
     }

     public String getColor() {
         return color;
     }

     public int getBoder() {
         return boder;
     }

     public void setBoder(int boder) {
         this.boder = boder;
     }
     abstract double getArea();
     abstract double getChuvi();

     @Override
     public String toString() {
         return "Shape{" +
                 "color='" + color + '\'' +
                 ", boder=" + boder +
                 '}';
     }

     @Override
     public void resize(double pacent) {

     }
 }
