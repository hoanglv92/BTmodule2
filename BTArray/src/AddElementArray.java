import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]array={1,3,5,7,9,};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i] + " vị trí của phần tử : " +i);
        }
        System.out.println("bạn muốn thêm số nào, ở vị trí? :");
        System.out.println("số muốn thêm :");
        int number=scanner.nextInt();
        System.out.println("vị trí muốn thêm :");
        int vitri=scanner.nextInt();
        if(vitri<0||vitri>array.length){
            System.out.println("không chèn được do vị trí bạn nhập đã nhỏ hơn không hoặc lón hơn chiều dài m");
        }else {
            System.out.println("chèn thêm phần tử :"+number+" vào vị trí "+vitri);
            array=insert(array,number);
            System.out.println("mảng sau khi thêm :");
            show(array);
        }
    }
    public static int [] insert(int [] array, int k) {
        int arrayIndex = array.length - 1;
        int tempIndex = array.length;
        int [] tempArray = new int [tempIndex + 1];
        boolean inserted = false;

        for (int i = tempIndex; i >= 0; i--) {
            if (arrayIndex > -1 && array[arrayIndex] > k) {
                tempArray[i] = array[arrayIndex--];
            } else {
                if (!inserted) {
                    tempArray[i] = k;
                    inserted = true;
                } else {
                    tempArray[i] = array[arrayIndex--];
                }
            }
        }
        return tempArray;
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
