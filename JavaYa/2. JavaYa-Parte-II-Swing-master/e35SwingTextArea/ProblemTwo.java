package e35SwingTextArea;

import javax.swing.*;
import java.awt.event.*;

public class ProblemTwo extends JFrame implements ActionListener {
    private JTextArea textarea;
    private JScrollPane scroll;
    private JButton button;
    private String texto;
    
    public ProblemTwo() {
        setLayout(null);
        
        textarea = new JTextArea();
        scroll = new JScrollPane(textarea);
        scroll.setBounds(10,10,300,200);
        add(scroll);
        
        button = new JButton("Validar");
        button.setBounds(10,260,100,30);
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==button) {
            texto = textarea.getText();
            if (texto.indexOf("argentina") != -1) {
                setTitle("SI contiene argentina");
            }else{
                setTitle("NO contiene argentina");
            }
        }
    }
    
    public static void main(String[] args) {
        ProblemTwo po = new ProblemTwo();
        po.setBounds(0,0,350,350);
        po.setVisible(true);
    }
}
