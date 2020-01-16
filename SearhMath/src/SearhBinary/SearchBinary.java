package SearhBinary;

import java.util.Arrays;
import java.util.Scanner;

public class SearchBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("nhập vào một các số của 1 mảng");
        for(int i=0;i<arr.length;i++){
            System.out.println("phần tử thứ "+(i+1));
            arr[i]=scanner.nextInt();
        }
        sortArray(arr);
        showArray(arr);
        System.out.println("nhập vào phần tử cần tìm kiếm trong mảng");
        int findNumber=scanner.nextInt();
        searchBinary(arr,findNumber,0,arr.length-1);
        if(searchBinary(arr,findNumber,0,arr.length-1)){
            System.out.println("tìm thấy phần tử trong mảng");
        }else {
            System.out.println("không tìm thấy phần tử trong mảng");
        }
    }
    public static void sortArray(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void showArray(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static boolean searchBinary(int[]arr ,int findNumber,int left,int right){
        if(left<=right){
            int mid=(left+(arr.length-1))/2;
            if(arr[mid]==findNumber){
                return true;
            }else if(arr[mid]>findNumber){
                searchBinary(arr,findNumber,mid+1,right);
            }else {
                searchBinary(arr,findNumber,left,mid-1);
            }
        }
        return false;
    }

}
