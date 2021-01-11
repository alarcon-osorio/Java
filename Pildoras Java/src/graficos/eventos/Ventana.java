//Video 68
package graficos.eventos;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ventana {
    public static void main(String[] args) {
        MarcoVentana mimarco = new MarcoVentana();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Video 68 - Constante de clase
        MarcoVentana mimarco2 = new MarcoVentana();
        //mimarco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Video 68 - Se cierran las dos ventanas al tiempo
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Video 68 - Para que cierre uno de los marcos
        mimarco.setTitle("Ventana 1");
        mimarco2.setTitle("Ventana 2");
        mimarco.setBounds(300,300,500,350);
        mimarco2.setBounds(900,300,500,350);
    }
}

class MarcoVentana extends JFrame {  //Video 68 - Preparala para el oyente
    public MarcoVentana() {
        //setTitle("Ventana");
        //setBounds(300,300,500,350);
        setVisible(true);
        //MiVentana oyenteVentana = new MiVentana();
        //addWindowListener(oyenteVentana);
        addWindowListener(new MiVentana()); //Video 69 - Reduce codigo instanciando el objeto total
    }
}

//class MiVentana implements WindowListener{ //Video 68 - Implementar los metodos de interface
    //Video 69 - No implementar todos estos metodos - Clase adaptadora
class MiVentana extends WindowAdapter { //Video 69 - WindowAdapter
    /*@Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana Abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Ventana Cerrandose");
    }

    @Override
    public void windowClosed(WindowEvent e) { //Video 68 - No se puede ver el comportamiento de este metodo
        System.out.println("Ventana 2 Cerrada"); //Video 68 - mimarco2
    }
    */
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }
/*
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana Activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
    */

}