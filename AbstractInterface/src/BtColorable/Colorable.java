package BtColorable;

public interface Colorable {
    String color="black";
    default void howToColor(){

        System.out.println("color all four side");
    }
}
