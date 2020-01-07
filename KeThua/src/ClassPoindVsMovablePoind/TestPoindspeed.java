package ClassPoindVsMovablePoind;

import java.util.Arrays;

public class TestPoindspeed {
    public static void main(String[] args) {
        Poind poind=new Poind(3,5);
        MovablePoind movablePoind=new MovablePoind(poind.getX(),poind.getY(),1,2);
        System.out.println(Arrays.toString(movablePoind.getspeed()));
        System.out.println(movablePoind.toString());
        System.out.println(poind.toString());
        System.out.println(movablePoind);
        movablePoind.move();
        System.out.println(movablePoind);
    }
}
