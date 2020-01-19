package Readfile;

import java.io.*;

public class ReadFileCsv {
    public static void main(String[] args) {
        String string="/home/hoanglv/1/test.csv";
        try {
            File iFile=new File(string);
            FileReader fileReader=new FileReader(iFile);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            ;
            while ((line=bufferedReader.readLine())!=null){
             String [] str= line.split(",");
                System.out.println("code: "+str[4]+" country: "+str[5]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
