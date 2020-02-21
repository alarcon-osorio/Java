package h38SwingJCheckBox;

import javax.swing.*;
import javax.swing.event.*;

public class ProblemOneProposed extends JFrame implements ChangeListener{
    private JLabel label;
    private JCheckBox navegador1, navegador2, navegador3;
    
    public ProblemOneProposed() {
        setLayout(null);
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("Seleccione los nombre de los paises");
        label.setBounds(5,5,600,30);
        add(label);
        
        navegador1 = new JCheckBox("Chrome");
        navegador1.setBounds(5,40,100,30);
        navegador1.addChangeListener(this);
        add(navegador1);        
        
        navegador2 = new JCheckBox("Intenet");
        navegador2.setBounds(5,75,100,30);
        navegador2.addChangeListener(this);
        add(navegador2);        
        
        navegador3 = new JCheckBox("Mozilla");
        navegador3.setBounds(5,110,100,30);
        navegador3.addChangeListener(this);
        add(navegador3);        
    }
    
    public void stateChanged(ChangeEvent ce) {
        String texto = "";
        if (navegador1.isSelected() == true) {
            texto += navegador1.getText() + " ~ ";
            setTitle(texto);
        }
        if (navegador2.isSelected() == true) {
            texto += navegador2.getText() + " ~ ";
            setTitle(texto);
        }
        if (navegador3.isSelected() == true) {
            texto += navegador3.getText() + " ";
            setTitle(texto);
        }
        setTitle(texto);
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.setVisible(true);
    }
}
