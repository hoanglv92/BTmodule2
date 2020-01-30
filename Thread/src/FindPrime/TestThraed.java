package FindPrime;

import java.util.Scanner;

public class TestThraed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số để tìm số nguyên tố:");
        int num=sc.nextInt();
        Thread lazyPrimeThread=new LazyPrimeFactorization(num);
        Thread optimiThread=new OptimizedPrimeFactorization(num);
        lazyPrimeThread.setName("chưa tối ưu");
        optimiThread.setName("đã tối ưu");
        lazyPrimeThread.start();
        optimiThread.start();
    }
}
