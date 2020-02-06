import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String src="anhviet.txt";
        HashMap<String,String> dictionary=new HashMap<String, String>();
        Controller1 controller1=new Controller1();
        controller1.readTxtImportToHashMap(src,dictionary);
        menuController(dictionary,scanner,controller1,src);
    }
    public static void menuController(HashMap<String,String> dictionary, Scanner scanner, Controller1 controller1, String src) throws IOException {
        final int stranlate=1;
        final int add=2;
        final int edit=3;
        final int remove=4;
        final int show=5;
        System.out.println("chon tinh nang :");
        System.out.println("1 :  stranlate");
        System.out.println("2 : them tu vao tu dien");
        System.out.println("3 :sua lai 1 tu trong tu dien");
        System.out.println("4 :xoa 1 tu");
        System.out.println("5 :hien thi toan bo tu dien");
        int select=scanner.nextInt();
        scanner.nextLine();
        switch (select){
            case stranlate:
                controller1.stranlate(dictionary,scanner);
                break;
            case add:
                controller1.addInDic(dictionary,scanner,src);
                break;
            case edit:
                controller1.editInDic(dictionary,scanner,src);
                break;
            case remove:
                controller1.removeElementInDic(dictionary,scanner,src);
                break;
            case show:
                controller1.showHashMap(dictionary);
                break;
            default:
                System.out.println("ban khong chon tinh nang nao,chuong trinh se tat.");
                controller1.overrideFileDic(dictionary,src);
                System.exit(0);
        }
        menuController(dictionary, scanner, controller1, src);
    }
}
