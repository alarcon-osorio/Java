package f36SwingJComboBox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ProblemTwo extends JFrame implements ItemListener, ActionListener {
    private JComboBox combo1,combo2, combo3;  
    private JLabel label1, label2, label3;
    private JButton button;
    
    public ProblemTwo() {
        setLayout(null);
        
        label1 = new JLabel("Rojo");  
        label1.setBounds(5,5,60,20);
        add(label1);
        
        label2 = new JLabel("Verde");  
        label2.setBounds(5,30,60,20);
        add(label2);
        
        label3 = new JLabel("Azul");  
        label3.setBounds(5,55,60,20);
        add(label3);       
        
        combo1 = new JComboBox();
        combo1.setBounds(65,5,50,20);
        add(combo1);
        for (int i = 0; i <= 255; i++) {
            combo1.addItem(String.valueOf(i));
        }
        combo1.addItemListener(this);
        
        combo2 = new JComboBox();
        combo2.setBounds(65,30,50,20);
        add(combo2);
        for (int i = 0; i <= 255; i++) {
            combo2.addItem(String.valueOf(i));
        }
        combo2.addItemListener(this);
        
        combo3 = new JComboBox();
        combo3.setBounds(65,55,50,20);
        add(combo3);
        for (int i = 0; i <= 255; i++) {
            combo3.addItem(String.valueOf(i));
        }
        combo3.addItemListener(this);
        
        button = new JButton("Color");
        button.setBounds(5,85,100,30);
        add(button);
        button.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {   
        if (ae.getSource() == button) {
            String texto1 = (String) combo1.getSelectedItem();
            String texto2 = (String) combo2.getSelectedItem();
            String texto3 = (String) combo3.getSelectedItem();
            
            int rojo = Integer.parseInt(texto1);
            int verde = Integer.parseInt(texto2);
            int azul = Integer.parseInt(texto3);
            
            Color color = new Color(rojo,verde,azul);
            button.setBackground(color);
        }
    }
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == combo1) {
            String seleccion1 = (String) combo1.getSelectedItem();            
            setTitle("Intensidad de Rojo " + seleccion1);
        }else if(ie.getSource() == combo2){
            String seleccion2 = (String) combo2.getSelectedItem();            
            setTitle("Intensidad de Verde " + seleccion2);       
        }else if(ie.getSource() == combo3){
            String seleccion3 = (String) combo3.getSelectedItem();
            setTitle("Intensidad de Azul " + seleccion3);  
        }
    }   
    
    public static void main(String[] args) {
        ProblemTwo pt = new ProblemTwo();
        pt.setBounds(0,0,400,350);
        pt.setVisible(true);
    }

    
}
