package BtColorable;

public class Main {
    public static void main(String[] args) {
        Square [] square = new Square[3];
        square[0]=new Square(3,Colorable.color);
        square[1]=new Square(5);
        square[2]=new Square();
        for (int i=0;i<square.length;i++){
            System.out.println(square[i].getArea());
        }
        for(int j=0 ; j<square.length;j++){
            if (square[j].getColor()!=null){
                System.out.println(square[j]);
            }else {
               square[j].howToColor();
            }
        }


    }
}
