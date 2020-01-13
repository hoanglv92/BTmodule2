package ReverseArrayIntnumber;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số phần tử mong muốn của mảng:");
        int number=sc.nextInt();
        int[]array=new int[number];
        System.out.println("nhập vào các phần tử của mảng, là các số:");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("mảng nhập vào:");
        for( int x :array){
            System.out.println(x);
        }
        Stack <Integer> arrStack=new Stack<Integer>();
        for(int i=0;i<array.length;i++){
            arrStack.push(array[i]);
        }
        System.out.println("mảng sau khi đảo ngược.");
        for(int i=0;i<array.length;i++){
                int temp =0;
                temp= arrStack.pop();
                array[i]=temp;
        }
        for( int x :array){
            System.out.println(x);
        }
    }
}
