import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller1 {
    public void readTxtImportToHashMap(String src, HashMap<String,String> dictionary) {
        try {
            InputStream in = new FileInputStream(src);
            Scanner scanner = new Scanner(new InputStreamReader(in, StandardCharsets.UTF_8));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n", ";");
            // regex
            Pattern p = Pattern.compile("@(.*?) /(.*?);;");
            Matcher m = p.matcher(content);
            while (m.find()) {
                dictionary.put(m.group(1),m.group(2));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public void addInDic(HashMap<String,String> dictionary,Scanner scanner,String src) throws IOException {
        System.out.println("nhap vao tu tieng anh:");
        String engKey=scanner.nextLine();
        boolean isCheck=isExist(dictionary,scanner,engKey);
        if (isCheck) {
            System.out.println("nhap vao phien am va nghia cua tu do:");
            String valuatemp = scanner.nextLine();
            oVerWrite(isCheck, scanner, dictionary, engKey, src,valuatemp);
        }else {
            System.out.println("nhap vao phien am va nghia cua tu do:");
            String valuatemp = scanner.nextLine();
            dictionary.put(engKey, valuatemp);
            writeOnFileDic(engKey, valuatemp, src);
            readTxtImportToHashMap(src,dictionary);
        }
    }
    public boolean isExist(HashMap<String,String> dictionary,Scanner scanner,String engkey){
        boolean isCheck=false;
        for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            if(engkey.equals(key)){
                isCheck=true;
            }
        }
        return isCheck;
    }
    public void oVerWrite(boolean check,Scanner scanner,HashMap<String,String> dictionary,String eng,String src,String value) throws IOException {
        int delete=1;
        if(check) {
            System.out.println(" nhap 1 neu muon sua va ghi de,so bat ki de huy");
            int tempNumber = scanner.nextInt();
            scanner.nextLine();
            if (tempNumber == delete) {
                dictionary.put(eng, value);
                overrideFileDic(dictionary,src);
            } else {
                System.out.println("ban da huy ");
            }
        }
    }
    public void editInDic(HashMap<String,String> dictionary,Scanner scanner,String src) throws IOException {
        System.out.println("nhap vao tu can sua:");
        String eng = scanner.nextLine();
        boolean check = isExist(dictionary, scanner, eng);
        if (check) {
            System.out.println("nhap phien am va nghia cua tu:");
            String valuatemp = scanner.nextLine();
            oVerWrite(check, scanner, dictionary, eng, src, valuatemp);
            overrideFileDic(dictionary, src);
            readTxtImportToHashMap(src,dictionary);
        }else {
            System.out.println("tu can sua khong co trong tu dien.");
        }
    }
    public void overrideFileDic(HashMap<String,String> dictionary,String src) throws IOException {
        File file=new File(String.valueOf(src));
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (HashMap.Entry<String,String>entry:dictionary.entrySet()){
            bufferedWriter.write("@"+entry.getKey()+" /");
            bufferedWriter.write(entry.getValue()+"\n\n");
        }
        bufferedWriter.write(";;");
        bufferedWriter.close();
        fileWriter.close();
    }
    public void writeOnFileDic(String keyWord, String value, String src){
        try {
            FileWriter fileWriter=new FileWriter(src,true);
            fileWriter.write("@"+keyWord+" /"+value+"\n\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void stranlate(HashMap<String,String> dictionary,Scanner scanner){
        System.out.println("nhap tu can dich: ");
        String english=scanner.nextLine();
        String regex=english+"(.*)";
        Pattern pattern=Pattern.compile(regex);
        for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (english.equals(key)) {
                System.out.println(key + " = " + value);
            }else {
                Matcher matcher=pattern.matcher(key);
                if(matcher.find()){
                    System.out.println("co phai ban muon tim : "+key);
                }
                }
            }
        System.out.println("nhap lai tu can dich dung");
        String englishtemp=scanner.nextLine();
        for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (englishtemp.equals(key)) {
                System.out.println(key + "=" + value);
            }
        }
    }
    public void removeElementInDic(HashMap<String,String> dictionary,Scanner scanner,String src) throws IOException {
        System.out.println("nhap tu can xoa:");
        String english = scanner.nextLine();
        String regex = english + "(.*?)";
        Pattern pattern = Pattern.compile(regex);
        for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (english.equals(key)) {
                dictionary.remove(key);
                overrideFileDic(dictionary, src);
                readTxtImportToHashMap(src,dictionary);
            } else {
                Matcher matcher = pattern.matcher(key);
                if (matcher.find()) {
                    System.out.println("co phai ban muon tim : " + key);
                    System.out.println("nhap lai tu can xoa:");
                    String englishtemp = scanner.nextLine();
                    dictionary.remove(englishtemp);
                    overrideFileDic(dictionary, src);
                    readTxtImportToHashMap(src,dictionary);
                }
            }
        }
    }
    public void showHashMap(HashMap<String,String> dictionary){
        for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }

}
