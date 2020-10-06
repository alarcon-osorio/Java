package a30SwingVisualInterface;

import javax.swing.*;

public class ProblemOne extends JFrame {
    private JLabel label;
    
    public ProblemOne() {
        setLayout(null);
        label = new JLabel("Hola Mundo");
        label.setBounds(10, 20, 200, 30);
        add(label);
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.setBounds(10, 10, 400, 300);
        po.setVisible(true);
    }
}
