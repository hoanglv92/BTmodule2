package BtResizeable;

import java.util.Random;

public class  main {
    public static void main(String[] args) {
        Random rd=new Random();
        double number=1+rd.nextInt(100);
        System.out.println(number);
        double numberAddSize=number/100;
        Shape arr[]=new Shape[3];
        arr[0]=new Cricle(3,"blue",1);
        arr[1]=new Rectangle(2,4,"red",1);
        arr[2]=new Square(4,"oranger",1);
        for(int i=0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int j=0;j<arr.length;j++){
            arr[j].resize(numberAddSize);
            System.out.println(arr[j]);
        }



    }
}
