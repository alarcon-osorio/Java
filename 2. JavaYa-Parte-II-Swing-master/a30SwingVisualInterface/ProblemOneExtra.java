package a30SwingVisualInterface;

import javax.swing.*;

public class ProblemOneExtra extends JFrame {
    private JLabel label;
    
    public ProblemOneExtra () {
        setLayout(null);
        label = new JLabel("Titulo Interno");
        label.setBounds(10, 20, 200, 30);
        add(label);
    }
    
    public static void main(String[] args) {
        ProblemOneExtra poe = new ProblemOneExtra();
        poe.setBounds(250, 300, 300, 150);
        poe.setVisible(true);
        
    }
}
