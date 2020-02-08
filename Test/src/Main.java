import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String src= "hocvien.txt";
        String sortpoid="/home/hoanglv/IdeaProjects/BTjava/Test/src/sapxepdiem.txt";
        String sortName="/home/hoanglv/IdeaProjects/BTjava/Test/src/sapxephoten.txt";
        ArrayList<Student>arrayListStudens=new ArrayList<>();
        Controller controller=new Controller();
        controller.readFileTxt(src,arrayListStudens);
        System.out.printf( "%-50s%-30s%-50s%-5s\n","name","ma hoc vien","email","diem");
        controller.showStudent(arrayListStudens);
        System.out.println("sinh vien co diem lon hon 85");
        controller.showPointBigger85(arrayListStudens);
        System.out.println("nhap ma hoc vien can tim:");
        String mess="ma hoc vien khong ton tai.";
        controller.searchID(arrayListStudens,scanner,mess);
        System.out.println("sap xep theo diem hov vien giam dan:");
        arrayListStudens.sort(new SortPoid());
        controller.showStudent(arrayListStudens);
        System.out.println("luu doi tuong xuong file");
        controller.save(sortpoid,arrayListStudens);
        System.out.println("sap xep theo ho ten");
        arrayListStudens.sort(new Sortname());
        controller.showStudent(arrayListStudens);
        controller.save(sortName,arrayListStudens);
        controller.removeStudent(arrayListStudens,scanner);

    }
}
