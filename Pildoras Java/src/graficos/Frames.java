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
        setSize(400,400);
    }
}
