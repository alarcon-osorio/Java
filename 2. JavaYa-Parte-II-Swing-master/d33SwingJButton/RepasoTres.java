package d33SwingJButton;

import javax.swing.*;
import java.awt.event.*;

public class RepasoTres extends JFrame implements ActionListener{
    private JButton button;
    
    public RepasoTres() {
        setLayout(null);
        
        button = new JButton("Exit");
        button.setBounds(10,100,100,200);
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==button) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        RepasoTres rt = new RepasoTres();
        rt.setBounds(0,0,500,350);
        rt.setVisible(true);
    }
    
}
