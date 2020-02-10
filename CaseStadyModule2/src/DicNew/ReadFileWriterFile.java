package DicNew;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ReadFileWriterFile {
    public void readTxtImportToHashMap(HashMap<String,String> dictionary, String src) {
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
    public boolean writerDicToFile(HashMap<String,String> dictionary,String src) {
        boolean isSuccess = false;
        try {
            File file=new File(src);
            FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                bufferedWriter.write("@"+key+" /"+value+"\n\n");
                isSuccess=true;
            }
            bufferedWriter.write(";;");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }
}
