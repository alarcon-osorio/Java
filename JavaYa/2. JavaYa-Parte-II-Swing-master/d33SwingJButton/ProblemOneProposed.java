package d33SwingJButton;

import javax.swing.*;
import java.awt.event.*;

public class ProblemOneProposed extends JFrame implements ActionListener {
    private JButton button1, button2;
    
    public ProblemOneProposed() {
        setLayout(null);
        button1 = new JButton("Hombre");
        button1.setBounds(10,100,90,30);
        add(button1);
        button1.addActionListener(this);
        
        button2 = new JButton("Mujer");
        button2.setBounds(110,100,90,30);
        add(button2);
        button2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1) {
            setTitle("Hombre");
        }if (e.getSource()==button2) {
            setTitle("Mujer");
        }
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.setBounds(0,0,400,300);
        pop.setVisible(true);
    }
}
