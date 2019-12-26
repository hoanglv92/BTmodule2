import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        addElementArray(arr);
        System.out.println("mảng mới nhập có các giá trị là: ");
        show(arr);
        int[] arr1=new int[5];
        addElementArray(arr1);
        System.out.println("mảng thú 2 mới nhập có các giá trị là: ");
        show(arr1);
        System.out.println("gộp 2 mảng trước : ");

        int[] arr2=new int[10];
        for (int i = 0; i < arr.length; i++) {
                   arr2[i]=arr[i];

        }
        int cout =0;
        for(int i=5;i<arr2.length;i++){
            if(cout<arr1.length){
                arr2[i]=arr1[cout];
                cout++;

            }
        }
        show(arr2);
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void addElementArray(int[] arr){
        for(int i=0;i<arr.length;i++){
           Scanner sc=new Scanner(System.in);
            System.out.println("nhập vào các phần tử của mảng : ");
            arr[i]=sc.nextInt();
        }
    }
}
