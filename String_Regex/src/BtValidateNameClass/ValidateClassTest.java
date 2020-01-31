package BtValidateNameClass;

import Validataemail.ValidateEmail;

import java.util.Scanner;

public class ValidateClassTest {
    public static void main(String[] args) {
        ValidateNameClass validateNameClass=new ValidateNameClass();
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao ten lop");
        String nameClass=sc.nextLine();
       boolean isvalid = ValidateNameClass.vsalidNameClass(nameClass);
        if(isvalid){
            System.out.println("ban nhap tk:" +nameClass +" "+isvalid);
        }else {
            System.out.println("ban nhap ko dung dinh dang");
        }
    }
}
