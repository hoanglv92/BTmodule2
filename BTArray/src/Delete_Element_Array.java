import java.util.Scanner;

public class Delete_Element_Array {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                int cout=students.length-1;
                for (int j=i;j<=cout;j++){
                    students[i]=students[i+1];
                }cout--;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + input_name + " in the list.");

        System.out.println("mảng sau khi xóa 1 phần tử :");
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

    }
}
