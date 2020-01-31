package ValidateAccount;

import Validataemail.ValidateEmail;

public class ValidateAccounttest {
    public static ValidateAccount validateAccount;
    public static final String [] validAccount={"sdjfnsd23","sdsadasd56","fdd.b,44sd"};
    public static final String [] invalidAccount={"34ejjedg","[454sdsad5]","35345][[535"};
    public static void main(String[] args) {
        validateAccount=new ValidateAccount();
        for (String account : validAccount) {
            boolean isvalid = ValidateAccount.validateAccount(account);
            System.out.println("account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = ValidateAccount.validateAccount(account);
            System.out.println("account is " + account +" is valid: "+ isvalid);
        }
    }
}
