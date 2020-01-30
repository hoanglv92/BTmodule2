import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class Controller implements ActionListener {
    private Dictionary dictionaryview;
    private String input;
    private String output;
    private HashMap<String ,String> dictionary;
    public Controller(Dictionary dictionaryview){
        this.dictionaryview=dictionaryview;
        dictionaryview.getInput().addActionListener(this);
    }

    public Dictionary getDictionaryview() {
        return dictionaryview;
    }

    public void setDictionaryview(Dictionary dictionaryview) {
        this.dictionaryview = dictionaryview;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public HashMap getDictionary() {
        return dictionary;
    }

    public void setDictionary(HashMap dictionary) {
        this.dictionary = dictionary;
    }

    private boolean isCheckInput(){
        boolean isValid=false;
        try {
            if(!"".equals(dictionaryview.getInput().getText())){
                isValid=true;
            }else {
                JOptionPane.showMessageDialog(dictionaryview,"bạn đã để trống ô input");
            }
        }catch (StringIndexOutOfBoundsException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(dictionaryview,"Bạn nhập không hợp lệ");
        }
        return isValid;
    }
    private void readTxtImportToHashMap(String src,HashMap<String,String> dictionary){
        
        try {
            File filetxt=new File(src);
            FileReader fileReader=new FileReader(filetxt);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
