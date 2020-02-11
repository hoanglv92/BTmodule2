import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveElementForDic {
    public void removeElementInDic(HashMap<String, String> dictionary,
                                   Scanner scanner, String src,
                                   String stringKey, String mess1, String mess2,
                                   String mess3, String mess4,IsExist isExist,
                                   ShowSuggesTions showSuggesTions) throws IOException {
        final int show = 1;
        if (isExist.isExist(dictionary, scanner, stringKey)) {
            dictionary.remove(stringKey);
        } else {
            System.out.println(mess1);
            int select = scanner.nextInt();
            scanner.nextLine();
            if (select == show) {
                showSuggesTions.showSuggestions(stringKey, dictionary);
                System.out.println(mess2);
                String stringkeytemp = scanner.nextLine();
                boolean ischeck=isExist.isExist(dictionary,scanner,stringkeytemp);
                if (ischeck) {
                    dictionary.remove(stringkeytemp);
                }else {
                    System.out.println(mess3);
                }
            }else {
                System.out.println(mess4);
            }
        }
    }
}
