package Prime;

import java.util.Scanner;

public class TestPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào vị trí số nguyên tố cần tìm : ");
        int number;
        number=sc.nextInt();
        FindPrime findPrime=new FindPrime(number);
        System.out.println("số cần tìm là : ");
        System.out.println(FindPrime.findValue(number));
    }
}
