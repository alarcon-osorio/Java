package b31SwingJFrame;

import javax.swing.*;

public class ProblemOne extends JFrame {
    public ProblemOne() {
        setLayout(null);
    }
      
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        //setBounds = Columna 10, Fila 20 Ancho 400px Alto de 300px.
        po.setBounds(10,10,300,200);
        po.setVisible(true);
    }
}
