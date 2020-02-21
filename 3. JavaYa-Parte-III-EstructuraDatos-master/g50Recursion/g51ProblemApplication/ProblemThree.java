package g50Recursion.g51ProblemApplication;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ProblemThree extends JFrame implements ActionListener{
    JLabel[][] label;
    JLabel label2;
    JButton button1, button2;
    boolean salida;
    ProblemThree() {
        setLayout(null);
        setSize(250,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Titulo de la ventana");
        
        label = new JLabel[10][10];
        for (int i = 0; i < label.length; i++) {
            for (int j = 0; j < 10; j++) {
                label[i][j] = new JLabel();
                label[i][j].setBounds(20+j*20, 50+i*20, 20, 20);
                add(label[i][j]);
            }            
        }
        
        label2 = new JLabel("Informacion: ");
        label2.setBounds(10, 300, 300, 25);
        add(label2);
        
        button1 = new JButton("Recorrer");
        button1.setBounds(10, 350, 100, 25);
        add(button1);
        button1.addActionListener(this);
        
        button2 = new JButton("Crear");
        button2.setBounds(120, 350, 100, 25);
        add(button2);
        button2.addActionListener(this);
        crear();
    }
    
    public void crear() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int a = (int)(Math.random() * 4);
                label[i][j].setForeground(Color.black);
                if (a==0) {
                    label[i][j].setText("1");
                }else{
                    label[i][j].setText("0");
                }
            }
            label[9][9].setText("s");
            label[0][0].setText("0");  
        }
    }   
    
    public void recorrer(int fil, int col) {
        if (fil >= 0 && fil < 10 && col>=0 && col<10 && salida == false) {
            if (label[fil][col].getText().equals("s")) {
                salida = true;
            }else{
                if (label[fil][col].getText().equals("0")) {
                    label[fil][col].setText("9");
                    label[fil][col].setForeground(Color.red);
                    recorrer(fil,col+1);
                    recorrer(fil+1,col);
                    recorrer(fil-1,col);
                    recorrer(fil,col-1);                    
                } 
            }
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1) {
            salida=false;
            recorrer(0,0);
            if (salida)
                label2.setText("Informacion: " + "SI Tiene salida");
            else
                label2.setText("Informacion: " + "NO Tiene salida"); 
        }
        if (e.getSource()==button2)
            crear();
    }
  
    public static void main(String[] ar) {
        ProblemThree pt = new ProblemThree();
        pt.setVisible(true);
    }  
    
}
