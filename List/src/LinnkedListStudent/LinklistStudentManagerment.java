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
        String year;
        int luachon ;
        String location;
        System.out.println("nhập vào số học sinh:");
        numberStudent=sc.nextInt();
        sc.nextLine();
        System.out.println("nhập vào thông tin các học viện, theo thứ tự tên, mã học viên, tuổi, nơi ở:");
        LinkedList <Student> list=new LinkedList<Student>();

        for(int i=0;i<numberStudent;i++){
            Student student=new Student(name=sc.nextLine(),id=sc.nextLine(),year=sc.nextLine(),location=sc.nextLine());
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
        System.out.println("4. tìm kiếm");
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
                break;
            case 4:
                searStudent(list,sc);
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
        scanner.nextLine();
        System.out.println("nhập thông tin cho đối tượng cần thêm:");
        Student student=new Student(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
        list.add(vitri,student);
        disPlay(list);
    }
    public static void removeStudentForList(Scanner scanner,LinkedList<Student> list){
        System.out.println("nhập vị trí cần xóa:");
        int vitri=scanner.nextInt();
        scanner.nextLine();
        list.remove(vitri);
        disPlay(list);
    }
    public static void editStudentForList(Scanner scanner,LinkedList<Student>list){
        int vitri;
        System.out.println("nhập vị trí cần sửa thông tin : ");
        vitri=scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập thông tin cần sửa:");
        Student student=new Student(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
        student=list.set(vitri,student);
        disPlay(list);
    }
    public static void searStudent(LinkedList<Student>list,Scanner scanner){
        System.out.println("bạn muốn tìm theo các nào:");
        System.out.println("vị trí 1:");
        System.out.println("tên học viên 2");
        System.out.println("mã học viên 3:");
        int number=scanner.nextInt();
        scanner.nextLine();
        switch (number){
            case 1:
                int vitri=scanner.nextInt();
                scanner.nextLine();
                System.out.println("nhập vị trí cần tìm:");
                int temp=0;
                for(int i=0;i<list.size();i++){
                    if(i==vitri){
                        list.get(i).disPlay();
                        temp++;
                    }
                }
                if(temp==0){
                    System.out.println("không tìm thấy.");
                }
                break;
            case 2:
                System.out.println("nhập tên cần tìm");
                String name=scanner.nextLine();
                int temp1=0;
                for(int i=0;i<list.size();i++){
                    if(list.get(i).getName().equals(name)){
                        list.get(i).disPlay();
                        temp1++;
                    }
                }
                if(temp1==0){
                    System.out.println("không tìm thấy.");
                }
                break;
            case 3:
                System.out.println("nhập id cần tìm:");
                String id=scanner.nextLine();
                int temp2=0;
                for(int i=0;i<list.size();i++){
                    if(list.get(i).getId().equals(id)){
                        list.get(i).disPlay();
                        temp2++;
                    }
                }
                if(temp2==0){
                    System.out.println("không tìm thấy.");
                }
                break;
            default:
                System.out.println("ko lựa chọn tính năng nào.");
        }


    }
}
