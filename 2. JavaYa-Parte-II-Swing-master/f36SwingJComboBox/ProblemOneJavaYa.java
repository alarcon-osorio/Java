package f36SwingJComboBox;

import javax.swing.*;
import java.awt.event.*;

public class ProblemOneJavaYa extends JFrame implements ItemListener{
    private JComboBox combo1;
    
    public ProblemOneJavaYa() {
        setLayout(null);
        combo1=new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);
        combo1.addItem("rojo");
        combo1.addItem("vede");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==combo1) {
            String seleccionado=(String)combo1.getSelectedItem();
            setTitle(seleccionado);
        }
    }
    
    public static void main(String[] ar) {
        ProblemOneJavaYa formulario1=new ProblemOneJavaYa();
        formulario1.setBounds(0,0,200,150);
        formulario1.setVisible(true);
    }    
}