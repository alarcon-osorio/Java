package i39SwingJRadioButton;

import javax.swing.*;
//import javax.swing.event.*;
import java.awt.event.*;

public class ProblemOneProposed extends JFrame implements ActionListener{
    private JTextField numero1, numero2;
    private JRadioButton radio1, radio2;
    private ButtonGroup buttongroup;
    private JButton button;
    
    public ProblemOneProposed() {
        setLayout(null);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buttongroup = new ButtonGroup(); // Indispensable para que el Radio Button nos e mantenga checkado
        numero1 = new JTextField();
        numero1.setBounds(5,5,100,30);
        add(numero1);        
        
        numero2 = new JTextField();
        numero2.setBounds(5,40,100,30);
        add(numero2);
        
        radio1 = new JRadioButton("Sumar");
        radio1.setBounds(120,5,100,30);
        add(radio1);
        buttongroup.add(radio1);
        
        radio2 = new JRadioButton("Restar");
        radio2.setBounds(220,5,100,30);
        add(radio2);
        buttongroup.add(radio2);
        
        button = new JButton("Enviar");
        button.setBounds(120,40,100,30);
        add(button);
        button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==button) {
            String texto1 = numero1.getText();
            String texto2 = numero2.getText();
            if (radio1.isSelected()) {
                int number1 = Integer.parseInt(texto1);           
                int number2 = Integer.parseInt(texto2); 
                int suma = number1 + number2;
                setTitle(String.valueOf(suma));
            }
            if (radio2.isSelected()) {            
                int number1 = Integer.parseInt(texto1);           
                int number2 = Integer.parseInt(texto2); 
                int resta = number1 - number2;
                setTitle(String.valueOf(resta));
            }
        }
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.setVisible(true);
    }

}
