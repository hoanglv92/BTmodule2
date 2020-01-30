package NumberGenerator;

public class Main{
    public static void main(String[] args) {
        Thread thread1=new NumberGenerator();
        Thread thread2=new NumberGenerator();
        thread1.setName("s1");
        thread2.setName("s2");
        thread1.start();
        thread2.start();
    }
}

