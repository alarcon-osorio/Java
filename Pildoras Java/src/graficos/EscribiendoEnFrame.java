package graficos;

import javax.swing.*;
import java.awt.*;
//Video 58 - Swing IV - Aplicaciones graficas
public class EscribiendoEnFrame {
    public static void main(String[] args) {
        MarcoConTexto marco = new MarcoConTexto();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame{
    public MarcoConTexto() {
        setVisible(true);
        setTitle("Marco con Texto");
        setSize(600,450);
        setLocation(400,200);
        Lamina lamina = new Lamina();
        add(lamina);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g){ //sobreescribo el metodo
        g.drawString("Aprendiendo con Swing ", 100, 100);
    }
}
