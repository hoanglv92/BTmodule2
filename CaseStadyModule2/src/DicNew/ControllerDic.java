package DicNew;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControllerDic {
    public boolean edit(HashMap<String,String>hashMapDictionaryEngToVn,String keyString){
        boolean isCheck=isCheckStringKey(hashMapDictionaryEngToVn, keyString);
        boolean isedit=false;
        if (isCheck){
            for (HashMap.Entry < String, String > entry:hashMapDictionaryEngToVn.entrySet()) {
                String key = entry.getKey();
                String value=entry.getValue();
                if (keyString.equals(key)) {
                    isedit = true;

                }
            }
        }
        return isedit;
    }
    public String showSuggestions(String stringKey, HashMap<String,String> hashMapDictionaryEngToVn, ArrayList<String> arrayList){
        String regex = stringKey + "(.*)";
        Pattern pattern = Pattern.compile(regex);
        for (HashMap.Entry<String, String> entry : hashMapDictionaryEngToVn.entrySet()) {
            String key = entry.getKey();
            Matcher matcher = pattern.matcher(key);
            if (matcher.find()){
                arrayList.add(key);
            }
        }
        String str="";
        for (int i=0;i<arrayList.size();i++){
            str+=arrayList.get(i)+"\n";
        }
        return str;
    }
    public boolean isCheckStringKey(HashMap<String,String>hashMapDictionaryEngToVn,String stringKey){
        boolean ischeck=false;
        for (HashMap.Entry<String,String> entry:hashMapDictionaryEngToVn.entrySet()){
            String key=entry.getKey();
            if (stringKey.equals(key)){
                ischeck=true;
            }
        }
        return ischeck;
    }
}
