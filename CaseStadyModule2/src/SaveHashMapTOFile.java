import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class SaveHashMapTOFile {
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
