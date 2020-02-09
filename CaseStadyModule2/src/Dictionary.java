import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public interface Dictionary  {
    void readTxtImportToHashMap(String src, HashMap<String,String> dictionary);
    void addInDic(HashMap<String,String> dictionary,Scanner scanner,String src,String engKey,String valuatemp)throws IOException;
    boolean isExist(HashMap<String,String> dictionary,Scanner scanner,String engkey);
    void editInDic(HashMap<String,String> dictionary,Scanner scanner,String src,String mess1,String mess2,String mess3,String mess4,String mess5,String mess6,String mess7)throws IOException;
    void overrideFileDic(HashMap<String,String> dictionary,String src)throws IOException;
    void writeOnFileDic(String keyWord, String value, String src);
    void stranlate(HashMap<String,String> dictionary,Scanner scanner,String english,String mess,String mess1,String mess2);
    void showSuggestions(String eng,HashMap<String,String> dictionary);
    void removeElementInDic(HashMap<String,String> dictionary, Scanner scanner, String src, String english, String mess1, String mess2, String mess3, String mess4)throws IOException;
    void showHashMap(HashMap<String,String> dictionary);

}
