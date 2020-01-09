public class FizzBuzz {
    private int number;

    public FizzBuzz() {
    }

    public FizzBuzz(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void stranLateNumber(int number){
        if(number<100&&number>=10) {
            int fistNumber=number/10;
            int lastNumber=number-(fistNumber*10);
            if(fistNumber==3||fistNumber==5||lastNumber==3||lastNumber==5){
                if(fistNumber==3||lastNumber==3){
                    System.out.println("fizz");
                }
                if(fistNumber==5||lastNumber==5){
                    System.out.println("buzz");
                }
            }else {
                switch (fistNumber){
                    case 1:
                        System.out.println("mot");
                        break;
                    case 2:
                        System.out.println("hai");
                        break;
                    case 4:
                        System.out.println("bon");
                        break;
                    case 6:
                        System.out.println("sau");
                        break;
                    case 7:
                        System.out.println("bay");
                        break;
                    case 8:
                        System.out.println("tam");
                        break;
                    case 9:
                        System.out.println("chin");
                        break;
                }
                switch (lastNumber){
                    case 0:
                        System.out.println("mươi");
                    case 1:
                        System.out.println("một");
                        break;
                    case 2:
                        System.out.println("hai");
                        break;
                    case 4:
                        System.out.println("bon");
                        break;
                    case 6:
                        System.out.println("sau");
                        break;
                    case 7:
                        System.out.println("bay");
                        break;
                    case 8:
                        System.out.println("tam");
                        break;
                    case 9:
                        System.out.println("chin");
                        break;
                }
            }
        }
        if(number<10){
            switch (number) {
                case 1:
                    System.out.println("một");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 4:
                    System.out.println("bon");
                    break;
                case 6:
                    System.out.println("sau");
                    break;
                case 7:
                    System.out.println("bay");
                    break;
                case 8:
                    System.out.println("tam");
                    break;
                case 9:
                    System.out.println("chin");
                    break;
            }
        }
    }
}
