package d34SwingJTextField;

import javax.swing.*;
import java.awt.event.*;

public class RepasoUno extends JFrame implements ActionListener{
    private JTextField textbox; 
    private JButton button;
    private String texto;
       
    
    public RepasoUno() {
        setLayout(null);
        
        textbox = new JTextField();
        textbox.setBounds(10,10,100,30);
        add(textbox);
        
        button = new JButton("Enviar");
        button.setBounds(10,40,100,30);
        add(button);
        button.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==button) {
            texto = textbox.getText();
            setTitle(texto);            
        }
    }
    
    public static void main(String[] args) {
           RepasoUno ru = new RepasoUno();
           ru.setBounds(0,0,200,150);
           ru.setVisible(true);
    }
}
