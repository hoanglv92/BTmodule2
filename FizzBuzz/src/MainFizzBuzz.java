import java.util.Scanner;

public class MainFizzBuzz {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("hãy nhập vào một số : ");
             number=sc.nextInt();
        }while (number<=0);
        FizzBuzz fizzBuzz=new FizzBuzz(number);
        fizzBuzz.stranLateNumber(number);
    }
}
