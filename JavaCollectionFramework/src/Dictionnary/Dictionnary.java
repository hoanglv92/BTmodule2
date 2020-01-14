package Dictionnary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionnary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,String>listDictionary=new HashMap<String, String>();
        listDictionary.put("Hello","Xin chào");
        listDictionary.put("Good Bye","Tạm Biệt");
        listDictionary.put("Thark","Cảm ơn");
        listDictionary.put("Next","Tiếp theo");
        listDictionary.put("Back","Đăng sau");
        listDictionary.put("Love","Yêu");
        showMenu(sc,listDictionary);
    }
    public static void showDictionnary(HashMap<String,String>listDictionary){
        for(Map.Entry<String,String>entry:listDictionary.entrySet()){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println("key : "+key+"="+"value : "+value);
        }
    }
    public static void findKeyInDictionary(HashMap<String,String>listDictionary , Scanner scanner){
        System.out.println("nhập vào từ cần dịch :");
        String keyWord=scanner.nextLine();
        if(listDictionary.containsKey(keyWord)){
            System.out.println(listDictionary.get(keyWord));
        }else {
            System.out.println("không tìm thấy.");
        }
    }
    public static void showMenu(Scanner scanner,HashMap<String,String>listDictionary){
        final int SHOW_DICTIONARY=1;
        final int FIND_KEY_DICTIONARY=2;
        System.out.println("nhập tính năng muốn chọn:");
        System.out.println("1.hiển thị từ điển.");
        System.out.println("2. tìm từ theo key");
        int numberSelection=scanner.nextInt();
        scanner.nextLine();
        switch (numberSelection){
            case SHOW_DICTIONARY :
                showDictionnary(listDictionary);
                break;
            case FIND_KEY_DICTIONARY :
                findKeyInDictionary(listDictionary,scanner);
                break;
            default:
                System.out.println("hãy chọn lại.");

        }
        showMenu(scanner,listDictionary);
    }
}

