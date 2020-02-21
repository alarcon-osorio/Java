package g37SwingJMenuBarJMenuJMenuItem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ProblemOne extends JFrame implements ActionListener{
    private JMenuBar menubar;
    private JMenu menu;
    private JMenuItem menuitem1, menuitem2, menuitem3;
    private Color color;
    
    public ProblemOne() {
        setLayout(null);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
        menubar = new JMenuBar();   
        setJMenuBar(menubar);
        
        menu = new JMenu("Opciones");
        menubar.add(menu);
        
        menuitem1 = new JMenuItem("Rojo");
        menuitem1.addActionListener(this);
        menu.add(menuitem1);
        
        menuitem2 = new JMenuItem("Verde");
        menuitem2.addActionListener(this);
        menu.add(menuitem2);
        
        menuitem3 = new JMenuItem("Azul");
        menuitem3.addActionListener(this);         
        menu.add(menuitem3);
    }
    
    @Override 
    public void actionPerformed(ActionEvent ae) {
        Container cp = this.getContentPane();
        if (ae.getSource() == menuitem1) {
            cp.setBackground(new Color(255,0,0));
        }
        if (ae.getSource() == menuitem2) {
            cp.setBackground(new Color(0,255,0));
        }
        if (ae.getSource() == menuitem3) {
            cp.setBackground(new Color(0,0,255));
        }        
    }
    
    public static void main(String[] args) {
        ProblemOne po = new ProblemOne();
        po.setVisible(true);
    }
}
