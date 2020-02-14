import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFileWriterFile {
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
}
