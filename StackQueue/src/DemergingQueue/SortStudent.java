package DemergingQueue;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class SortStudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào số sinh viên:");
        int numberStudent=sc.nextInt();
        sc.nextLine();
        System.out.println("nhập vào thông tin sinh viên.");
        LinkedList<Student>studentLinkedList=new LinkedList<>();
        sortListByGender(studentLinkedList);    
        for(int i=0;i<numberStudent;i++){
            System.out.println("nhập tên Sv thứ :"+(i+1));
            String name=sc.nextLine();
            System.out.println("nhập id:");
            String id=sc.nextLine();
            System.out.println("nhập giói tính:");
            String gender=sc.nextLine();
            System.out.println("nhập năm sinh :");
            String dateOfBirth=sc.nextLine();
            Student student=new  Student(name,id,gender,dateOfBirth);
            studentLinkedList.add(student);
        }
        Queue<Student>studentQueueMale=new LinkedList<Student>();
        studentPushTostudentQueueMale(studentLinkedList,studentQueueMale);
        Queue<Student>studentQueueFemale=new LinkedList<Student>();
        studentPushTostudentQueueFeMale(studentLinkedList,studentQueueFemale);
        LinkedList<Student>studentLinkedListNew=new LinkedList<Student>();
        pushToStudentLinkedListNew(studentQueueMale,studentQueueFemale,studentLinkedListNew);
        for(Student st:studentLinkedListNew){
            st.disPlay();
        }
    }
    public  static void sortListByGender(LinkedList<Student>studentLinkedList){
        Collections.sort(studentLinkedList,new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getDateOfBirth().compareTo(student2.getDateOfBirth());
            }
        });
        System.out.println("List is sorted");
    }
    public static void studentPushTostudentQueueMale(LinkedList<Student>studentLinkedList,Queue<Student>studentQueueMale){
        for(Student st:studentLinkedList){
            if(st.getGender().equals("nam")){
                studentQueueMale.add(st);
            }
        }
    }
    public static void studentPushTostudentQueueFeMale(LinkedList<Student>studentLinkedList,Queue<Student>studentQueueFemale){
        for(Student student:studentLinkedList){
            if(student.getGender().equals("nu")){
                studentQueueFemale.add(student);
            }
        }
    }
    public static void pushToStudentLinkedListNew(Queue<Student>studentQueueMale,Queue<Student>studentQueueFemale,LinkedList<Student>studentLinkedListNew){
        while (!studentQueueFemale.isEmpty()){
            studentLinkedListNew.add(studentQueueFemale.poll());
        }
        while (!studentQueueMale.isEmpty()){
            studentLinkedListNew.add(studentQueueMale.poll());
        }
    }

}
