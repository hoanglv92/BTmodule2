package DicNew;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        GuiDIC guiDIC=new GuiDIC();
        guiDIC.setVisible(true);

        int[] arr = new int[10];
    }
}
