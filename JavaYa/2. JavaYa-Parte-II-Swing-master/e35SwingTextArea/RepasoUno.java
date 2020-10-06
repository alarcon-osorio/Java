package e35SwingTextArea;

import javax.swing.*;
import java.awt.event.*;

public class RepasoUno extends JFrame implements ActionListener{
    private JTextArea textarea;
    private JScrollPane scroll;
    private JButton button;
    private String texto;
    
    public RepasoUno() {
        setLayout(null);
        
        textarea = new JTextArea();
        scroll = new JScrollPane(textarea);        
        scroll.setBounds(5,10,200,200);
        add(scroll);
        
        button = new JButton("Enviar");
        button.setBounds(220,10,100,30);
        add(button);
        button.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==button) {
            texto = textarea.getText();
            if (texto.equalsIgnoreCase("Colombia") == true) {
                setTitle("Contiene Colombia");
            }else{
                setTitle("NO Contiene Colombia");
            }
        }
    }
    
    public static void main(String[] args) {
        RepasoUno ru = new RepasoUno();
        ru.setBounds(0,0,350,260);
        ru.setVisible(true);
    }
}
