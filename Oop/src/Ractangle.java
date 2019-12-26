import java.util.Scanner;
class RunNing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập width :");
        double width=sc.nextDouble();
        System.out.println("nhập heght :");
        double height=sc.nextDouble();
        Ractangle rectangle=new Ractangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.disPlay());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());

    }
}
 class Ractangle {
        double width,height;
        public void Rectangle(){
        }
        public Ractangle(double width,double height){
            this.height=height;
            this.width=width;
        }
        public double getArea(){
            return this.height*this.width;
        }
        public double getPerimeter(){
            return (this.height+this.width)*2;
        }
        public String disPlay(){
            return "Rectangle { " + "width "+width+"height "+height+"}";
        }

    }


