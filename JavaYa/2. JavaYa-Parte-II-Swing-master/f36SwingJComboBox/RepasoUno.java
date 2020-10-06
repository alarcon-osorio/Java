package f36SwingJComboBox;

import javax.swing.*;
import java.awt.event.*;

public class RepasoUno extends JFrame implements ItemListener {
    private JComboBox combo;
    
    public RepasoUno() {
        setLayout(null);
        
        combo = new JComboBox();
        combo.setBounds(5,5,100,20);
        add(combo);
        //combo.addItem(this);
        //combo.addItemListener(this);
    }
   
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == combo) {
            String seleccion = (String) combo.getSelectedItem();
            setTitle(seleccion);
        }
    }
    
    public static void main(String[] args) {
        RepasoUno ru = new RepasoUno();
        ru.setBounds(0,0,250,100);
        ru.setVisible(true);
    }   
}
