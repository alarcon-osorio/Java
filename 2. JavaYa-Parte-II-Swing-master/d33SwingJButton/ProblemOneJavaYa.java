package d33SwingJButton;

import javax.swing.*;
import java.awt.event.*;

public class ProblemOneJavaYa extends JFrame implements ActionListener {
    JButton boton1;
    public ProblemOneJavaYa() {
        setLayout(null);
        boton1=new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            System.exit(0);
        }
    }
    
    public static void main(String[] ar) {
        ProblemOneJavaYa formulario1=new ProblemOneJavaYa();
        formulario1.setBounds(0,0,450,350);
        formulario1.setVisible(true);
    }
}
