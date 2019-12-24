import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("number :");
        int number=scanner.nextInt();
        if(number<2){
            System.out.println(number + "number is not pr");
        }else {
            int i=2;
            boolean check=true;
            for(;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    check=false;
                }
            }
            if(check){
                System.out.println(number + "number is prime");
            }else {
                System.out.println(number + "number is not prime");
            }
        }
    }
}
