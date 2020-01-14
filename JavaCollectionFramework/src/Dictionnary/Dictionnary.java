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
        final int ADD_ELEMENT=3;
        final int REMOVE_ELEMENT=4;
        final int REPAIR_ELEMENT=5;
        System.out.println("nhập tính năng muốn chọn:");
        System.out.println("1.hiển thị từ điển.");
        System.out.println("2. tìm từ theo key");
        System.out.println("3. thêm từ vào từ điển.");
        System.out.println("4. xóa 1 từ khỏi từ điển.");
        System.out.println("5. sửa lại một từ trong từ điển");
        int numberSelection=scanner.nextInt();
        scanner.nextLine();
        switch (numberSelection){
            case SHOW_DICTIONARY :
                showDictionnary(listDictionary);
                break;
            case FIND_KEY_DICTIONARY :
                findKeyInDictionary(listDictionary,scanner);
                break;
            case ADD_ELEMENT:
                addElementForDictionary(listDictionary,scanner);
                break;
            case REMOVE_ELEMENT:
                removeElementForDictionary(listDictionary,scanner);
                break;
            case REPAIR_ELEMENT:
                repairElementForDictionary(listDictionary,scanner);
                break;
            default:
                System.out.println("hãy chọn lại.");

        }
        System.out.println("nhập 1 để tiếp tục chọn tính năng khác, nếu không nhấn phím bất kì để tắt chương trình.");
        int temp=scanner.nextInt();
        switch (temp){
            case 1:
                showMenu(scanner,listDictionary);
                break;
            default:
                System.out.println("kết thúc chương trình");
        }

    }
    public static void addElementForDictionary(HashMap<String,String>listDictionary , Scanner scanner){
        System.out.println("nhập từ tiếng anh cần thêm:");
        String key=scanner.nextLine();
        System.out.println("nhập nghĩa tiếng việt của từ mới thêm:");
        String value=scanner.nextLine();
        for(Map.Entry<String,String>list:listDictionary.entrySet()){
            if(list.getKey().equals(key)){
                System.out.println("đã có từ :"+key+ " trong từ điển, nếu bạn vẫn muốn thêm thì nghĩa của từ cũ sẽ bị thay đổi. ");
                System.out.println("bạn chắc muốn sửa, chọn 1 nếu muốn sửa. ấn phím 2 để thoát");
                int temp=scanner.nextInt();
                switch (temp){
                    case 1:
                        listDictionary.put(key,value);
                        break;
                    default:
                        System.out.println("kết thúc");
                }

            }else {
                listDictionary.put(key,value);
                break;
            }
        }
        showDictionnary(listDictionary);
    }
    public static void removeElementForDictionary(HashMap<String,String>listDictionary , Scanner scanner){
        System.out.println("nhập key cần xóa khỏi từ điển");
        String key=scanner.nextLine();
        boolean is =false;
        for(String k:listDictionary.keySet()){
            if(k.equals(key)){
                listDictionary.remove(k);
                is=true;
                break;
            }
        }
        if(!is){
            System.out.println("ko tìm thấy");
        }
    }
    public static void repairElementForDictionary(HashMap<String,String>listDictionary , Scanner scanner){
        System.out.println("nhập từ cần sửa");
        String string=scanner.nextLine();
        for(Map.Entry<String,String>list:listDictionary.entrySet()){
            if(list.getKey().equals(string)){
                System.out.println("nhập nghĩa tiếng việt của từ cần sửa.");
                String value=scanner.nextLine();
                listDictionary.put(string,value);
                break;
            }
        }
    }

}

