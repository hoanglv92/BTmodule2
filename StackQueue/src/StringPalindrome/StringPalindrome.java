package StringPalindrome;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào một chuỗi:");
        String string = sc.nextLine();
        char[] charsToString = new char[string.length()];
        for (int i = 0; i < charsToString.length; i++) {
            charsToString[i] = string.charAt(i);
        }
//        for (char x : charsToString) {
//            System.out.println(x);
//        }
        Stack<Character> stackchar = new Stack<>();
        for (int i = 0; i < charsToString.length; i++) {
            stackchar.push(charsToString[i]);
        }
        char []charsToString1=new char[string.length()];
        for (int i = 0; i < charsToString1.length; i++){
            charsToString1[i]=stackchar.pop();
        }
//        for (char x : charsToString1) {
//            System.out.println(x);
//        }

//        while (!stackchar.empty()){
//            System.out.println(stackchar.pop());
//        }
        char[]charsToString2=new char[string.length()];
        Queue <Character>charactersqQueue=new LinkedList<Character>();
        for (int i = 0; i < charsToString.length; i++){
            charactersqQueue.add(charsToString[i]);
        }
        for (int i = 0; i < charsToString2.length; i++){
            charsToString2[i]=charactersqQueue.poll();
        }
//        for (char x : charsToString2) {
//            System.out.println(x);
//        }
        int cout=0;
        for (int i = 0; i < charsToString.length; i++){
            if(charsToString1[i]==charsToString2[i]){
                cout++;
            }
        }
        if(cout==charsToString.length){
            System.out.println("là chuỗi Plindroma ");
        }else {
            System.out.println("không là chuỗi Plindroma");
        }
    }
}
