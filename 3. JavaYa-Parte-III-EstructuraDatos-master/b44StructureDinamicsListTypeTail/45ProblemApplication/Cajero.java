package b44StructureDinamicsListTypeTail.ProblemApplication;

import javax.swing.*;
import java.awt.event.*;

public class Cajero extends JFrame implements ActionListener{
    private JLabel label1, label2, label3;
    private JButton button;
    
    public Cajero() {
        setLayout(null);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label1 = new JLabel("Atendidos: ");
        label1.setBounds(5,5,100,30);
        add(label1);
        
        label2 = new JLabel("En cola: ");
        label2.setBounds(5,40,100,30);
        add(label2);
        
        label3 = new JLabel("Minutos de llegada: ");
        label3.setBounds(5,80,150,30);
        add(label3);
        
        button = new JButton("Activar Simulación");
        button.setBounds(5,120,150,30);
        add(button);
        button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==button) {
            simulacion();
        }
    }
    
    public void simulacion() {
        int estado = 0;
        int llegada = 2 + (int) (Math.random() * 2);
        int salida = -1;
        int atendidas = 0;
        Cola cola = new Cola();
        for (int minuto = 0; minuto  < 600; minuto ++) {
            if (llegada == minuto) {
                if (estado == 0) {
                    estado = 1;
                    salida = minuto + 2 + (int) (Math.random() * 3);
                }else{
                    cola.insertar(minuto);
                }
                llegada = minuto + 2 + (int) (Math.random() * 2);
            }
            if (salida == minuto) {
                estado = 0;
                atendidas++;
                if (!cola.vacia()) {
                    cola.extraer();
                    estado = 1;
                    salida = minuto + 2 + (int)(Math.random() * 3);
                }
            }
        }
        label1.setText("Atendidos: " + String.valueOf(atendidas));
        label2.setText("En cola: " + String.valueOf(cola.cantidad()));
        label3.setText("Minutos de llegada: " + String.valueOf(cola.extraer()));
    }       
    
    public static void main(String[] args) {
        Cajero ca = new Cajero();
        ca.setVisible(true);
    }
}
