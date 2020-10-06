package d34SwingJTextField;

import javax.swing.*;
import java.awt.event.*;

public class ProblemOne extends JFrame implements ActionListener {
    private JLabel label, label_muestra;
    private JButton button;
    private JTextField textBox;
    
    public ProblemOne() {
        setLayout(null);
        
        label = new JLabel("Usuario");
        label.setBounds(10,10,100,30);
        add(label);
        
        textBox = new JTextField();
        textBox.setBounds(120,10,150,20);
        add(textBox);
            
        button = new JButton("Enviar");
        button.setBounds(10,80,100,30);
        add(button);
        button.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==button) {
            String text = textBox.getText();
            setTitle(text);            
        }
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.setBounds(0,0,400,350);
        po.setVisible(true);
    }
    
}
