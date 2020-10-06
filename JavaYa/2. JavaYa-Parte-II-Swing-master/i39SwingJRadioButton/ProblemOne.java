package i39SwingJRadioButton;

import javax.swing.*;
import javax.swing.event.*;

public class ProblemOne extends JFrame implements ChangeListener{
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup buttongroup;
    
    public ProblemOne() {
        setLayout(null);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buttongroup = new ButtonGroup();
        radio1 = new JRadioButton("600 * 600");
        radio1.setBounds(5,5,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        buttongroup.add(radio1);
        
        radio2 = new JRadioButton("1200 * 900");
        radio2.setBounds(5,40,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        buttongroup.add(radio2);
        
        radio3 = new JRadioButton("100 * 200");
        radio3.setBounds(5,75,100,30);
        radio3.addChangeListener(this);
        add(radio3);       
        buttongroup.add(radio3);
    }
    
    @Override
    public void stateChanged(ChangeEvent ce) {
        if (radio1.isSelected() == true) {
            setSize(600,600);
            setTitle("600 * 600");
        }
        if (radio2.isSelected() == true) {
            setSize(1200,900);
            setTitle("1200 * 900");
        }
        if (radio3.isSelected() == true) {
            setSize(100,200);
            setTitle("100 * 200");
        }
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.setVisible(true);
        po.setResizable(false);
    }
    
}
