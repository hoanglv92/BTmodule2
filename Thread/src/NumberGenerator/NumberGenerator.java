package NumberGenerator;

public class NumberGenerator extends Thread {
    @Override
    public void run() {
        try {
            for(int i=0;i<10;i++){
                Thread.sleep(500);
                System.out.println(this.getName()+" "+ i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class Main{
    public static void main(String[] args) {
        Thread thread1=new NumberGenerator();
        Thread thread2=new NumberGenerator();
        thread1.setName("s1");
        thread2.setName("s2");
        thread1.start();
        thread2.start();
    }
}
