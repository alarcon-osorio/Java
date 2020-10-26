package graficos;

import javax.swing.*;

// Video 55 - Swing I -- Aplicaciones graficas con swing
public class Frames {
    public static void main(String[] args) {
        myFrame frame1 = new myFrame();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class myFrame extends JFrame{
    public myFrame(){
        //setSize(400,400);  //Tamaño
        //Video 56 - Swing II - Aplicaciones graficas con swing
        //setLocation(500,300);  //Ubicacion -  Video 56
        setBounds(500,300,250,250);  //Ubicacion y Tamaño -  Video 56
        //setResizable(false); //Redimension -  Video 56
        setExtendedState(myFrame.MAXIMIZED_BOTH);// MARCO PANTALL COMPLETA -  Video 56
    }
}
