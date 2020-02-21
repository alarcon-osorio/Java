package f36SwingJComboBox;

import javax.swing.*;
import java.awt.event.*;

public class RepasoCuatro extends JFrame implements ItemListener{
    private JComboBox combo;
    
    public RepasoCuatro() {
        setLayout(null);
        
        combo = new JComboBox();
        combo.setBounds(5,5,200,20);
        add(combo);
        combo.addItem("1");
        combo.addItem("2");
        combo.addItem("3");
        combo.addItemListener(this);
    }
    
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource()==combo) {
            String seleccion = (String) combo.getSelectedItem();
            setTitle(seleccion);
        }
    }
    
    public static void main(String[] args) {
        RepasoCuatro rc = new RepasoCuatro();
        rc.setBounds(0,0,250,150);
        rc.setVisible(true);
    }
}
