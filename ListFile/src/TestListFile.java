import java.io.IOException;
import java.util.Scanner;

public class TestListFile {
    public static void main(String[] args) throws IOException {
        System.out.println("The program shows the directory tree");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the directory: ");
        String path = scanner.nextLine();
        ListFile listFile=new ListFile(path);
        listFile.directoryTree(path);


    }
}
