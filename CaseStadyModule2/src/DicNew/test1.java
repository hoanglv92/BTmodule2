package DicNew;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("123");
        arrayList.add("35");
        arrayList.add("335");
        arrayList.add("23");
        System.out.println("nhap so number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(ischeck(arrayList,number));
        int i = 1;
        while(i < 5){
            if(i % 3 != 0){
                i++;
                continue;
            }
            System.out.println("Hello");
            i++;
        }
    }
    public static boolean ischeck(ArrayList<String>arrayList,int number){
        boolean check=false;
        for (int i=0;i<arrayList.size();i++){
            if (Integer.parseInt(arrayList.get(i))==number){
                check=true;
            }
        }
        return check;
    }

}
