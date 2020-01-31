package BtValidateNameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static  Pattern pattern;
    private static Matcher matcher;
    public static final String regex="^[CAP]\\d{4}[GHIKLM]$";
    public ValidateNameClass (){
        pattern=Pattern.compile(regex);
    }
    public static boolean vsalidNameClass(String regex){
       matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}
