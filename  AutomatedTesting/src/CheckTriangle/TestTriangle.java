package CheckTriangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào 3 cạnh của tam giác:");
        System.out.println("side1=");
        side1=sc.nextInt();
        System.out.println("side2=");
        side2=sc.nextInt();
        System.out.println("side3=");
        side3=sc.nextInt();
        CheckTriangle checkTriangle=new CheckTriangle(side1,side2,side3);
        checkTriangle.checkTriangle(side1,side2,side3);
    }
}
