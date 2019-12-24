import java.util.Scanner;

public class DrawFigure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1 . Draw the triangle");
        System.out.println("2 . Draw the rectangle");
        System.out.println("3 .  Draw the square");
        System.out.println("4 .  Draw the square ngược");
        System.out.println("0 . Exit");
        System.out.println("Input choice :");
        choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Draw the triangle");
                for (int i=1;i<=5;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print(" * ");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                System.out.println("Draw the rectangle :");
                    for (int i=1;i<=3;i++){
                        for(int j=1;j<=8;j++){
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                break;
            case 3:
                System.out.println("Draw the square:");
                for (int i=1;i<=8;i++){
                    for(int j=1;j<=8;j++){
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }

                break;
            case 4:
                System.out.println("Draw the triangle nguoc:");
                for (int i=7;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }

                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No Choice");

        }
    }
}
