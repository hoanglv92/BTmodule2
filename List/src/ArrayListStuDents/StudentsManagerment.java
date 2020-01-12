package ArrayListStuDents;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class
StudentsManagerment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList <Student> studentArrayList=new ArrayList();
        inputStudent(studentArrayList);
        for(int i=0;i<studentArrayList.size();i++){
            studentArrayList.get(i).disPlay();
        }
        System.out.println("chọn các tính năng:");
        System.out.println("1. thêm ");
        System.out.println("2. sửa.");
        System.out.println("3. xóa");
        System.out.println("4. tìm kiếm");
        int number=scanner.nextInt();
        switch (number){
            case 1:
                addEplement(studentArrayList);
                break;
            case 2:
                editEmplement(studentArrayList);
                break;
            case 3:
                removeEmplement(studentArrayList);
                break;
            case 4:
                searStudent(scanner,studentArrayList);
                break;
            default:
                System.out.println("bạn không chọn tính năng nào.");
        }
    }
    public static void addEplement(ArrayList <Student> stArraylist){
        Scanner sc=new Scanner(System.in);
        int index;
        System.out.println("nhập vị trí cần thêm : ");
        index=sc.nextInt();
        System.out.println("nhập vào student mới : ");
        Student student4 = new Student();
        inputObjStudent(student4);
        stArraylist.add(index, student4);
        for(int i=0;i<stArraylist.size();i++){
            stArraylist.get(i).disPlay();
        }

    }
    public static void removeEmplement(ArrayList <Student> stArrayList){
        Scanner sc=new Scanner(System.in);
        int index;
        System.out.println("nhập vị trí cần xóa: ");
        index=sc.nextInt();
        stArrayList.remove(index);
        for(int i=0;i<stArrayList.size();i++){
            stArrayList.get(i).disPlay();
        }
    }
    public static void editEmplement(ArrayList <Student> stArrayList ){
       Scanner sc=new Scanner(System.in);
       Student student5=new Student();
        int index;
        System.out.println("nhập vị trí cần sửa:");
        index=sc.nextInt();
        student5=(stArrayList).get(index);
          inputObjStudent(student5);
        for(int i=0;i<stArrayList.size();i++){
            stArrayList.get(i).disPlay();
        }
    }
    public static void inputStudent(ArrayList stuArrayList){
        Student student1=new Student();
        inputObjStudent(student1);
        Student student2=new Student();
        inputObjStudent(student2);
        Student student3=new Student();
        inputObjStudent(student3);
        stuArrayList.add(student1);
        stuArrayList.add(student2);
        stuArrayList.add(student3);
    }
    public static void inputObjStudent(Student student){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập tên học viên:");
        student.setName(sc.nextLine());
        System.out.println("mã học viên:");
        student.setId(sc.nextLine());
        System.out.println("Tuổi:");
        student.setYear(sc.nextInt());
        sc.nextLine();
        System.out.println("Nơi ở:");
        student.setLocation(sc.nextLine());
    }
    public static void searStudent(Scanner scanner,ArrayList<Student>studentArrayList){
        System.out.println("bạn muốn tìm theo cách nào?");
        System.out.println("1. theo vị trí.");
        System.out.println("2. theo tên học viên.");
        System.out.println("3.theo mã học viên");
        int number=scanner.nextInt();
        scanner.nextLine();
        switch (number){
            case 1:
                System.out.println("nhập vị trí muốn tìm:");
                int vitri= scanner.nextInt();
                int temp=0;
                for(int i=0;i<studentArrayList.size();i++){
                    if(vitri==i){
                        studentArrayList.get(i).disPlay();
                        temp++;
                    }
                }
                if(temp==0){
                    System.out.println("không tìm thấy.");
                }
                break;
            case 2:
                System.out.println("nhập vào tên cần tìm kiếm.");
                String name=scanner.nextLine();
                int temp1=0;
                for(int i=0;i<studentArrayList.size();i++){
                    if(studentArrayList.get(i).getName().equals(name)){
                        studentArrayList.get(i).disPlay();
                        temp1++;
                    }
                }
                if(temp1==0){
                    System.out.println("không tìm thấy");
                }
                break;
            case 3:
                System.out.println("nhập mã học viên cần tìm:");
                String id=scanner.nextLine();
                int temp2=0;
                for (int i=0;i<studentArrayList.size();i++){
                    if(studentArrayList.get(i).getId().equals(id)) {
                        studentArrayList.get(i).disPlay();
                        temp2++;
                    }
                }
                if(temp2==0){
                    System.out.println("không tìm thấy.");
                }
                break;
            default:
                System.out.println("bạn không chọn tính nang tìm kiếm nào.");
        }
    }
}
