package LinnkedListStudent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class LinklistStudentManagerment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberStudent;
        String name;
        String id;
        int year;
        int luachon ;
        String location;
        System.out.println("nhập vào số học sinh:");
        numberStudent=sc.nextInt();
        sc.nextLine();
        System.out.println("nhập vào thông tin các học viện, theo thứ tự tên, mã học viên, tuổi, nơi ở:");
        LinkedList <Student> list=new LinkedList<Student>();
        for(int i=0;i<=numberStudent;i++){
            Student student=new Student(name=sc.nextLine(),id=sc.nextLine(),year=sc.nextInt(),location=sc.nextLine());
            list.add(student);
        }
//        Iterator<Student> std=list.iterator();
//        while (std.hasNext()){
//            System.out.println(std.next()+ " ,");
//        }
        disPlay(list);
        System.out.println("chọn tính năng bạn muốn:");
        System.out.println("1. thêm.");
        System.out.println("2. sửa.");
        System.out.println("3. xóa.");
        luachon=sc.nextInt();
        switch (luachon){
            case 1:
                addStudentForList(sc,list);
                break;
            case 2:
                editStudentForList(sc,list);
                break;
            case 3:
                removeStudentForList(sc,list);
            default:
                System.out.println("bạn không chọn tính năng nào.");
        }
    }
    public static void disPlay(LinkedList<Student>list){
        for(int i=0;i<list.size();i++){
            list.get(i).disPlay();
        }
    }
    public static void addStudentForList(Scanner scanner,LinkedList<Student> list){
        int vitri;
        System.out.println("bạn muốn thêm vào vị trí nào: ");
        vitri=scanner.nextInt();
        System.out.println("nhập thông tin cho đối tượng cần thêm:");
        Student student=new Student(scanner.nextLine(),scanner.nextLine(),scanner.nextInt(),scanner.nextLine());
        list.add(vitri,student);
        disPlay(list);
    }
    public static void removeStudentForList(Scanner scanner,LinkedList<Student> list){
        int vitri;
        System.out.println("nhập vị trí cần xóa:");
        vitri=scanner.nextInt();
        list.remove(vitri);
        disPlay(list);
    }
    public static void editStudentForList(Scanner scanner,LinkedList<Student>list){
        int vitri;
        System.out.println("nhập vị trí cần sửa thông tin : ");
        vitri=scanner.nextInt();
        System.out.println("nhập thông tin cần sửa:");
        Student student=new Student(scanner.nextLine(),scanner.nextLine(),scanner.nextInt(),scanner.nextLine());
        student=list.get(vitri);
        disPlay(list);
    }
}
