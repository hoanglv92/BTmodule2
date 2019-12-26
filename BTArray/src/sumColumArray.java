import java.util.Scanner;

public class sumColumArray {
    public static void main(String[] args) {
        int[] [] arr={{1,2,3,4},
                      {5,6,7,8}};
        System.out.println("cho trước một mảng : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("bạn muốn tính tổng cột nào trong mảng trên :");
        Scanner sc=new Scanner(System.in);
        int colum=sc.nextInt();
        if (colum<0||colum>arr[0].length){
            System.out.println("cột bạn nhập ko thuộc mảng ");
        }else {
            int total=0;
            for (int j=0;j<arr[0].length;j++){
                for(int i=0;i<arr.length;i++){
                    if(j == colum){
                    total+=arr[i][j];
                    }
                }
            }
            System.out.println("tổng của cột : "+colum + " là : "+ total);
        }
    }
}
