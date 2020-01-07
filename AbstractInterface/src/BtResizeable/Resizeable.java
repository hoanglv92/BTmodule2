package BtResizeable;

public interface Resizeable {
     String color="black";

     default void resize(double pacent){
          System.out.println("color all four side");
     }

}
