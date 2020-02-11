import java.util.HashMap;
import java.util.Scanner;

public class IsExist {
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
}
