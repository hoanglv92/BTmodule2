package Th_RacingCars;

import java.util.Random;

public class Cars implements Runnable {
    private String name;

    public Cars(String name) {
        this.name=name;
    }
    @Override
    public void run() {
        int runDistance=0;
        long startTime=System.currentTimeMillis();
        while (runDistance<Main.DISTANCE){
            try {
                int speed=(new Random().nextInt(20));
                runDistance+=speed;
                String log="|";
                int percentTravel = (runDistance * 100) / Main.DISTANCE;
                for (int i = 0; i < Main.DISTANCE; i += Main.STEP) {
                    if (percentTravel >= i + Main.STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(Main.DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");

    }
}
 class Main {
    public static int DISTANCE = 100;

    public static int STEP = 2;

    public static void main(String[] args) {
        Cars carA = new Cars("A");
        Cars carB = new Cars("B");
        Cars carC = new Cars("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

