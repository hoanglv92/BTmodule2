package CheckBrackets;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào biểu thức để kiểm tra các dấu ngoặc có hợp lệ:");
        String string=sc.nextLine();
        char [] charsToString=new char[string.length()];
        for (int i=0;i<charsToString.length;i++){
            charsToString[i]=string.charAt(i);
        }
        Stack<Character>characterStack=new Stack<Character>();
        for (int i=0;i<charsToString.length;i++){
            if(charsToString[i]==(int)')'||charsToString[i]!=((int)'(')){
                characterStack.push(charsToString[i]);
                break;
            }
        }
        if(characterStack.pop()==(int)')'){
            System.out.println("biểu thức có dấu ngoặc không hợp lệ.");
        }else {
            for (int i=0;i<charsToString.length;i++){
                if(charsToString[i]==(int)'('){
                    characterStack.push(charsToString[i]);
                }
            }
            for(int i=0;i<charsToString.length;i++){
                if(charsToString[i]==(int)')'){
                    characterStack.pop();
                }
            }
            if(!characterStack.empty()){
                System.out.println("biểu thức không hợp lệ.");
            }else {
                System.out.println("biểu thức hợp lệ.");
            }

        }
    }
}
