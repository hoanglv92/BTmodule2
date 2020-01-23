import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Controller implements ActionListener {
    private Dictionary dictionaryview;
    private String input;
    private String output;
    public Controller(Dictionary dictionaryview){
        this.dictionaryview=dictionaryview;
        dictionaryview.getInput().addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
