package Prime;

public class FindPrime {
    private int number;

    public FindPrime() {
    }

    public FindPrime(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public static int findValue(int number){
        if(number<3){
            return 1;
        }
        return findValue(number-1)+findValue(number-2);
    }
}
