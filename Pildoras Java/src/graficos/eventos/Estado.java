//Video 70 - WindowStateListener
package graficos.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class Estado {
    public static void main(String[] args) {
        MarcoEstado mimarco = new MarcoEstado();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEstado extends JFrame{
    public MarcoEstado(){
        setVisible(true);
        setBounds(300,300,500,350);
        CambioEstado nuevoEstado = new CambioEstado();
        addWindowStateListener(nuevoEstado);
    }
}

class CambioEstado implements WindowStateListener{

    @Override //Video 70 - Reescrutira de Metodo
    public void windowStateChanged(WindowEvent e) {
        System.out.println("La ventana ha cambiado de estado");
        //System.out.println(e.getNewState());
        if(e.getNewState() == Frame.MAXIMIZED_BOTH){ //Video 70 - Se puede poner el numero que devuelve
            System.out.println("La ventana esta completa");
        }
    }
}
