package e35SwingTextArea;

import javax.swing.*;
import java.awt.event.*;

public class ProblemOne extends JFrame {
    private JTextField textbox;
    private JTextArea textarea;
    private JScrollPane scroll;

    public ProblemOne() {
        setLayout(null);
        
        textbox = new JTextField();
        textbox.setBounds(10,10,200,30);
        add(textbox);   
        
        textarea = new JTextArea();
        scroll = new JScrollPane(textarea);
        scroll.setBounds(10,50,400,300);
        add(scroll);       
    }

/* @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource) {
            
        }
    }
*/
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.setBounds(0,0,450,400);
        po.setVisible(true);
    }

}
