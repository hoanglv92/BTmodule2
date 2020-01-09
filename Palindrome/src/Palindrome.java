public class Palindrome {
    private String string;

    public Palindrome() {
    }

    public Palindrome(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public  boolean isPalindrome(String string) {
        char[]arr=string.toCharArray();
        int tempNumber=(arr.length-1)/2;
        for(int i=0; i<tempNumber;i++){
            for (int j=arr.length;j>tempNumber;j--) {
                if (arr[i] == arr[j - 1]);
                return true;
            }
        }
        return false;
    }
}
