package Validataemail;

public class EmailTest {
        private static ValidateEmail validateEmail;
        public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
        public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

        public static void main(String args[]) {
            validateEmail = new ValidateEmail();
            for (String email : validEmail) {
                boolean isvalid = ValidateEmail.valiteEmail(email);
                System.out.println("Email is " + email +" is valid: "+ isvalid);
            }
            for (String email : invalidEmail) {
                boolean isvalid = ValidateEmail.valiteEmail(email);
                System.out.println("Email is " + email +" is valid: "+ isvalid);
            } 
        }
}

