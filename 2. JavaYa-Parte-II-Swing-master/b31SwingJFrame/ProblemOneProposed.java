package b31SwingJFrame;

import javax.swing.*;

public class ProblemOneProposed extends JFrame{
    public ProblemOneProposed() {
        setLayout(null);       
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        //SOLO PIXELES
        pop.setBounds(0,0,1024,800);
        pop.setVisible(true);
        pop.setResizable(false);
    }
    
}
