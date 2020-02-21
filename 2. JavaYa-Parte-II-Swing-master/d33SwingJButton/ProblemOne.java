package d33SwingJButton;

import javax.swing.*;
import java.awt.event.*;

public class ProblemOne extends JFrame implements ActionListener {
    private JButton button;
    
    public ProblemOne() {
        setLayout(null);
        button = new JButton("Enviar");
        button.setBounds(300,250,100,30);
        add(button);
        button.addActionListener(this);
    }
    
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button) {
            System.exit(0);            
        }
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.setBounds(0,0,450,350);
        po.setVisible(true);
    }
}
