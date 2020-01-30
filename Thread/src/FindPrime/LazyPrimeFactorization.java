package FindPrime;

public class LazyPrimeFactorization extends Thread {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LazyPrimeFactorization(int number){
        this.number=number;
    }
    @Override
    public void run() {
        if(this.number>2) {
            for (int i = 2; i <= this.number; i++) {
                if (checkprime(i)){
                    System.out.println(this.getName()+":"+i);
                }
            }
        }
    }
    public static boolean checkprime(int number){
            for(int i=2;i<number;i++){
                if(number%i==0){
                    return false;
                }
            }
             return true;
    }
}
