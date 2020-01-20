package CopyFileBinary;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nhập vào đường dẫn file cần copy");
        String sourcePalt=input.nextLine();
        System.out.println("nhập vào thư mục cần copy tới.");
        String destPalt=input.nextLine();
        File  sourceFile=new File(sourcePalt);
        File destFile=new File(destPalt);
        try {
            copyFile(sourcePalt,destPalt);
            System.out.println("copy thành công.");
        } catch (IOException e) {
            System.out.println("copy không thành công.");
            System.out.println(e.getMessage()   );

        }
    }
    private static void copyFile(String sourcePalt,String destPalt)throws IOException {
        InputStream is=null;
        OutputStream os=null;
        try {
            is=new FileInputStream(sourcePalt);
            os=new FileOutputStream(destPalt);
            byte [] buffer=new byte[1024];
            int length;
            while((length=is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        }finally {
            is.close();
            os.close();
        }
    }
}
