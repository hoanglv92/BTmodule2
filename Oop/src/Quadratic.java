import java.util.Scanner;
class Account{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập a :");
        double a=sc.nextDouble();
        System.out.println("nhập b :");
        double b=sc.nextDouble();
        System.out.println("nhập c :");
        double c=sc.nextDouble();
        QuadraticEquation account=new QuadraticEquation(a,b,c);
        System.out.println(account.getDiscriminant());
        if(account.getDiscriminant()>0){
            System.out.println("phương trình có 2 nghiệm , nghiệm 1 : "+account.getRoot1()+" nghiêm 2 :"+account.getRoot2());
        }else if(account.getDiscriminant()==0){
            System.out.println("phương trình có 1 nghiêm là : "+account.getRoot1());
        }else {
            System.out.println("phương trình vô nghiệm ");
        }
    }
}
class QuadraticEquation{
    double a,b,c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return b*b -(4*a*c);
    }
    public double getRoot1(){
        return (-b+Math.sqrt(this.getDiscriminant()))/2*a;
    }
    public double getRoot2(){
        return (-b-Math.sqrt(this.getDiscriminant()))/2*a;
    }
}

