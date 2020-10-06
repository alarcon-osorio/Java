package a30SwingVisualInterface;

import javax.swing.*;

public class RepasoSwing extends JFrame{
    private JLabel label;
    
    public RepasoSwing(){
        label = new JLabel("Un nuevo repaso");
        setLayout(null);
        label.setBounds(10,20,200,30);
        add(label);
    }
    
    public static void main(String[] args) {
        RepasoSwing rs = new RepasoSwing();
        rs.setBounds(100,200,300,400);
        rs.setVisible(true);
    }
}
