import java.util.Scanner;

public class MainPlindroma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vào một chuỗi bất kì : ");
        String string=sc.nextLine();
        Palindrome palindrome=new Palindrome(string);
        if(palindrome.isPalindrome(string)){
            System.out.println("là chuỗi đối xứng.");
        }else {
            System.out.println("không là chuỗi đối xứng.");
        }
    }
}
