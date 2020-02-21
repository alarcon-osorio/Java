package g37SwingJMenuBarJMenuJMenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProblemTwo extends JFrame implements ActionListener{
    private JMenuBar menubar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;
        
    public ProblemTwo() {
        setLayout(null);
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Bar
        menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        //Menu1
        menu1 = new JMenu("Opciones");
        menubar.add(menu1);
        
        //Menu2
        menu2 = new JMenu("Tamaños");
        menu1.add(menu2);
        
        //Menu1
        menu3= new JMenu("Colores");
        menu1.add(menu3);
        
        //SubMenuItem-> MenuItem1
        menuitem1 = new JMenuItem("Tamaño 1");        
        menuitem1.addActionListener(this);
        menu2.add(menuitem1);
        
        menuitem2 = new JMenuItem("Tamaño 2");        
        menuitem2.addActionListener(this);
        menu2.add(menuitem2);
        
        
        //SubMenuItem -> MenuItem2
        menuitem3 = new JMenuItem("Rojo");        
        menuitem3.addActionListener(this);
        menu3.add(menuitem3);
        
        menuitem4 = new JMenuItem("Verde");        
        menuitem4.addActionListener(this);
        menu3.add(menuitem4);
    }
    
    public void actionPerformed(ActionEvent ae) {
        Container cp = this.getContentPane();
        if (ae.getSource()== menuitem1) {
            setSize(100,200);
        }
        if (ae.getSource()== menuitem2) {
            setSize(200,400);
        }
        if (ae.getSource()== menuitem3) {
            cp.setBackground(new Color(255,0,0));
        }
        if (ae.getSource()== menuitem4) {
            cp.setBackground(new Color(0,255,0));
        }
    }
    
    public static void main(String[] args) {
        ProblemTwo pt = new ProblemTwo();
        pt.setVisible(true);
    }
}
