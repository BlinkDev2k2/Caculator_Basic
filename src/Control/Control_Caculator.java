package Control;

import View.View_Caculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control_Caculator implements ActionListener {
    private View_Caculator vc;
    public Control_Caculator(View_Caculator vc){
        this.vc = vc;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String st = e.getActionCommand();
        switch (st){
            case "+":
                vc.JSum();
                break;
            case "-":
                vc.JSub();
                break;
            case "*":
                vc.JMul();
                break;
            case "/":
                vc.JDiv();
                break;
            case "Mod":
                vc.JMod();
                break;
            case "^":
                vc.JPow();
        }
    }
}
