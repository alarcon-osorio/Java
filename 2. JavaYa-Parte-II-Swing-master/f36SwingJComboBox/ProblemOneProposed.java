package f36SwingJComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProblemOneProposed extends JFrame implements ActionListener, ItemListener {
    private JLabel label;
    private JTextField textbox;
    private JComboBox combo;
    private JButton button;   
    private String seleccionado, texto;
    
    public ProblemOneProposed() {
        setLayout(null);
        
        label = new JLabel("Ingrese Nombre:");
        label.setBounds(5,5,100,30);
        add(label);
        
        textbox = new JTextField();
        textbox.setBounds(5,40,200,30);
        add(textbox);
        
        combo = new JComboBox();
        combo.setBounds(5,85,200,30);
        add(combo);
        combo.addItem("Seleccione");
        combo.addItem("Colombia");
        combo.addItem("Peru");
        combo.addItem("Venezuela");
        combo.addItemListener(this);
        
        button = new JButton("Enviar");
        button.setBounds(5,120,100,30);
        add(button);
        button.addActionListener(this);
    }    
     
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getSource()==combo) {
           seleccionado = (String) combo.getSelectedItem();   
            if (seleccionado == "Seleccione") {
                seleccionado = "No selecciono pais";
            }
        }
    }
    
    @Override
    public void actionPerformed (ActionEvent ae) {
        if (ae.getSource()==button) {
            texto = textbox.getText();
            setTitle("Nombre: " + texto + " Pais: " + seleccionado );
        }
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.setBounds(0,0,400,350);
        pop.setVisible(true);
    }    
}
