package Factorya;
public class Factorya {
    private int number;
    public Factorya(int number) {
        this.number = number;
    }
    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
