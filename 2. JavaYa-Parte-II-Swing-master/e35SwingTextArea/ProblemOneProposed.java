package e35SwingTextArea;

import javax.swing.*;
import java.awt.event.*;

public class ProblemOneProposed extends JFrame implements ActionListener{
    private JTextArea textarea1, textarea2;
    private JScrollPane scroll1, scroll2;
    private JButton button;
    String text1, text2;
    
    public ProblemOneProposed() {
        setLayout(null);
        
        textarea1 = new JTextArea();
        scroll1 = new JScrollPane(textarea1);
        scroll1.setBounds(10,10,200,140);
        add(scroll1);
        
        textarea2 = new JTextArea();
        scroll2 = new JScrollPane(textarea2);
        scroll2.setBounds(220,10,200,140);
        add(scroll2);
        
        button = new JButton("Validar");
        button.setBounds(10,170,150,30);
        add(button);
        button.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==button) {
            text1 = textarea1.getText();
            text2 = textarea2.getText();
            if (text1.equals(text2) == true) {
                setTitle("Los textos son exactamente Igules");
            }else{
                setTitle("Los textos NO son iguales");
            }
        }        
    }

    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.setBounds(0,0,500,350);
        pop.setVisible(true);
        pop.setResizable(true);
    }   
}
