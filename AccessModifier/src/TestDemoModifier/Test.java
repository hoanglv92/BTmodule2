package TestDemoModifier;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius;
        do{
             radius=sc.nextDouble();
            System.out.println("nhập bán kính : ");
        }while (radius<=0);
        Circle circle=new Circle();
        System.out.println("bán kính hình tròn : "+ circle.getRadius());
        System.out.println("diện tích : "+ circle.getArea());
    }
}
class Circle{
    private double radius=1.0;
    private String color="red";
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
}
//