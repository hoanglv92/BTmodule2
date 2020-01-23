import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowAdapter;

public class Dictionary {
    private JPanel Dictionary;
    private JTextField input;
    private JButton search;
    private JTextField output;
    private JButton show;
    private JButton delete;
    private JButton repaid;
    private JButton add;

    public JPanel getDictionary() {
        return Dictionary;
    }

    public void setDictionary(JPanel dictionary) {
        Dictionary = dictionary;
    }

    public JTextField getInput() {
        return input;
    }

    public void setInput(JTextField input) {
        this.input = input;
    }

    public JButton getSearch() {
        return search;
    }

    public void setSearch(JButton search) {
        this.search = search;
    }

    public JTextField getOutput() {
        return output;
    }

    public void setOutput(JTextField output) {
        this.output = output;
    }

    public JButton getShow() {
        return show;
    }

    public void setShow(JButton show) {
        this.show = show;
    }

    public JButton getDelete() {
        return delete;
    }

    public void setDelete(JButton delete) {
        this.delete = delete;
    }

    public JButton getRepaid() {
        return repaid;
    }

    public void setRepaid(JButton repaid) {
        this.repaid = repaid;
    }

    public JButton getAdd() {
        return add;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
