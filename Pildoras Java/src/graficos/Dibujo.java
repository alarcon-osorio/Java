package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

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
        //g.drawRect(200,200,200,200); //Video 60 -- Comentario
        //Video 60 - Swing VI Java 2D Graphics
        Graphics2D graphics2D = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        graphics2D.draw(rectangulo);
        Ellipse2D ellipse2D = new Ellipse2D.Double();
        ellipse2D.setFrame(rectangulo);
        graphics2D.draw(ellipse2D);
        graphics2D.draw(new Line2D.Double(100,100,300,250));
        double CentroenX = rectangulo.getCenterX(); //Centro en X del rectangulo
        double CentroenY = rectangulo.getCenterY(); //Centro en Y del rectangulo
        double radio = 150;
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroenX,CentroenY,CentroenX + radio, CentroenY+radio);
        graphics2D.draw(circulo);
    }
}
