import java.util.HashMap;
import java.util.Scanner;

public class StranLate {
    public void stranlate(HashMap<String, String> dictionary,
                          Scanner scanner, String stringKey,
                          String mess, String mess2,IsExist isExist,ShowSuggesTions showSuggesTions) {
        if (isExist.isExist(dictionary, scanner, stringKey)) {
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
            showSuggesTions.showSuggestions(stringKey, dictionary);
            String stringKeyTemp = scanner.nextLine();
            if (isExist.isExist(dictionary, scanner, stringKeyTemp)) {
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
}
