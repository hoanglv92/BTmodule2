import java.util.Scanner;
public class CalculaterBmi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("weight :");
        weight=scanner.nextDouble();
        System.out.println("height :");
        height=scanner.nextDouble();
        bmi=weight/height*height;
        if(bmi<18.5){
            System.out.println("bạn gầy");
        }else if(bmi<25.0){
            System.out.println("bạn bình thường");
        }else if (bmi<30.0){
            System.out.println("bạn hơi béo");
        }else {
            System.out.println("bạn quá béo");
        }
    }
}
