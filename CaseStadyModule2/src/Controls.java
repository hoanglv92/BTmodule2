import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Controls {
    public void addInDic(HashMap<String, String> dictionary, Scanner scanner,
                         String src, String stringKey,
                         String valuatemp, Support support) throws IOException {
        boolean isCheck=support.isExist(dictionary,scanner,stringKey);
        if (isCheck) {
            support.oVerWrite(isCheck, scanner, dictionary, stringKey, src,valuatemp);
        }else {
            dictionary.put(stringKey, valuatemp);
        }
    }
    public void editInDic(HashMap<String, String> dictionary, Scanner scanner,
                          String src, String mess1, String mess2, String mess3,
                          String mess4, String mess5, String mess6,
                          String mess7, Support support) throws IOException {
        final int showSuget=1;
        System.out.println(mess1);
        String stringKey = scanner.nextLine();
        boolean check = support.isExist(dictionary, scanner, stringKey);
        if (check) {
            System.out.println(mess2);
            String valuatemp = scanner.nextLine();
            support.oVerWrite(check, scanner, dictionary, stringKey, src, valuatemp);
        }else {
            System.out.println(mess3);
            int select=scanner.nextInt();
            scanner.nextLine();
            switch (select){
                case showSuget:
                    support.showSuggestions(stringKey,dictionary);
                    System.out.println(mess4);
                    String stringKeyNew=scanner.nextLine();
                    boolean check1=support.isExist(dictionary,scanner,stringKeyNew);
                    if (check1){
                        System.out.println(mess5);
                        String valuatemp = scanner.nextLine();
                        support.oVerWrite(check1,scanner,dictionary,stringKeyNew,src,valuatemp);
                    }else {
                        System.out.println(mess6);
                    }
                    break;
                default:
                    System.out.println(mess7);
            }
        }
    }
    public void removeElementInDic(HashMap<String, String> dictionary,
                                   Scanner scanner, String src,
                                   String stringKey, String mess1, String mess2,
                                   String mess3, String mess4,Support support) throws IOException {
        final int show = 1;
        if (support.isExist(dictionary, scanner, stringKey)) {
            dictionary.remove(stringKey);
        } else {
            System.out.println(mess1);
            int select = scanner.nextInt();
            scanner.nextLine();
            if (select == show) {
                support.showSuggestions(stringKey, dictionary);
                System.out.println(mess2);
                String stringkeytemp = scanner.nextLine();
                boolean ischeck=support.isExist(dictionary,scanner,stringkeytemp);
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
    public void stranlate(HashMap<String, String> dictionary,
                          Scanner scanner, String stringKey,
                          String mess, String mess2,Support support) {
        if (support.isExist(dictionary, scanner, stringKey)) {
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
            support.showSuggestions(stringKey, dictionary);
            String stringKeyTemp = scanner.nextLine();
            if (support.isExist(dictionary, scanner, stringKeyTemp)) {
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
