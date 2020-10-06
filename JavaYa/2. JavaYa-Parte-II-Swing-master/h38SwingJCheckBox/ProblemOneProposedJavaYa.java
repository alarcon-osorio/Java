package h38SwingJCheckBox;

import javax.swing.*;

import java.awt.event.*;
public class ProblemOneProposedJavaYa extends JFrame implements ActionListener {
    private JCheckBox check1,check2,check3;
    private JButton boton1;
    
    public ProblemOneProposedJavaYa() {
        setLayout(null);
        check1=new JCheckBox("Chrome");
        check1.setBounds(10,10,150,30);
        add(check1);
        
        check2=new JCheckBox("FireFox");
        check2.setBounds(10,50,150,30);      
        add(check2);
        
        check3=new JCheckBox("Opera");
        check3.setBounds(10,90,150,30);        
        add(check3);  
        
        boton1=new JButton("Confirmar");
        boton1.setBounds(10,140,100,30);
        boton1.addActionListener(this);
        add(boton1);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            String cad="";
            if (check1.isSelected()==true) {
                cad=cad+"Chrome-";
            }
            if (check2.isSelected()==true) {
                cad=cad+"FireFox-";
            }
            if (check3.isSelected()==true) {
                cad=cad+"Opera-";
            }
            setTitle(cad);        	
        }
    }
    public static void main(String[] ar) {
        ProblemOneProposedJavaYa formulario1 = new ProblemOneProposedJavaYa();
        formulario1.setBounds(0,0,350,230);
        formulario1.setVisible(true);
    } 	
}
