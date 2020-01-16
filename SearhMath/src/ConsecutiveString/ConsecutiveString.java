package ConsecutiveString;

import java.util.Scanner;

public class ConsecutiveString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào một chuỗi bất kì liên tiếp");
        String string =sc.nextLine();
        char[]stringToChar=new char[string.length()];
        for(int i=0;i<stringToChar.length;i++){
            stringToChar[i]=string.charAt(i);
        }
        for (int i=0;i<stringToChar.length-1;i++){
            for(int j=1;j<stringToChar.length;j++){
                if((int)stringToChar[i]<(int)stringToChar[j]){
                    
                }
            }
        }

    }
    public static int numberOfImpressions(char[]arr,int min, int max){
        int cout=0;
        int temp=0;
        min=arr[0];
        max=arr.length-1;
        if(min<=max){
            if(arr[0]<arr[++temp]){
                cout+=1;
                numberOfImpressions(arr,arr[++temp],max);
            }else {

                numberOfImpressions(arr,arr[++temp],max);
                return cout;
            }
        }
        return -1;
    }
}
