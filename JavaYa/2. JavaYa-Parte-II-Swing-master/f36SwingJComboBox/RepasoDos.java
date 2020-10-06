package f36SwingJComboBox;

import javax.swing.*;
import java.awt.event.*;

public class RepasoDos extends JFrame implements ItemListener {
    private JComboBox combo;   
    private String seleccion;
    
    public RepasoDos() {
        setLayout(null);
        
        combo = new JComboBox();
        combo.setBounds(5,5,100,20);
        add(combo);
        combo.addItem("Seleccione");
        combo.addItem("1");
        combo.addItem("2");
        combo.addItem("3");
        combo.addItemListener(this);
    }
    
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource() == combo) {
            seleccion = (String) combo.getSelectedItem();
            if (seleccion.equalsIgnoreCase("Seleccione") == true) {
                setTitle(""); 
            }else{
                setTitle(seleccion);
            }                            
        }
    }    
    
    public static void main(String[] args) {
        RepasoDos rd = new RepasoDos();
        rd.setBounds(0,0,250,100);
        rd.setVisible(true);
    }
    
}
