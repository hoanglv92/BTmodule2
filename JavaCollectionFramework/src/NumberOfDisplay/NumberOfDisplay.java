package NumberOfDisplay;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfDisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào một chuỗi để tính số lần suất hiện của các từ.");
        String string=sc.nextLine();
        String[] arrayString= string.split("\\s");
        HashMap<String,Integer>hashMapString=new HashMap<String, Integer>();
        pushElementToHashMap(arrayString,hashMapString);
        showNumberOfDisPlay(hashMapString);
    }
    public static void pushElementToHashMap(String[] arrayString,HashMap<String,Integer>hashMapString){
        for(int i=0;i<arrayString.length;i++) {
            int cout=0;
            for (int j=0;j<arrayString.length;j++) {
                if (arrayString[i].equals(arrayString[j])) {
                    cout++;
                }
            }
            hashMapString.put(arrayString[i],cout);
        }
    }
    public static void showNumberOfDisPlay(HashMap<String,Integer>hashMapString){
        for (Map.Entry<String,Integer>stringIntegerEntry:hashMapString.entrySet()){
            String keyWord =stringIntegerEntry.getKey();
            int value=stringIntegerEntry.getValue();
            System.out.println("các từ:"+keyWord+"số lần :"+value);
        }
    }
}
