package aStructureDinamicsListTypeSyack.ProblemApplication;

import javax.swing.*;
import java.awt.event.*;

public class Formula extends JFrame implements ActionListener{
    private JTextField textbox;
    private JButton button;
    
    public Formula() {
        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Listas tipo PILA");

        textbox = new JTextField("{2*(4-5)-{3*4}-[4-5]}");
        textbox.setBounds(5, 5, 300, 30);
        add(textbox);
        
        button= new JButton("Enviar");
        button.setBounds(5,40,100,30);
        add(button);
        button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==button) {
            if (balanceada()) {
                setTitle("SI Esta correctamente balanceada");
            }else{
                setTitle("NO Esta correctamente balanceada");
            }
        }
    }
    
    public boolean balanceada () {
        Pila pila = new Pila();
        String cadena = textbox.getText();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
                pila.insertar(cadena.charAt(i));
            }else{
                if (cadena.charAt(i) == ')') {
                    if (pila.extraer()!='(') {
                        return false;
                    }
                }else{
                    if (cadena.charAt(i) == ']') {                     
                        if (pila.extraer() != '[') {
                            return false;
                        }
                    }else{
                        if (cadena.charAt(i) == '}') {
                            if (pila.extraer() != '{') {
                                return false;
                            }
                        }           
                    }
                }
            }
        }
        if (pila.vacia()) {
            return true;
        }else{            
            return false;
        }
    }
    
    public static void main(String[] args) {
        Formula formula = new Formula();
        formula.setVisible(true);
    }
}
