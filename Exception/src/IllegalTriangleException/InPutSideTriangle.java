package IllegalTriangleException;

import java.util.Scanner;

public class InPutSideTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 3 cạnh của tam giác.");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        try {
            checkTriangle(side1,side2,side3);
            System.out.println("Độ dài 3 cạnh của tam giác là: "+"cạnh 1: "+side1+" , cạnh 2: "+side2+", cạnh 3: "+side3);
        }catch ( Exception IllegalTriangleException ){
            System.out.println("có lỗi :"+IllegalTriangleException);
        }
    }
    public static void checkTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleException("bạn nhập một cạnh nhỏ hơn không hoặc 2 cạnh bất bì không lớn hơn cạnh còn lại.");
        }
    }
}
class IllegalTriangleException extends Exception{
    IllegalTriangleException(String s){
        super(s);
    }
}

