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
                System.out.println("nhap tu can dich: ");
                String english = scanner.nextLine();
                String mess="nhap vao tu can dich moi";
                String mess1="nhap vao phien am va nghia cua tu do:";
                controller1.stranlate(dictionary,scanner,english,mess,mess1);
                break;
            case add:
                System.out.println("nhap vao tu tieng anh:");
                String engKey1=scanner.nextLine();
                System.out.println("nhap vao phien am va nghia cua tu do:");
                String valuatemp1 = scanner.nextLine();
                controller1.addInDic(dictionary,scanner,src,engKey1,valuatemp1);
                break;
            case edit:
                String mess3="nhap vao tu can sua:";
                String mess4="nhap phien am va nghia cua tu:";
                String mess5="tu can sua khong co trong tu dien.chon 1 de hien goi y cac tu gan dung,so khac thoat.";
                String mess6="nhap lai tu can sua.";
                String mess7="nhap phien am va nghia cua tu:";
                String mess8="tu ban nhap lai van ko dung, chuong trinh se thoat khoi tinh nang.";
                String mess9="ban da huy khong chon.";
                controller1.editInDic(dictionary,scanner,src,mess3,mess4,mess5,mess6,mess7,mess8,mess9);
                break;
            case remove:
                System.out.println("nhap tu can xoa:");
                String english1 = scanner.nextLine();
                String mess10=" tu ban nhap ko co trong tu dien, nhap 1 de hien thi goi y:";
                String mess11="nhap lai tu can xoa:";
                String mess12="tu ban nhap lai van ko dung, chuong trinh se thoat.";
                String mess13="ban da huy ko hien goi y.";
                controller1.removeElementInDic(dictionary,scanner,src,english1,mess10,mess11,mess12,mess13);
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
