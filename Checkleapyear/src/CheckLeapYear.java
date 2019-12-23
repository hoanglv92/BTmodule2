import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" year :");
        int year=scanner.nextInt();
        if(year%4==0&&year%100!=0){
            System.out.println("year là năm nhuận");
        }
        if(year%100==0&&year%400!=0){
            System.out.println("year không là năm nhuận");
        }
        if (year%100==0&&year%400==0){
            System.out.println("year là năm nhuận");
        }
    }
}
