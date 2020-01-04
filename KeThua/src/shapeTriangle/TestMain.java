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
        do {
            System.out.println("height:");
            height=sc.nextDouble();
        }while (height<0);

        Shape shape=new Shape(color,height);
        System.out.println(shape.toString());
        do {
            System.out.println("side1 :");
            side1=sc.nextDouble();
        }while (side1<0);

        do {
            System.out.println("side2 :");
            side2=sc.nextDouble();
        }while (side2<0);

        do {
            System.out.println("side3 :");
            side3=sc.nextDouble();
        }while (side3<0);

        Triangle triangle=new Triangle(3,4,5,shape.getColor(),shape.getHeight());
        System.out.println(triangle.toString());

    }
}
