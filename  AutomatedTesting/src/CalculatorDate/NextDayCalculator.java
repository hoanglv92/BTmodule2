package CalculatorDate;



import java.util.Scanner;

public class NextDayCalculator {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int day;
        int month;
        int year;
        int daySecond = 0;
        System.out.println("hãy nhập vào ngày tháng năm cân tính ngày tiếp theo : ");
        System.out.println("ngày: ");
        day=sc.nextInt();
        System.out.println("tháng: ");
        month=sc.nextInt();
        int monthSecond = month+1;
        System.out.println("năm: ");
        year=sc.nextInt();
        int yearSecond=year;
        if(checkLeapYear(year)){
            if(month==2){
                if(day>=1&&day<=28){
                    daySecond=day+1;
                }else if (day==29){
                    daySecond=1;
                    monthSecond=month+1;
                    }else {
                    System.out.println("tháng 2 không thể quá 29 ngày");
                }
            }
            if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                if (day>=1&&day<=30){
                    daySecond=day+1;
                }else if (day==31){
                        daySecond=1;
                        monthSecond=month+1;
                        if(month==12){
                            monthSecond=1;
                            yearSecond=year+1;
                        }else {
                            month+=1;
                        }
                }
            }
            if(month==4||month==6||month==9||month==11){
                if(day>=1&&day<=29){
                    daySecond=day+1;
                }else if(day==30){
                    daySecond=1;
                    monthSecond=month+1;
                }
            }
        }else {
            if (month == 2) {
                if (day >= 1 && day <= 27) {
                    daySecond = day + 1;
                } else if (day == 28) {
                    daySecond = 1;
                    monthSecond =month+ 1;
                } else {
                    System.out.println("tháng 2 không thể quá 29 ngày");
                }
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day >= 1 && day <= 30) {
                    daySecond = day + 1;
                } else if (day == 31) {
                    daySecond = 1;
                    if (month == 12) {
                        monthSecond = 1;
                        yearSecond=year+1;
                    } else {
                        month += 1;
                    }
                }
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day >= 1 && day <= 29) {
                    daySecond = day + 1;
                } else if (day == 30) {
                    daySecond = 1;
                    monthSecond =month+ 1;
                }
            }
        }

        System.out.println("ngày tiếp theo là :"+daySecond+"/"+monthSecond+"/"+yearSecond);
}
    public static boolean checkLeapYear(int year){
        if(year%4==0||year%400==0){
            return true;
        }
        return false;
}
}