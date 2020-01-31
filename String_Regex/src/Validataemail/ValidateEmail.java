package Validataemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String regex="^[a-zA-Z]+\\w*@[a-zA-Z]+mail.com$";
    public ValidateEmail(){
        pattern=Pattern.compile(regex);
    }
    public static boolean valiteEmail(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }

}
