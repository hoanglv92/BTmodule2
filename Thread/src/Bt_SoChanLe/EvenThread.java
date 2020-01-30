package Bt_SoChanLe;

public class EvenThread extends Thread {
    @Override
    public void run() {
       for(int i=1;i<=10;i++){
           if(i%2!=0){
               try {
                   Thread.sleep(10);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println(this.getName()+"- "+i);
           }
       }
    }
}
