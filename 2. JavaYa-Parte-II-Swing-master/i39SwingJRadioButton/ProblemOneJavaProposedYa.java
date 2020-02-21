package i39SwingJRadioButton;

import javax.swing.*;
import java.awt.event.*;
public class ProblemOneJavaProposedYa extends JFrame implements ActionListener{
    private JTextField tf1,tf2;
    private ButtonGroup bg;
    private JRadioButton radio1,radio2;
    private JButton boton1;
   
    public ProblemOneJavaProposedYa() {
        setLayout(null);
        tf1=new JTextField();
        tf1.setBounds(10,10,100,30);
        add(tf1);
        tf2=new JTextField();
        tf2.setBounds(10,60,100,30);
        add(tf2);
        bg=new ButtonGroup();
        radio1=new JRadioButton("Sumar");
        radio1.setBounds(10,110,100,30);
        bg.add(radio1);
        add(radio1);
        radio2=new JRadioButton("Restar");
        radio2.setBounds(10,140,100,30);
        bg.add(radio2);
        add(radio2);
        boton1=new JButton("Operar");
        boton1.setBounds(10,180,100,30);
        boton1.addActionListener(this);
        add(boton1);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            int v1=Integer.parseInt(tf1.getText());
            int v2=Integer.parseInt(tf2.getText());
            int resultado=0;
            if (radio1.isSelected()) {
            	resultado=v1+v2;
            }
            if (radio2.isSelected()) {
                resultado=v1-v2;
            }
            setTitle(String.valueOf(resultado));
        }
    }

    public static void main(String[] ar) {
        ProblemOneJavaProposedYa formulario1=new ProblemOneJavaProposedYa();
        formulario1.setBounds(0,0,350,250);
        formulario1.setVisible(true);
    } 	
}