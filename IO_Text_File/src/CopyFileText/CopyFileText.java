package CopyFileText;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào đường dẫn file cần tạo và tên file:");
        String paltFileOld=scanner.nextLine();
        creatFile(scanner,paltFileOld);
        writeFileTxt(paltFileOld,scanner);
        System.out.println("nhập vào nơi lưu trữ của file mới và tên file.");
        String paltFileNew=scanner.nextLine();
        readTextFileCopyToPaltFileNew(paltFileOld,paltFileNew,scanner);
        System.out.println("các dòng đọc được:");
    }
    public static void readTextFileCopyToPaltFileNew(String paltFileOld, String paltFileNew,Scanner scanner){
        try {
            File inFile=new File(paltFileOld);
            FileReader fileReader=new FileReader(inFile);
            BufferedReader reader=new BufferedReader(fileReader);
            String line=null;
            creatFile(scanner,paltFileNew);
            FileWriter fileWriter=new FileWriter(paltFileNew);
            while ((line=reader.readLine())!=null){
                fileWriter.write(line);
                System.out.println(line);
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void creatFile(Scanner scanner ,String paltFileOld){
        try {
            File file =new File(paltFileOld);
            if(file.createNewFile()){
                System.out.println("tạo file thành công.");
            }else {
                System.out.println("đã tồn tại file với tên trên");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void writeFileTxt(String paltFileOld ,Scanner scanner){
        try {
            FileWriter writer=new FileWriter(paltFileOld);
            System.out.println("nhập nội dung file text.");
            System.out.println("nhập 2 lần anter kết thúc quá trình nhập file.");
            String str;
            do {
                str=scanner.nextLine();
                writer.write(str+"\n");
            }while (!str.equals(""));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
