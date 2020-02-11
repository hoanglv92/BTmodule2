import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String src="anhviet.txt";
        String srcVnToEng="vietanh.txt";
        HashMap<String,String>dictionaryVnToEng=new HashMap<>();
        HashMap<String,String> dictionaryEngToVn=new HashMap<String, String>();
        AddImplementForDic addImplementForDic=new AddImplementForDic();
        EditElementForDic editElementForDic=new EditElementForDic();
        IsExist isExist=new IsExist();
        OverWriter overWriter=new OverWriter();
        ReadFileImportToHashMap readFileImportToHashMap=new ReadFileImportToHashMap();
        RemoveElementForDic removeElementForDic=new RemoveElementForDic();
        SaveHashMapTOFile saveHashMapTOFile=new SaveHashMapTOFile();
        ShowSuggesTions showSuggesTions=new ShowSuggesTions();
        StranLate stranLate=new StranLate();
        ShowHashMap showHashMap=new ShowHashMap();
        System.out.println("vui long chon loai tu dien:");
        System.out.println("nhap 1 chon tu dien anh viet.");
        System.out.println("nhap 2 chon tu dien viet anh.");
        final int dictionaryEnglishToVn=1;
        final int dictionaryVietnamToEng=2;
        int select=scanner.nextInt();
        scanner.nextLine();
        switch (select){
            case dictionaryEnglishToVn:
                readFileImportToHashMap.readTxtImportToHashMap(src,dictionaryEngToVn);
                menuController(dictionaryEngToVn,scanner,src,stranLate,showSuggesTions,isExist,
                        addImplementForDic,overWriter,editElementForDic,removeElementForDic,showHashMap,saveHashMapTOFile);
                break;
            case dictionaryVietnamToEng:
                readFileImportToHashMap.readTxtImportToHashMap(srcVnToEng,dictionaryVnToEng);
                menuController(dictionaryVnToEng,scanner,srcVnToEng,stranLate,showSuggesTions,isExist,
                        addImplementForDic,overWriter,editElementForDic,removeElementForDic,showHashMap,saveHashMapTOFile);
                break;
            default:
                System.out.println("vui long chon 1 trong 2 loai tu dien.");
        }
    }
    public static void menuController(HashMap<String,String> dictionary,
                                      Scanner scanner,
                                      String src,StranLate stranLate,ShowSuggesTions showSuggesTions,
                                      IsExist isExist,AddImplementForDic addImplementForDic,
                                      OverWriter overWriter,EditElementForDic editElementForDic,
                                      RemoveElementForDic removeElementForDic,
                                      ShowHashMap showHashMap,SaveHashMapTOFile saveHashMapTOFile) throws IOException {
        final int stranlate=1;
        final int add=2;
        final int edit=3;
        final int remove=4;
        final int show=5;
        System.out.println("chon tinh nang :");
        System.out.println("1 :  stranlate");
        System.out.println("2 : them tu vao tu dien");
        System.out.println("3 :sua lai 1 tu trong tu dien");
        System.out.println("4 :xoa 1 tu");
        System.out.println("5 :hien thi toan bo tu dien");
        int select=scanner.nextInt();
        scanner.nextLine();
        switch (select){
            case stranlate:
                System.out.println("nhap tu can dich: ");
                String stringKey = scanner.nextLine();
                String mess="nhap vao tu can dich moi,dua vao goi y.";
                String mess14="tu ban nhap lai khong co trong tu dien chuong trinh se thoat.";
                stranLate.stranlate(dictionary,scanner,stringKey,mess,mess14,isExist,showSuggesTions);
                break;
            case add:
                System.out.println("nhap vao tu can them:");
                String stringKey1=scanner.nextLine();
                System.out.println("nhap vao phien am va nghia cua tu do:");
                String valuatemp1 = scanner.nextLine();
                addImplementForDic.addInDic(dictionary,scanner,src,stringKey1,valuatemp1,isExist,overWriter);
                break;
            case edit:
                String mess3="nhap vao tu can sua:";
                String mess4="nhap phien am va nghia cua tu:";
                String mess5="tu can sua khong co trong tu dien.chon 1 de hien goi y cac tu gan dung,so khac thoat.";
                String mess6="nhap lai tu can sua.";
                String mess7="nhap phien am va nghia cua tu:";
                String mess8="tu ban nhap lai van ko dung, chuong trinh se thoat khoi tinh nang.";
                String mess9="ban da huy khong chon.";
                editElementForDic.editInDic(dictionary,scanner,src,mess3,mess4,mess5,mess6,mess7,mess8,mess9,isExist,showSuggesTions,overWriter);
                break;
            case remove:
                System.out.println("nhap tu can xoa:");
                String english1 = scanner.nextLine();
                String mess10=" tu ban nhap ko co trong tu dien, nhap 1 de hien thi goi y:";
                String mess11="nhap lai tu can xoa:";
                String mess12="tu ban nhap lai van ko dung, chuong trinh se thoat.";
                String mess13="ban da huy ko hien goi y.";
                removeElementForDic.removeElementInDic(dictionary,scanner,src,english1,mess10,mess11,mess12,mess13,isExist,showSuggesTions);
                break;
            case show:
                showHashMap.showHashMap(dictionary);
                break;
            default:
                System.out.println("ban khong chon tinh nang nao,chuong trinh se tat.");
                saveHashMapTOFile.overrideFileDic(dictionary,src);
                System.exit(0);
        }
        menuController(dictionary, scanner, src,stranLate,showSuggesTions,isExist,
                addImplementForDic,overWriter,editElementForDic,removeElementForDic,showHashMap,saveHashMapTOFile);
    }
}
