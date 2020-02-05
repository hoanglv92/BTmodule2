import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class DicGui extends JFrame {
    private JTextArea output;
    private JTextArea input;
    private JButton editButton;
    private JButton addButton;
    private JButton stranlateButton;
    private JButton deleteButton;


    public DicGui() {
        setTitle("phan mem tu dien");
        input=new JTextArea();
        input.setBounds(10,20,350,150);
        output=new JTextArea();
        output.setBounds(10,120,350,150);


    }
}
