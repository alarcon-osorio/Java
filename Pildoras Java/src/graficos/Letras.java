package graficos;

//Video 62 - Trabajando con fuentes

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import javax.swing.*;

public class Letras {
    public static void main(String[] args) {
        String fuente = JOptionPane.showInputDialog("Introduce fuente");

        boolean existe = false;

        String [] nombreDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for(String nombredelafuente: nombreDeFuentes){
            if (nombredelafuente.equals(fuente)){
                existe = true;
            }
        }

        if (existe){
            System.out.println("Existe la fuente" );
            MarcoConFuente mimarco = new MarcoConFuente();
            mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mimarco.setVisible(true);
        }else{
            System.out.println("No Existe la fuente" );
        }
    }
}

class MarcoConFuente extends JFrame{
    public MarcoConFuente(){
        setTitle("Fuentes");
        setSize(400,400);
        LaminaConFuente milamina =  new LaminaConFuente();
        add(milamina);
    }
}

class LaminaConFuente extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Font mifuente = new Font("Arial", Font.BOLD, 26);
        g2.setFont(mifuente);
        g2.setColor(Color.green);
        g2.drawString("Jeison en Arial",100,100);
    }
}


