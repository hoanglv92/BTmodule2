package ValidateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String regex="^[a-zA-Z0-9]{7,14}$";
    public ValidateAccount(){
        pattern=Pattern.compile(regex);
    }
    public static boolean validateAccount(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
