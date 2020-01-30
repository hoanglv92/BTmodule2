package Bt_SoChanLe;

public class TestThread {
    public static void main(String[] args)  {
        Thread chan=new OddThread();
        Thread le=new EvenThread();
        chan.setName("sochan");
        le.setName("sole");
        le.start();
        try {
            le.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chan.start();
    }
}
