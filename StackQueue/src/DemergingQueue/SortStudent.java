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
        for(int i=0;i<numberStudent;i++){
            System.out.println("nhập tên:");
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
        Queue<Student>studentQueueFemale=new LinkedList<Student>();

        LinkedList<Student>studentLinkedListNew=new LinkedList<Student>();
        public void sortListByGender(LinkedList<Student>studentLinkedListNew) {
            studentLinkedListNew.sort(new Comparator<Student>() {
                @Override
                public int compare(Student student1, Student student2) {
                    return student1.getGender().compareTo(student2.getGender());
                }
            });
            System.out.println("List is sorted");
        }

            for(Student st:studentLinkedList){
            if(st.getGender().equals("nam")){
                studentQueueMale.add(st);
            }
        }
    }

}
