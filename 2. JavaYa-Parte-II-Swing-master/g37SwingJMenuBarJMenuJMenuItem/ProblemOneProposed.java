package g37SwingJMenuBarJMenuJMenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProblemOneProposed extends JFrame implements ActionListener{
    private JLabel label1, label2;
    private JTextField textbox1, textbox2;
    private JMenuBar menubar;
    private JMenu menu;
    private JMenuItem msend, mexit;   
    
    public ProblemOneProposed() {
        setLayout(null);
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label1 = new JLabel("Ingrese ancho: ");
        label1.setBounds(5,5,130,30);
        add(label1);
                
        textbox1 = new JTextField();
        textbox1.setBounds(140,5,100,30);
        add(textbox1);
        
        label2 = new JLabel("Ingrese alto: ");
        label2.setBounds(5,40,130,30);
        add(label2);
        
        textbox2 = new JTextField();
        textbox2.setBounds(140,40,100,30);
        add(textbox2);
        
        menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        menu = new JMenu("Opciones");
        menubar.add(menu);
        
        msend = new JMenuItem("Cambiar Tamaño");
        msend.addActionListener(this);
        menu.add(msend);
        
        mexit = new JMenuItem("Salir");
        mexit.addActionListener(this);
        menu.add(mexit);        
    }           
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == msend) {
            String size1 = (String)textbox1.getText();
            String size2 = (String)textbox2.getText();
            int ancho = Integer.parseInt(size1);
            int alto = Integer.parseInt(size2);
            setSize(ancho , alto);
        }
        if (ae.getSource() == mexit) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.setVisible(true);
    }   
}
