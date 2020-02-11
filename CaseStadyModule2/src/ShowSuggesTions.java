import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShowSuggesTions {
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
}
