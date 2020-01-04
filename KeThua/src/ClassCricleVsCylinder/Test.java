package ClassCricleVsCylinder;

public class Test {
    public static void main(String[] args) {
        Cricle cricle=new Cricle("blue",5);
        Cylinder cylinder=new Cylinder(10,cricle.getRadius(),"black");
        System.out.println(cricle.toString());
        System.out.println(cylinder.printCylinder());
        System.out.println(cricle.getArea());
        System.out.println(cylinder.getarea());
    }
}
