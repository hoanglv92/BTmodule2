import java.util.Scanner;
public class ConvertManny {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("usd :");
        long usd=scanner.nextLong();
        long vnd;
        if(usd<=0){
            System.out.println("bạn phải nhập số tiền lớn hon 0");
        }else {
            vnd=usd*23000;
            System.out.println("vnd :"+vnd);
        }
    }
}
