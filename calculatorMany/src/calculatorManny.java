import java.util.Scanner;
public class calculatorManny {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("tiền vay :");
        double tienvay=scanner.nextDouble();
        System.out.println("số tháng vay :");
        int sothang=scanner.nextInt();
        System.out.println("lãi xuất :");
        double laix=scanner.nextDouble();
        double tienlai=tienvay*(laix/100)/12*sothang;
        System.out.println("lãi xuất là :"+tienlai);
    }
}
