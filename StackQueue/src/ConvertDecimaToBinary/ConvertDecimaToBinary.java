package ConvertDecimaToBinary;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimaToBinary {
    public static void main(String[] args) {
        System.out.println("nhập vào số cần chuyển từ hệ thập phân sang hê nhị phân:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        Stack <Integer>binaryArray=new Stack<Integer>();
        int cout=0;
        while (number!=0) {
                binaryArray.push(number % 2);
                number = number / 2;
                cout++;
            }
        for(int x:binaryArray){
            System.out.println(x);
        }
//        System.out.println(cout);
        int [] binary=new int[cout];
        System.out.println("chuyên từ số nhập vào thành hệ nhị phân :");
        for (int i = 0; i < binary.length; i++) {
            binary[i]=binaryArray.pop();
        }
        for (int i = 0; i < binary.length; i++){
            System.out.print(binary[i]);
        }
    }
}
