import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<PhoneBook>arrayListPhoneBook=new ArrayList<>();
        String srcReadFile="contacts.csv";
        String srcWriter="contactsNew.csv";
        Controller controller=new Controller();
        Menu(arrayListPhoneBook,scanner,controller,srcReadFile,srcWriter);
    }
    public static void Menu(ArrayList<PhoneBook>phoneBookArrayList, Scanner scanner,Controller controller,String srcReadFile,String srcWriter){
        final  int SHOW=1;
        final  int add=2;
        final  int edit=3;
        final  int remove=4;
        final  int search=5;
        final  int readToFile=6;
        final  int writerToFile=7;
        final  int exit=8;
        System.out.println("chon chuc nang theo so de tiep tuc:");
        System.out.println("1. xem danh sach");
        System.out.println("2. them moi");
        System.out.println("3. cap nhat");
        System.out.println("4.xoa");
        System.out.println("5.tim kiem");
        System.out.println("6.doc tu file");
        System.out.println("7.ghi vao file");
        System.out.println("8.thoat");
        System.out.println("Chon chuc nang: ");
        int select=scanner.nextInt();
        scanner.nextLine();
        switch (select){
            case SHOW:
                controller.readFileImportToArrayList(srcReadFile,phoneBookArrayList);
                controller.showPhonebook(phoneBookArrayList);
                break;
            case add:
                System.out.println("nhap sdt:");
                String sdt=scanner.nextLine();
                System.out.println("nhap ten");
                String name=scanner.nextLine();
                System.out.println("nhap gioi tinh:");
                String gender=scanner.nextLine();
                System.out.println("nhap email :");
                String email=scanner.nextLine();
                System.out.println("nhap nhom moi:");
                String group=scanner.nextLine();
                System.out.println("nhap dia chi moi:");
                String address=scanner.nextLine();
                controller.addPhoneBook(phoneBookArrayList,sdt,name,gender,email,address,group);
                System.out.println("them moi thanh cong");
                break;
            case edit:
                System.out.println("nhap vao so DT de tim :");
                int numberPhone=scanner.nextInt();
                scanner.nextLine();
                boolean check=controller.editPhoneBook(phoneBookArrayList,numberPhone,scanner);
                if (check){
                    controller.editPhoneBook(phoneBookArrayList,numberPhone,scanner);
                    System.out.println("sua thanh cong");
                }else {
                    System.out.println("sdt ban nhap ko co trong danh ba");
                }
                break;
            case remove:
                System.out.println("nhap sdt can xoa.");
                int numPhone=scanner.nextInt();
                scanner.nextLine();
                boolean check1=controller.remove(phoneBookArrayList,numPhone);
                if (check1) {
                    controller.remove(phoneBookArrayList,numPhone);
                    System.out.println("xoa thanh cong");
                }else {
                    System.out.println("sdt ban nhap ko co trong danh ba");
                }
                break;
            case search:
                System.out.println("nhap sdt can tim:");
                int numberPhone1=scanner.nextInt();
                if (controller.searchInt(phoneBookArrayList,numberPhone1)){
                    System.out.println("--");
                }else {
                    System.out.println("sdt ban nhap ko co trong danh ba");
                }
                break;
            case  readToFile:
                System.out.println("nhap duong dan toi file can doc:");
                String srcReadFile1=scanner.nextLine();
                controller.readFileImportToArrayList(srcReadFile1,phoneBookArrayList);
                controller.showPhonebook(phoneBookArrayList);
                break;
            case writerToFile:
                System.out.println("nhap duong dan luu file:");
                String writerToFile1=scanner.nextLine();
                controller.writerFileCsvImportToArrayList(phoneBookArrayList,writerToFile1);
                break;
            case exit:
                controller.writerFileCsvImportToArrayList(phoneBookArrayList,srcWriter);
                System.exit(0);
            default:
                controller.writerFileCsvImportToArrayList(phoneBookArrayList,srcWriter);
                System.exit(0);

        }
        Menu(phoneBookArrayList,scanner,controller,srcReadFile,srcWriter);
    }
}
