package a30SwingVisualInterface;

import javax.swing.*;

public class RepasoTres extends JFrame{
    private JLabel label;
    
    public RepasoTres() {
        label = new JLabel("Repaso Tres");
        setLayout(null);
        //COORDENADAS   X->   Y↓   Z<<- W↓↓ 
        label.setBounds(80,  200,  30,  5);
        add(label);
    }
    
    public static void main(String[] args) {
        RepasoTres rt = new RepasoTres();
        rt.setBounds(100,200,300,400);
        rt.setVisible(true);
    }
}
