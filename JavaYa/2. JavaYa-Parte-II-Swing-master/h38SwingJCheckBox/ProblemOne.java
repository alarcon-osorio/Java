package h38SwingJCheckBox;

import javax.swing.*;
import javax.swing.event.*;

public class ProblemOne extends JFrame implements ChangeListener{
    private JCheckBox check1, check2, check3;
    
    public ProblemOne() {
        setLayout(null);
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        check1 = new JCheckBox("Español");
        check1.setBounds(5,10,150,30);
        add(check1);
        check1.addChangeListener(this);
        
        check2 = new JCheckBox("Ingles");
        check2.setBounds(5,50,150,30);
        add(check2);
        check2.addChangeListener(this);
        
        check3 = new JCheckBox("Aleman");
        check3.setBounds(5,90,150,30);
        add(check3);
        check3.addChangeListener(this);
    }
    
    @Override
    public void stateChanged(ChangeEvent sc) {
        String cheked = "";
        if (check1.isSelected()== true) {
            cheked = cheked + "Español ";
        }
        if (check2.isSelected()== true) {
            cheked = cheked + "Ingles ";
        }
        if (check3.isSelected()== true) {
            cheked = cheked + "Aleman ";
        }
        setTitle(cheked);
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.setVisible(true);
    }
    
}
