package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

//Video 61 - Swing VII Manejando colores
public class Colores {
    public static void main(String[] args) {
        MarcoConColor mimarco = new MarcoConColor();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }

}

class MarcoConColor extends JFrame{
    public MarcoConColor(){
        setTitle("Colores");
        setSize(400,400);
        LaminaConColor milamina =  new LaminaConColor();
        add(milamina);
    }
}

class LaminaConColor extends JPanel{
   public void paintComponent(Graphics g){
       super.paintComponent(g);
       Graphics2D g2 = (Graphics2D) g;
       Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
       //Video 61 - Colores
       g2.setPaint(Color.RED);
       g2.fill(rectangulo);

       Ellipse2D elipse = new Ellipse2D.Double();
       //g2.setPaint(Color.BLUE);
       elipse.setFrame(rectangulo);
       g2.setPaint(new Color(109,172,59).brighter());
       g2.fill(elipse);

   }
}
