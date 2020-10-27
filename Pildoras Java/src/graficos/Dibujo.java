package graficos;

import javax.swing.*;
import java.awt.*;
//Video 59 - Swing V - Frame V Graficos con Java - Dibujos
public class Dibujo {
    public static void main(String[] args) {
        MarcoConDibujos marco = new MarcoConDibujos();
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConDibujos extends JFrame{
    public MarcoConDibujos() {
        setTitle("Frame Dibujo");
        setSize(400,400);
        LaminaConFiguras lamina = new LaminaConFiguras();
        add(lamina);
    }
}

class LaminaConFiguras extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(200,200,200,200);
    }
}
