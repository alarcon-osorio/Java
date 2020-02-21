package b31SwingJFrame;

import javax.swing.*;

public class RepasoUno extends JFrame {
    public RepasoUno() {
        setLayout(null);
    }
    
    public static void main(String[] args) {
        RepasoUno ru = new RepasoUno();
        ru.setBounds(0,0,800,400); // 800x400 pixeles
        ru.setVisible(true); //Hace visible la ventana
        ru.setResizable(false); //NO se puede poner mas grande ni mas pequeña la ventana 
    }
    
}
