package Factorya;

import java.util.Scanner;

public class testFactorya {
    public static void main(String[] args) {
        System.out.println("Factorial calculation program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:");
        int number = scanner.nextInt();
        Factorya factorya=new Factorya(number);
        long fact=factorya.factorial(number);
        System.out.println(fact);
    }
}
