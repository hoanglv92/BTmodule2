import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class OverWriter {
    public void oVerWrite(boolean check, Scanner scanner, HashMap<String,String> dictionary, String eng, String src, String value) throws IOException {
        final int delete=1;
        if(check) {
            System.out.println("tim thay tu trong tu dien, nhap 1 neu muon sua va ghi de,so bat ki de huy");
            int tempNumber = scanner.nextInt();
            scanner.nextLine();
            if (tempNumber == delete) {
                dictionary.put(eng, value);
            } else {
                System.out.println("ban da huy ");
            }
        }
    }
}
