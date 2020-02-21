package a30SwingVisualInterface;

import javax.swing.*;

public class RepasoDos extends JFrame{
    private JLabel lbl;
    
    public RepasoDos(){
        setLayout(null);
        lbl = new JLabel("Repaso dos no olvidar extends");
        lbl.setBounds(10,20,300,400);
        add(lbl);
    }
    
    public static void main(String[] args) {
        RepasoDos rd = new RepasoDos();
        rd.setBounds(100,200,300,400);
        rd.setVisible(true);
    }
}
