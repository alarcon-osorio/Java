package d34SwingJTextField;

import javax.swing.*;
import java.awt.event.*;

public class ProblemTwo extends JFrame implements ActionListener  {
    private JTextField textbox1, textbox2;
    private JButton button;

    public ProblemTwo() {
        setLayout(null);
        
        textbox1 = new JTextField();
        textbox1.setBounds(10,10,100,30);
        add(textbox1);
        
        textbox2 = new JTextField();
        textbox2.setBounds(10,50,100,30);
        add(textbox2);
        
        button = new JButton("Sumar");
        button.setBounds(10,90,100,30);
        add(button);
        button.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button) {
            int numero1 = Integer.parseInt(textbox1.getText());
            int numero2 = Integer.parseInt(textbox2.getText());
            int suma = numero1 + numero2;
            String total = String.valueOf(suma);
            setTitle(total);
        }          
    }
    
    public static void main(String[] args) {
        ProblemTwo pt = new ProblemTwo();
        pt.setBounds(0,0,400,350);
        pt.setVisible(true);
    }   

   
    
}
