package shapeTriangle;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        String color;
        double height;
        double side1;
        double side2;
        double side3;
        Scanner sc=new Scanner(System.in);
        System.out.println("color: ");
        color=sc.nextLine();
        System.out.println("height:");
        height=sc.nextDouble();
        Shape shape=new Shape(color,height);
        System.out.println(shape.toString());
        System.out.println("side1 :");
        side1=sc.nextDouble();
        System.out.println("side2 :");
        side2=sc.nextDouble();
        System.out.println("side3 :");
        side3=sc.nextDouble();
        Triangle triangle=new Triangle(3,4,5,shape.getColor(),shape.getHeight());
        System.out.println(triangle.toString());

    }
}
