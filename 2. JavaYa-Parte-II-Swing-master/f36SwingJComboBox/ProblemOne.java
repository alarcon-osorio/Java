package f36SwingJComboBox;

import javax.swing.*;
import java.awt.event.*;

public class ProblemOne extends JFrame implements ItemListener {
    private JComboBox combo;
    
    public ProblemOne() {
        setLayout(null);
        combo = new JComboBox();
        combo.setBounds(10,10,80,20);
        add(combo);
        combo.addItem("Uno");
        combo.addItem("Dos");
        combo.addItem("Tres");
        combo.addItem("Cuatro");
        combo.addItemListener(this);
    }
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource()== combo) {
            String seleccion = (String)combo.getSelectedItem(); 
            setTitle(seleccion);
        }  
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.setBounds(0,0,200,150);
        po.setVisible(true);
    }   
}
