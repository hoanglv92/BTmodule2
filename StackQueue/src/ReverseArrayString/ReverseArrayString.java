package ReverseArrayString;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        String[] world=string.split("\\s");
        System.out.println("mảng được chũ đuọc nhập vào:");
        for(String w :world){
            System.out.println(w);
        }
        Stack<String>arr=new Stack<String>();
        for(int i=0;i<world.length;i++){
            arr.push(world[i]);
        }
        System.out.println("mảng chũ sau khi đảo ngược:");
        for (int i=0;i<world.length;i++){
            world[i]=arr.pop();
        }
        for(String w :world){
            System.out.println(w);
        }
    }
}
