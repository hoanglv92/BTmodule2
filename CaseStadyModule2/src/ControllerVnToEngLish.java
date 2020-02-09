import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControllerVnToEngLish implements Dictionary {
    @Override
    public void readTxtImportToHashMap(String src, HashMap<String, String> dictionary) {
        try {
            InputStream in = new FileInputStream(src);
            Scanner scanner = new Scanner(new InputStreamReader(in, StandardCharsets.UTF_8));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n", "#");
            // regex
            Pattern p = Pattern.compile("@(.*?)#(.*?)##");
            Matcher m = p.matcher(content);
            while (m.find()) {
                dictionary.put(m.group(1),m.group(2));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void addInDic(HashMap<String, String> dictionary, Scanner scanner, String src, String stringKey, String valuatemp) throws IOException {
        boolean isCheck=isExist(dictionary,scanner,stringKey);
        if (isCheck) {
            oVerWrite(isCheck, scanner, dictionary, stringKey, src,valuatemp);
        }else {
            dictionary.put(stringKey, valuatemp);
            writeOnFileDic(stringKey,valuatemp,src);
        }
    }

    @Override
    public boolean isExist(HashMap<String, String> dictionary, Scanner scanner, String stringKey) {
        boolean isCheck=false;
        for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            if(stringKey.equals(key)){
                isCheck=true;
            }
        }
        return isCheck;
    }

    @Override
    public void editInDic(HashMap<String, String> dictionary, Scanner scanner, String src, String mess1, String mess2, String mess3, String mess4, String mess5, String mess6, String mess7) throws IOException {
        final int showSuget=1;
        System.out.println(mess1);
        String stringKey = scanner.nextLine();
        boolean check = isExist(dictionary, scanner, stringKey);
        if (check) {
            System.out.println(mess2);
            String valuatemp = scanner.nextLine();
            oVerWrite(check, scanner, dictionary, stringKey, src, valuatemp);
        }else {
            System.out.println(mess3);
            int select=scanner.nextInt();
            scanner.nextLine();
            switch (select){
                case showSuget:
                    showSuggestions(stringKey,dictionary);
                    System.out.println(mess4);
                    String stringKeyNew=scanner.nextLine();
                    boolean check1=isExist(dictionary,scanner,stringKeyNew);
                    if (check1){
                        System.out.println(mess5);
                        String valuatemp = scanner.nextLine();
                        oVerWrite(check1,scanner,dictionary,stringKeyNew,src,valuatemp);
                    }else {
                        System.out.println(mess6);
                    }
                    break;
                default:
                    System.out.println(mess7);
            }
        }
    }

    @Override
    public void overrideFileDic(HashMap<String, String> dictionary, String src) throws IOException {
        File file=new File(String.valueOf(src));
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (HashMap.Entry<String,String>entry:dictionary.entrySet()){
            bufferedWriter.write("@"+entry.getKey()+"\n"+entry.getValue()+"\n\n");
        }
        bufferedWriter.write("##");
        bufferedWriter.close();
        fileWriter.close();
    }

    @Override
    public void writeOnFileDic(String keyWord, String value, String src) {
        try {
            FileWriter fileWriter=new FileWriter(src,true);
            fileWriter.write("@"+keyWord+"\n"+value+"\n\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stranlate(HashMap<String, String> dictionary, Scanner scanner, String stringKey, String mess, String mess1,String mess2) {
        if (isExist(dictionary, scanner, stringKey)) {
            for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (stringKey.equals(key)) {
                    System.out.println(key + " = " + value);
                    break;
                }
            }
        } else {
            System.out.println(mess);
            showSuggestions(stringKey, dictionary);
            System.out.println(mess1);
            String stringKeyTemp = scanner.nextLine();
            if (isExist(dictionary, scanner, stringKeyTemp)) {
                for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (stringKeyTemp.equals(key)) {
                        System.out.println(key + "=" + value);
                        break;
                    }
                }
            }else {
                System.out.println(mess2);
            }
        }
    }

    @Override
    public void showSuggestions(String stringKey, HashMap<String, String> dictionary) {
        String regex = stringKey + "(.*)";
        Pattern pattern = Pattern.compile(regex);
        for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            Matcher matcher = pattern.matcher(key);
            if (matcher.find()){
                System.out.println(key);
            }
        }
    }

    @Override
    public void removeElementInDic(HashMap<String, String> dictionary, Scanner scanner, String src, String stringKey, String mess1, String mess2, String mess3, String mess4) throws IOException {
        final int show = 1;
        if (isExist(dictionary, scanner, stringKey)) {
            dictionary.remove(stringKey);
            overrideFileDic(dictionary, src);
        } else {
            System.out.println(mess1);
            int select = scanner.nextInt();
            scanner.nextLine();
            if (select == show) {
                showSuggestions(stringKey, dictionary);
                System.out.println(mess2);
                String stringkeytemp = scanner.nextLine();
                boolean ischeck=isExist(dictionary,scanner,stringkeytemp);
                if (ischeck) {
                    dictionary.remove(stringkeytemp);
                    overrideFileDic(dictionary, src);
                }else {
                    System.out.println(mess3);
                }
            }else {
                System.out.println(mess4);
            }
        }
    }

    @Override
    public void showHashMap(HashMap<String, String> dictionary) {
        for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
    public void oVerWrite(boolean check,Scanner scanner,HashMap<String,String> dictionary,String eng,String src,String value) throws IOException {
         final int delete=1;
        if(check) {
            System.out.println("tim thay tu trong tu dien, nhap 1 neu muon sua va ghi de,so bat ki de huy");
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
}
