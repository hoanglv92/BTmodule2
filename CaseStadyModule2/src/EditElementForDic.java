import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class EditElementForDic {
    public void editInDic(HashMap<String, String> dictionary, Scanner scanner,
                          String src, String mess1, String mess2, String mess3,
                          String mess4, String mess5, String mess6,
                          String mess7, IsExist isExist,ShowSuggesTions showSuggesTions,
                          OverWriter overWriter) throws IOException {
        final int showSuget=1;
        System.out.println(mess1);
        String stringKey = scanner.nextLine();
        boolean check = isExist.isExist(dictionary, scanner, stringKey);
        if (check) {
            System.out.println(mess2);
            String valuatemp = scanner.nextLine();
            overWriter.oVerWrite(check, scanner, dictionary, stringKey, src, valuatemp);
        }else {
            System.out.println(mess3);
            int select=scanner.nextInt();
            scanner.nextLine();
            switch (select){
                case showSuget:
                    showSuggesTions.showSuggestions(stringKey,dictionary);
                    System.out.println(mess4);
                    String stringKeyNew=scanner.nextLine();
                    boolean check1=isExist.isExist(dictionary,scanner,stringKeyNew);
                    if (check1){
                        System.out.println(mess5);
                        String valuatemp = scanner.nextLine();
                        overWriter.oVerWrite(check1,scanner,dictionary,stringKeyNew,src,valuatemp);
                    }else {
                        System.out.println(mess6);
                    }
                    break;
                default:
                    System.out.println(mess7);
            }
        }
    }
}
