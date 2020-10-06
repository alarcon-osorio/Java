package c32SwingJLabel;

import javax.swing.*;

public class ProblemOne extends JFrame{
    private JLabel label1, label2;
    
    public ProblemOne() {
        //Posición por Default
        setLayout(null);
        
        //Label2 
        label1 = new JLabel("Sistema de Facturación");        
        label1.setBounds(10,20,300,30);
        add(label1);  
        
        //Label2 
        label2 = new JLabel("Version 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);        
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.setBounds(0, 0, 400, 200);
        po.setVisible(true);
        po.setResizable(false);
    }
}
