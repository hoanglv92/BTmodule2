import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void readFileTxt(String src, ArrayList<Student>arrayList) {
        try {
            File file=new File(src);
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String textInLine;
            String [] str;
            while ((textInLine=bufferedReader.readLine())!=null){
                str=textInLine.split(";");
                Student student=new Student(str[1],str[0],str[2],str[3]);
                arrayList.add(student);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showStudent(ArrayList<Student>arrayList){
        for (Student viewSudent:arrayList){
           viewSudent.showSTuden();
        }
    }
    public void searchID(ArrayList<Student>arrayList, Scanner scanner, String mess){
        boolean ischeck=false;
        String id=scanner.nextLine();
        for (Student student:arrayList){
            if (student.getId().equals(id)){
                ischeck=true;
                student.showSTuden();
            }
        }
        if (!ischeck){
            System.out.println(mess);
        }
    }
    public void showPointBigger85(ArrayList<Student>arrayList){
        for (Student student:arrayList){
            int temp= Integer.parseInt(student.getPoint()) ;
            if (temp>85){
                student.showSTuden();
            }
        }
    }
    public void save(String src, ArrayList<Student>arrayList){
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(src));
            for (Student student:arrayList){
                objectOutputStream.writeObject(student);
            }
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void addStudent(ArrayList<Student>arrayList,Scanner scanner){
        System.out.println("nhap ten hoc vien:");
        String name=scanner.nextLine();
        System.out.println("nhap ma hoc vien:");
        String id=scanner.nextLine();
        System.out.println("nhap email");
        String email=scanner.nextLine();
        System.out.println("nhap diem");
        String poid=scanner.nextLine();
        Student student=new Student(name,id,email,poid);
        arrayList.add(student);
        showStudent(arrayList);
    }
    public void repaidStudent(ArrayList<Student>arrayList,Scanner scanner){
        System.out.println("nhap ma hoc vien de sua thong tin hoc vien");
        String id=scanner.nextLine();
        for (Student student:arrayList){
            if (student.getId().equals(id)){
                System.out.println("nhap lai ten hoc vien");
                String name=scanner.nextLine();
                System.out.println("nhap ma hoc vien:");
                String id1=scanner.nextLine();
                System.out.println("nhap email");
                String email=scanner.nextLine();
                String poid=scanner.nextLine();
                student.setName(name);
                student.setId(id1);
                student.setEmail(email);
                student.setPoint(poid);
            }
        }
        showStudent(arrayList);
    }
    public void removeStudent(ArrayList<Student>arrayList,Scanner scanner){
        System.out.println("nhap ma hoc vien can tim de xoa");
        String id=scanner.nextLine();
        arrayList.removeIf(student -> student.getId().equals(id));
        showStudent(arrayList);
    }
}
