package ArrayListStuDents;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class StudentsManagerment {
    public static void main(String[] args) {
        ArrayList <Student> studentArrayList=new ArrayList();
        inputStudent(studentArrayList);
        for(int i=0;i<studentArrayList.size();i++){
            studentArrayList.get(i).disPlay();
        }
        addEplement(studentArrayList);
        editEmplement(studentArrayList);


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
}
