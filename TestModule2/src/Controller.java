import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    public void readFileImportToArrayList(String src, ArrayList<PhoneBook> phoneBookArrayList){
        try {
            File file=new File(src);
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String textInLine;
            String [] str;
            while ((textInLine=bufferedReader.readLine())!=null){
                str=textInLine.split(",");
                PhoneBook phoneBook=new PhoneBook(str[0],str[1],str[2],str[3],str[4],str[5]);
                phoneBookArrayList.add(phoneBook);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writerFileCsvImportToArrayList(ArrayList<PhoneBook>arrayListphone,String src){
        try {
            File file=new File(src);
            FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (int i=0;i<arrayListphone.size();i++){
                bufferedWriter.write(arrayListphone.get(i).getNumberPhone()+","+
                        arrayListphone.get(i).getName()+","+
                        arrayListphone.get(i).getGerder()+","+
                        arrayListphone.get(i).getEmail()+","+
                        arrayListphone.get(i).getAddress()+
                        arrayListphone.get(i).getGroup()+"\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void showPhonebook(ArrayList<PhoneBook>phoneBookArrayList){
        for (PhoneBook phoneBook:phoneBookArrayList){
            phoneBook.showPhoneBook();
        }
    }
    public void addPhoneBook(ArrayList<PhoneBook>phoneBookArrayList,String number,String name,
                             String gender, String email, String address, String group){
        PhoneBook phoneBook=new PhoneBook(number,name,gender,email,address,group);
        phoneBookArrayList.add(phoneBook);

    }
    public boolean editPhoneBook(ArrayList<PhoneBook>phoneBookArrayList, int number, Scanner scanner){
        boolean isCheckExist=false;
        for (PhoneBook phoneBook:phoneBookArrayList){
            if (Integer.parseInt(phoneBook.getNumberPhone())==number){
                System.out.println("nhap sdt moi:");
                String sdt=scanner.nextLine();
                phoneBook.setNumberPhone(sdt);
                System.out.println("nhap ten moi:");
                String name=scanner.nextLine();
                phoneBook.setName(name);
                System.out.println("nhap gioi tinh moi:");
                String gender=scanner.nextLine();
                phoneBook.setGerder(gender);
                System.out.println("nhap email moi:");
                String email=scanner.nextLine();
                phoneBook.setEmail(email);
                System.out.println("nhap nhom moi:");
                String group=scanner.nextLine();
                phoneBook.setGroup(group);
                System.out.println("nhap dia chi moi:");
                String address=scanner.nextLine();
                phoneBook.setAddress(address);
                isCheckExist=true;
            }
        }
        return isCheckExist;
    }
    public boolean remove(ArrayList<PhoneBook>phoneBookArrayList, int number){
        boolean isCheckExist=false;
        for (int i=0;i<phoneBookArrayList.size();i++) {
            if (Integer.parseInt(phoneBookArrayList.get(i).getNumberPhone()) == number) {
                phoneBookArrayList.remove(phoneBookArrayList.get(i));
                isCheckExist=true;
            }
        }
        return isCheckExist;
    }
    public boolean searchInt(ArrayList<PhoneBook>phoneBookArrayList, int number){
        boolean ischeck=false;
        for (PhoneBook phoneBook:phoneBookArrayList){
            if (Integer.parseInt(phoneBook.getNumberPhone())==number){
                phoneBook.showPhoneBook();
                ischeck=true;
            }
        }
        return ischeck;
    }
}
