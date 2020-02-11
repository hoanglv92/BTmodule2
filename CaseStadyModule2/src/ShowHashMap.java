import java.util.HashMap;

public class ShowHashMap {
    public void showHashMap(HashMap<String, String> dictionary) {
        for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
