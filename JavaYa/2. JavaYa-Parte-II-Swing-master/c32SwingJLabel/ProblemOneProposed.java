package c32SwingJLabel;

import javax.swing.*;

public class ProblemOneProposed extends JFrame{
    private JLabel label1, label2, label3;
    
    public ProblemOneProposed() {
        setLayout(null);
        label1 = new JLabel("Rojo");
        label1.setBounds(10,20,300,30);
        add(label1);
        
        label2 = new JLabel("Azul");
        label2.setBounds(10,40,300,30);
        add(label2);
        
        label3 = new JLabel("Verde");
        label3.setBounds(10,60,300,30);
        add(label3);
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.setBounds(0,0,300,200);
        pop.setVisible(true);
        pop.setResizable(true);
    }
}
