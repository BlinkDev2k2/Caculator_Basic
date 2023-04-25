package View;

import Control.Control_Caculator;
import Model.Model_Caculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View_Caculator extends JFrame {
    private Model_Caculator mc;
    private JTextField st1, nd2;
    private JTextArea ans;

    public View_Caculator (){
        this.mc = new Model_Caculator();
        this.Layout();
    }

    public void Layout(){
        this.setSize(new Dimension(400, 600));
        this.setLocationRelativeTo(null);
        this.setTitle("Caculator");
        Font f = new Font("Arial", Font.BOLD, 20);

        ActionListener ac = new Control_Caculator(this);

        // create jpanel button
        JPanel button = new JPanel();
        button.setPreferredSize(new Dimension(400, 300));
        button.setLayout(new GridLayout(2,4, 10,10));

        JPanel io = new JPanel();
        io.setPreferredSize(new Dimension(400, 300));
        io.setLayout(new GridLayout(3,2, 5,10));

        // creat button
        JButton sum = new JButton("+");
        sum.addActionListener(ac);
        sum.setFont(f);
        JButton sub = new JButton("-");
        sub.addActionListener(ac);
        sub.setFont(f);
        JButton mul = new JButton("*");
        mul.addActionListener(ac);
        mul.setFont(f);
        JButton div = new JButton("/");
        div.addActionListener(ac);
        div.setFont(f);
        JButton mod = new JButton("Mod");
        mod.addActionListener(ac);
        mod.setFont(f);
        JButton pow = new JButton("^");
        pow.addActionListener(ac);
        pow.setFont(f);

        button.add(sum);
        button.add(sub);
        button.add(mul);
        button.add(div);
        button.add(mod);
        button.add(pow);

        JLabel t1 = new JLabel("Value 1st");
        JLabel t2 = new JLabel("Value 2nd");
        JLabel jl = new JLabel("Answer");

        st1 = new JTextField(50);
        st1.setFont(f);
        io.add(t1);
        io.add(st1);
        nd2 = new JTextField(50);
        nd2.setFont(f);
        io.add(t2);
        io.add(nd2);
        ans = new JTextArea();
        ans.setFont(f);
        io.add(jl);
        io.add(ans);


        this.setLayout(new BorderLayout(10,10));
        this.add(button, BorderLayout.SOUTH);
        this.add(io, BorderLayout.CENTER);
    }

    public void JSum(){
        float j1 = Float.valueOf(st1.getText());
        float j2 = Float.valueOf(nd2.getText());
        mc.setS1(j1);
        mc.setS2(j2);
        ans.setText(String.valueOf(mc.Sum()));
    }

    public void JSub(){
        float j1 = Float.valueOf(st1.getText());
        float j2 = Float.valueOf(nd2.getText());
        mc.setS1(j1);
        mc.setS2(j2);
        ans.setText(String.valueOf(mc.Sub()));
    }

    public void JMul(){
        float j1 = Float.valueOf(st1.getText());
        float j2 = Float.valueOf(nd2.getText());
        mc.setS1(j1);
        mc.setS2(j2);
        ans.setText(String.valueOf(mc.Mul()));
    }

    public void JDiv(){
        float j1 = Float.valueOf(st1.getText());
        float j2 = Float.valueOf(nd2.getText());
        mc.setS1(j1);
        mc.setS2(j2);
        ans.setText(String.valueOf(mc.Div()));
    }

    public void JMod(){
        float j1 = Float.valueOf(st1.getText());
        float j2 = Float.valueOf(nd2.getText());
        mc.setS1(j1);
        mc.setS2(j2);
        ans.setText(String.valueOf(mc.Mod()));
    }

    public void JPow(){
        float j1 = Float.valueOf(st1.getText());
        float j2 = Float.valueOf(nd2.getText());
        mc.setS1(j1);
        mc.setS2(j2);
        ans.setText(String.valueOf(mc.Pow()));
    }

    public void Display(){
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
}
