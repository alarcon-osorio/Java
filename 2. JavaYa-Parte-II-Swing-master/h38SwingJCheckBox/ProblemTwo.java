package h38SwingJCheckBox;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class ProblemTwo extends JFrame implements ChangeListener, ActionListener {
    private JLabel label;
    private JCheckBox check;
    private JButton button;
    
    public ProblemTwo() {
        setLayout(null);
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("Esta de acuerdo con las normas del servicio: ");
        label.setBounds(5,5,600,30);
        add(label);
        
        check = new JCheckBox("Acepto");
        check.setBounds(5,40,100,30);
        check.addChangeListener(this);
        add(check);
        
        button = new JButton("Continuar");
        button.setBounds(5,80,100,30);
        button.setEnabled(false);
        button.addActionListener(this);
        add(button);
        
    }
    
    public void stateChanged(ChangeEvent ce) {
        if (check.isSelected() == true) {
           button.setEnabled(true); 
        }else{
            button.setEnabled(false); 
        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==button) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        ProblemTwo pt = new ProblemTwo();
        pt.setVisible(true);
    }
    
}
