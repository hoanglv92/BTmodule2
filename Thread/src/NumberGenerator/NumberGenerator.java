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
