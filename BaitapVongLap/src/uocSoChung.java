import java.util.Scanner;

public class uocSoChung {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập 1 số :");
        int fistNum=scanner.nextInt();
        System.out.println("nhập số thứ 2 :");
        int lastNum=scanner.nextInt();
        fistNum=Math.abs(fistNum);
        lastNum=Math.abs(lastNum);
        if (fistNum==0&&lastNum==0){
            System.out.println("bạn nhập 2 số 0 nên không có ước chung lớn nhất");
        }
        while (fistNum!=lastNum){
                if(fistNum>lastNum){
                    fistNum=fistNum-lastNum;
                }else {
                    lastNum=lastNum-fistNum;
                }
        }
            System.out.println("ước số chung lớn nhất là : "+fistNum);

    }
}
