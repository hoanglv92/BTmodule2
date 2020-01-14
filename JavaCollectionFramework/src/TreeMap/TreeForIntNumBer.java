package TreeMap;

import java.util.Scanner;

public class TreeForIntNumBer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CreatTreeNumber treeNumber=new CreatTreeNumber();
        int numberSizeArray;
        do {
            System.out.println("nhập vào độ dài của mảng");
             numberSizeArray=sc.nextInt();
        }while (numberSizeArray<=0);
        System.out.println("nhập vào các phần tử của mảng:");
        int[] arr=new int[numberSizeArray];
        for (int i=0;i<arr.length;i++){
            System.out.println("element "+i);
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            treeNumber.inSert(arr[i]);
        }
        System.out.println("mảng nhập vào tree:");
        treeNumber.intorder();
        menu(sc,treeNumber);

    }
    public static void menu(Scanner scanner,CreatTreeNumber treeNumber){
        final int ADD_ELEMENT=1;
        final int REMOVE_ELEMENT=2;
        final int SHOW_TREE=3;
        System.out.println("chọn các tính năng.");
        System.out.println("1.thêm phần tử ");
        System.out.println("2.Xóa phần tử khỏi tree");
        System.out.println("3.hiển thị tree");
        int select=scanner.nextInt();
        switch (select){
            case ADD_ELEMENT:
                System.out.println("nhập vào số muốn thêm vào key:");
                int number=scanner.nextInt();
                treeNumber.inSert(number);
                treeNumber.intorder();
                break;
            case REMOVE_ELEMENT:
                System.out.println("nhập vào phần tử muốn xóa khỏi tree.");
                int numberRemove=scanner.nextInt();
                treeNumber.deleteKey(numberRemove);
                treeNumber.intorder();
                break;
            case SHOW_TREE:
                treeNumber.intorder();
        }
    }
}
