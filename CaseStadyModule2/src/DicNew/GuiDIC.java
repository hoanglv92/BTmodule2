package DicNew;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GuiDIC extends JFrame{
    private JButton addButton;
    private JPanel panel1;
    private JButton stranlateButton;
    private JButton editButton;
    private JButton removeButton;
    private JButton resetButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton savaFileButton;
    public GuiDIC() {
        HashMap<String,String>hashMapDic=new HashMap<>();
        readTxtImportToHashMap(hashMapDic);
        ArrayList<String>arrayList=new ArrayList<>();
        add(panel1);
        setSize(600, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        stranlateButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stringKey=getTextArea1().getText();
                if (!"".equals(getTextArea1().getText())){
                    textArea2.setText(stranlate(hashMapDic,stringKey,arrayList));
                }else {
                    JOptionPane.showMessageDialog(panel1,"ban da bo trong o nhap du lieu");
                }
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                textArea2.setText("");
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String keyString=getTextArea1().getText();
                String valueString=getTextArea2().getText();
                if ((!"".equals(keyString))&&(!"".equals(valueString))) {
                    boolean isCheck=edit(hashMapDic, keyString);
                    if (isCheck) {
                        JOptionPane.showMessageDialog(panel1,"sua thanh cong");
                    }else {
                        JOptionPane.showMessageDialog(panel1,"tu ban nhap ko co trong tu dien");
                    }
                }else {
                    JOptionPane.showMessageDialog(panel1,"Nhap tu can sua  vao o input,va nghia cua no vao output");
                }
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("".equals(getTextArea1().getText())&&"".equals(getTextArea2().getText())){
                JOptionPane.showMessageDialog(panel1,"nhap tu tieng anh vao o input,va dich nghia vao o output.");
                }else {
                    String keyString=getTextArea1().getText();
                    boolean checkSuccess=addImleMent(hashMapDic,keyString);
                    if (checkSuccess){
                        JOptionPane.showMessageDialog(panel1,"them thanh cong");
                    }else {
                        JOptionPane.showMessageDialog(panel1, "them khong thanh cong");
                    }
                }
            }
        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        
        savaFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void readTxtImportToHashMap(HashMap<String,String> dictionary) {
        String src="/home/hoanglv/IdeaProjects/BTjava/CaseStadyModule2/src/DicNew/anhviet1.txt";
        try {
            InputStream in = new FileInputStream(src);
            Scanner scanner = new Scanner(new InputStreamReader(in, StandardCharsets.UTF_8));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n", ";");
            // regex
            Pattern p = Pattern.compile("@(.*?) /(.*?);;");
            Matcher m = p.matcher(content);
            while (m.find()) {
                dictionary.put(m.group(1),m.group(2));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    public String stranlate(HashMap<String,String>hashMapDictionaryEngToVn,String keyString,ArrayList<String>arrayList){
        boolean isCheck=isCheckStringKey(hashMapDictionaryEngToVn,keyString);
        String shows= "";
        if (isCheck) {
            for (HashMap.Entry < String, String > entry:hashMapDictionaryEngToVn.entrySet()){
                String key = entry.getKey();
                String value=entry.getValue();
                if (keyString.equals(key)){
                    return shows+=key+"="+value;
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(panel1,"tu ban nhap ko co trong tu dien,hien thi goi y tai o output.");
           return showSuggestions(keyString,hashMapDictionaryEngToVn,arrayList);

        }
        return shows;

    }
    public boolean edit(HashMap<String,String>hashMapDictionaryEngToVn,String keyString){
        boolean isCheck=isCheckStringKey(hashMapDictionaryEngToVn, keyString);
        boolean isedit=false;
        if (isCheck){
            for (HashMap.Entry < String, String > entry:hashMapDictionaryEngToVn.entrySet()) {
                String key = entry.getKey();
                String value=entry.getValue();
                if (keyString.equals(key)) {
                    isedit = true;

                }
            }
        }
        return isedit;
    }
    public String showDictionary(HashMap<String,String> hashMapDictionaryEngToVn){
        String string="";
        for (HashMap.Entry<String, String> entry : hashMapDictionaryEngToVn.entrySet()) {
            String key = entry.getKey();
            String value=entry.getValue();
            string+=key+"="+value+"\n";
        }
        return string;
    }

    public String showSuggestions(String stringKey,HashMap<String,String> hashMapDictionaryEngToVn,ArrayList<String>arrayList){
        String regex = stringKey + "(.*)";
        Pattern pattern = Pattern.compile(regex);
        for (HashMap.Entry<String, String> entry : hashMapDictionaryEngToVn.entrySet()) {
            String key = entry.getKey();
            Matcher matcher = pattern.matcher(key);
            if (matcher.find()){
                arrayList.add(key);
            }
        }
        String str="";
        for (int i=0;i<arrayList.size();i++){
            str+=arrayList.get(i)+"\n";
        }
        return str;
    }
    public boolean isCheckStringKey(HashMap<String,String>hashMapDictionaryEngToVn,String stringKey){
        boolean ischeck=false;
        for (HashMap.Entry<String,String> entry:hashMapDictionaryEngToVn.entrySet()){
            String key=entry.getKey();
            if (stringKey.equals(key)){
                ischeck=true;
            }
        }
        return ischeck;
    }
    public boolean addImleMent(HashMap<String,String>hashMapDictionaryEngToVn,String stringKey){
        boolean check=false;
        boolean isCheck=isCheckStringKey(hashMapDictionaryEngToVn,stringKey);
        if (isCheck){
            JOptionPane.showMessageDialog(panel1,"tu ban nhap da co trong tu dien");
        }else {
            String value=getTextArea2().getText();
            hashMapDictionaryEngToVn.put(stringKey,value);
            check= true;
        }
        return check;
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
