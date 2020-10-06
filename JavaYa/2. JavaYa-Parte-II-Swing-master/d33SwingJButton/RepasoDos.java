package d33SwingJButton;

import javax.swing.*;
import java.awt.event.*;

public class RepasoDos extends JFrame implements ActionListener {
    private JButton button1,button2,button3;
    
    public RepasoDos() {
        setLayout(null);
        
        button1 = new JButton("Boton 1");
        button1.setBounds(10,100,90,30);
        add(button1);
        button1.addActionListener(this);
        
        button2 = new JButton("Boton 2");
        button2.setBounds(10,140,90,30);
        add(button2);
        button2.addActionListener(this);
        
        button3 = new JButton("Boton 3");
        button3.setBounds(10,180,90,30);
        add(button3);
        button3.addActionListener(this);       
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button1) {
            setTitle("Boton 1");
        }if (e.getSource()==button2) {
            setTitle("Boton 2");           
        }if (e.getSource()==button3) {
            setTitle("Boton 3"); 
        }    
    }  
    
    public static void main(String[] args) {
        RepasoDos rd = new RepasoDos();
        rd.setBounds(0,0,400,300);
        rd.setVisible(true);
    }
}
