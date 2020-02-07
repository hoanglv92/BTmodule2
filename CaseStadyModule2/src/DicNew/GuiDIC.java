package DicNew;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class GuiDIC extends JFrame{
    private JButton addButton;
    private JPanel panel1;
    private JButton stranlateButton;
    private JButton editButton;
    private JButton removeButton;
    private JButton resetButton;
    private JButton showDicButton;
    private JTextArea textArea1;
    private JTextArea textArea2;

    public GuiDIC() {
        add(panel1);
        setSize(600, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JButton getStranlateButton() {
        return stranlateButton;
    }

    public void setStranlateButton(JButton stranlateButton) {
        this.stranlateButton = stranlateButton;
    }

    public JButton getEditButton() {
        return editButton;
    }

    public void setEditButton(JButton editButton) {
        this.editButton = editButton;
    }

    public JButton getRemoveButton() {
        return removeButton;
    }

    public void setRemoveButton(JButton removeButton) {
        this.removeButton = removeButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public void setResetButton(JButton resetButton) {
        this.resetButton = resetButton;
    }

    public JButton getShowDicButton() {
        return showDicButton;
    }

    public void setShowDicButton(JButton showDicButton) {
        this.showDicButton = showDicButton;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public JTextArea getTextArea2() {
        return textArea2;
    }

    public void setTextArea2(JTextArea textArea2) {
        this.textArea2 = textArea2;
    }
}
