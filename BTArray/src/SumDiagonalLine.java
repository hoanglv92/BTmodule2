import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("nhập số hàng và cột của ma trận vuông :");
             n=sc.nextInt();
        }while(n<=0);
        System.out.println("nhập vào các phần tử của mảng matrix : ");
        int [][] array = new int[n][n];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("mảng mới nhập : ");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(i==j){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println("tổng của đường chéo chính : "+sum);
    }
}
