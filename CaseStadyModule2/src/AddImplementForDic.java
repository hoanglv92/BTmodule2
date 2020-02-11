import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class AddImplementForDic {
    public void addInDic(HashMap<String, String> dictionary, Scanner scanner,
                         String src, String stringKey,
                         String valuatemp, IsExist isExist,OverWriter overWriter) throws IOException {
        boolean isCheck=isExist.isExist(dictionary,scanner,stringKey);
        if (isCheck) {
            overWriter.oVerWrite(isCheck, scanner, dictionary, stringKey, src,valuatemp);
        }else {
            dictionary.put(stringKey, valuatemp);
        }
    }
}
