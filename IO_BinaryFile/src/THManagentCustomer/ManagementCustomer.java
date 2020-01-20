package THManagentCustomer;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class ManagementCustomer {
    public static void main(String[] args) throws IOException {
        System.out.println("nhập vào số sản phẩm của bạn.");
        Scanner sc=new Scanner(System.in);
        int numberProduct=sc.nextInt();
        sc.nextLine();
        System.out.println("nhập vào các thông tin của sản phẩm.");
        ArrayList<Product> productArrayList=new ArrayList<Product>();
        inputInfomationProduct(sc,numberProduct,productArrayList);
        System.out.println("nhập đường dẫn và tên file cần tạo để lưu trữ các sản phẩm.");
        String src=sc.nextLine();
        System.out.println("các sản phẩm :");
        showProductArrayList(productArrayList);
        saveProduct(src,productArrayList);
        menu(sc,productArrayList,src);
    }
    public static void menu(Scanner sc,ArrayList<Product>productArrayList,String src) throws IOException {
        System.out.println("nhập vào tính năng muốn chon.");
        System.out.println("1.thêm một sản phẩm.");
        System.out.println("2. xóa một sản phẩm.");
        System.out.println("3. sửa thông tin một sản phẩm.");
        System.out.println("4. sắp xếp lại các sản phẩm.");
        int menu=sc.nextInt();
        final int addProductoproductArrayList=1;
        final int removeProductoproductArrayList=2;
        final int repaidProductArrayList=3;
        final int sortProductArrayList=4;
        switch (menu){
            case addProductoproductArrayList:
                addProductoproductArrayList(productArrayList,sc);
                saveProduct(src,productArrayList);
                break;
            case removeProductoproductArrayList:
                removeProductoproductArrayList(productArrayList,sc);
                saveProduct(src,productArrayList);
                break;
            case repaidProductArrayList:
                repaidProductArrayList(productArrayList,sc);
                saveProduct(src,productArrayList);
                break;
            case sortProductArrayList:
                sortProductArrayList(productArrayList,sc,src);
                saveProduct(src,productArrayList);
                break;
            default:
                System.out.println("bạn không chọn tính năng nào.");
        }
    }
    public static void addProductoproductArrayList(ArrayList<Product>productArrayList , Scanner scanner){
        System.out.println("nhập số sản phẩm cần thêm.");
        int numberAdd=scanner.nextInt();
        inputInfomationProduct(scanner,numberAdd,productArrayList);
    }
    public static void removeProductoproductArrayList(ArrayList<Product>productArrayList ,Scanner scanner){
        System.out.println("nhập vị trí sản phẩm cần xóa.");
        int vitri=scanner.nextInt();
        productArrayList.remove(vitri);
    }
    public static void repaidProductArrayList(ArrayList<Product>productArrayList,Scanner scanner){
        System.out.println("điền vào vị trí sản phẩm cần sửa.");
        int vitri=scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập tên mới.");
        String name=scanner.nextLine();
        System.out.println("nhập id mới.");
        String id=scanner.nextLine();
        System.out.println("nhập tên hãng sản xuất mới.");
        String nameManufactoring=scanner.nextLine();
        System.out.println("nhập vào giá sản phẩm mới.");
        int price=scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập vào thông tin sản phẩm mới.");
        String information=scanner.nextLine();
        productArrayList.get(vitri).setName(name);
        productArrayList.get(vitri).setId(id);
        productArrayList.get(vitri).setNameManufactoring(nameManufactoring);
        productArrayList.get(vitri).setPrice(price);
        productArrayList.get(vitri).setInformation(information);
    }
    public static void sortProductArrayList(ArrayList<Product>productArrayList,Scanner scanner,String src) throws IOException {
        System.out.println("bạn muốn sắp xếp theo tên sản phẩm hay id của sản phẩm, hay thei giá tiền.");
        System.out.println("nhâp 1 sắp xếp theo tên.");
        System.out.println("nhập 2 sắp sêp theo id.");
        System.out.println("nhập 3 sắp xếp theo giá tiền.");
        int select=scanner.nextInt();
        final int sortName=1;
        final int sortId=2;
        final int sortPrice=3;
        switch (select){
            case sortName:
                sortName(productArrayList);
                saveProduct(src, productArrayList);
                break;
            case sortId:
                sortId(productArrayList);
                saveProduct(src,productArrayList);
                break;
            case sortPrice:
                sortPrice(productArrayList);
                saveProduct(src,productArrayList);
                break;
            default:
                System.out.println("bạn lựa chọn không sắp xếp.");
        }
    }
    public static void sortName(ArrayList<Product>productArrayList){
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product product, Product product1) {
                return (product.getName().compareTo(product1.getName()));
            }
        });
        System.out.println("sản phẩm sau khi sắp xếp theo tên.");
        showProductArrayList(productArrayList);

    }
    public static void sortId(ArrayList<Product>productArrayList){
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        System.out.println("sản phẩm sau khi sắp xếp theo id");
        showProductArrayList(productArrayList);
    }
    public static void sortPrice(ArrayList<Product>productArrayList){
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if( o1.getPrice()<o2.getPrice()){
                    return 1;
                }else if(o1.getPrice()==o2.getPrice()){
                    return 0;
                }else return -1;
            }
        });
        System.out.println("sản phẩm sau khi sắp xếp theo giá sản phẩm.");
        showProductArrayList(productArrayList);

    }
    public static void showProductArrayList(ArrayList<Product>productArrayList){
        for(Product product:productArrayList){
            System.out.println("name: "+product.getName()+", id:"+product.getId()+", hãng sx: "
           +product.getNameManufactoring()+", giá:"+product.getPrice()+", thông tin :"+product.getInformation());

        }
    }
    public static void saveProduct(String src ,ArrayList<Product>productArrayList)throws IOException {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream(new File(src)));
        dos.writeInt(productArrayList.size());
        for(Product product:productArrayList){
            dos.writeUTF(product.getName());
            dos.writeUTF(product.getId());
            dos.writeUTF(product.getNameManufactoring());
            dos.writeInt(product.getPrice());
            dos.writeUTF(product.getInformation()+"\n");
        }
        dos.flush();
        dos.close();
    }
    public static void pushProduct(String src, ArrayList<Product>productArrayList)throws IOException{
        File file=new File(src);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        
    }
    public static void inputInfomationProduct(Scanner sc, int numberProduct ,ArrayList<Product> productArrayList){
        for(int i=0;i<numberProduct;i++){
            System.out.println("nhập vào tên sản phẩm thứ :"+(i+1));
            String name=sc.nextLine();
            System.out.println("nhập vào id sản phẩm.");
            String id=sc.nextLine();
            System.out.println("nhập vào tên hãng sản xuất.");
            String nameManufactoring=sc.nextLine();
            System.out.println("nhập vào giá sản phẩm.");
            int price=sc.nextInt();
            sc.nextLine();
            System.out.println("nhập vào thông tin sản phẩm.");
            String information=sc.nextLine();
            Product product=new Product(name,id,nameManufactoring,price,information);
            productArrayList.add(product);

        }
    }
}
