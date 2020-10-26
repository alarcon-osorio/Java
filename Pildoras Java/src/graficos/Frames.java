package graficos;

import javax.swing.*;
import java.awt.*;

// Video 55 - Swing I -- Aplicaciones graficas con swing
public class Frames {
    public static void main(String[] args) {
        /*myFrame frame1 = new myFrame();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        FrameCenter frame = new FrameCenter();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class myFrame extends JFrame{
    public myFrame(){
        //setSize(400,400);  //Tamaño
        //Video 56 - Swing II - Aplicaciones graficas con swing
        //setLocation(500,300);  //Ubicacion -  Video 56
        setBounds(500,300,400,400);  //Ubicacion y Tamaño -  Video 56
        //setResizable(false); //Redimension -  Video 56
        //setExtendedState(myFrame.MAXIMIZED_BOTH);// MARCO PANTALL COMPLETA -  Video 56
        setTitle("Mi primer Frame JAVA");

    }
}

class FrameCenter extends JFrame{
    public FrameCenter(){
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alto = tamanoPantalla.height; //altura de pantalla
        int ancho = tamanoPantalla.width; //ancho de pantalla
        setSize(alto/2,ancho/2);
        setLocation(ancho/2, alto/2);
        setTitle("Frame Center");
        Image icono = pantalla.getImage("ruta/imagen");
        setIconImage(icono);
    }

}
