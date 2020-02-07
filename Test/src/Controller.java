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
    public void searchID(ArrayList<Student>arrayList, Scanner scanner){
        String id=scanner.nextLine();
        for (Student student:arrayList){
            if (student.getId().equals(id)){
                student.showSTuden();
            }else {
                System.out.println("ma hoc vien khong ton tai.");
            }
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
    public void save(){
       
    }

}
