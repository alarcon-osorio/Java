package b44StructureDinamicsListTypeTail;

import javax.swing.*;
import java.awt.event.*;

public class SuperMercado extends JFrame implements ActionListener{
    private JLabel label1, label2, label3, info;
    private JButton button;
    
    SuperMercado() {
        setLayout(null);
        setSize(500, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label1 = new JLabel("Clientes atendidos por cada caja: ");
        label1.setBounds(5,5,400,30);
        add(label1);
        
        label2 = new JLabel("Clientes que se marcharon sin hacer compras: ");
        label2.setBounds(5,40,400,30);
        add(label2);
        
        label3 = new JLabel("Tiempo promedio en cola: ");
        label3.setBounds(5,75,400,30);
        add(label3);
        
        button = new JButton("Enviar");
        button.setBounds(5,110,100,30);
        add(button);
        button.addActionListener(this);
        
        info = new JLabel("Información: ");
        info.setBounds(5,145,400,30);
        add(info);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==button) {
            verificar();
        }
    }
    
    public void verificar() {
        int estado1 = 0, estado2 = 0, estado3 = 0;
        int marchan = 0;
        int llegada = 2 + (int) (Math.random() * 2);
        int salida1 = -1, salida2 = -1, salida3 = -1;
        int atendido1 = 0, atendido2 = 0, atendido3 = 0;
        int tiempoCola = 0;
        int cantidadCola = 0;
        Cola cola1 = new Cola();
        Cola cola2 = new Cola();
        Cola cola3 = new Cola();
        for (int minutos = 0; minutos < 600; minutos++) {
            if (llegada == minutos) {
                if (estado1 == 0) {
                    estado1 = 1;
                    salida1 = minutos + 7 + (int)(Math.random() * 5);
                }else{
                    if (estado2 == 0) {
                        estado2 = 1;
                        salida2 = minutos + 7 + (int)(Math.random() * 5);
                    }else{
                        if (estado3 == 0) {
                            estado3 = 1;
                            salida3 = minutos + 7 + (int)(Math.random() * 5);
                        }else{
                            if (cola1.cantidad() == 6 && cola2.cantidad() == 6 && cola3.cantidad() == 6) {
                               marchan ++;
                            }else{
                                if (cola1.cantidad() <= cola2.cantidad() && cola1.cantidad() <= cola3.cantidad()) {
                                     cola1.insertar(minutos);
                                }else{
                                    if (cola2.cantidad() <= cola3.cantidad()) {
                                        cola2.insertar(minutos);
                                    }else{
                                        cola3.insertar(minutos);
                                    }
                                }
                            }
                        }
                    }
                }
                llegada = minutos + 2 + (int)(Math.random() * 2); 
            }
            if (salida1==minutos) {
                atendido1++;
                estado1 = 0;
                if (!cola1.vacia()) {
                    estado1 = 1;
                    int m = cola1.extraer();
                    salida1 = minutos + 7 + (int)(Math.random() * 5);
                    tiempoCola += (minutos - m);
                    cantidadCola++;
                }
            }
            if (salida2==minutos) {
                atendido2++;
                estado2 = 0;
                if (!cola2.vacia()) {
                    estado2 = 1;
                    int m = cola2.extraer();
                    salida2 = minutos + 7 + (int)(Math.random() * 5);
                    tiempoCola += (minutos - m);
                    cantidadCola++;
                }
            }
            
            if (salida3==minutos) {
                atendido3++;
                estado3 = 0;
                if (!cola3.vacia()) {
                    estado3 = 1;
                    int m = cola1.extraer();
                    salida3 = minutos + 7 + (int)(Math.random() * 5);
                    tiempoCola += (minutos - m);
                    cantidadCola++;
                }
                info.setText("Información: " + salida1 + " " +  llegada);
            }
        }
        
        label1.setText("Clientes atendidos por cada caja: Caja1: " + atendido1 + " Caja2: " + atendido2 + " Caja3: " + atendido3 );
        label2.setText("Clientes que se marcharon sin hacer compras: " + marchan);
        if (cantidadCola > 0) {
            int promedio = tiempoCola/cantidadCola;
            label3.setText("Tiempo promedio en cola: " + promedio + " Minutos");
        }
    }
    
    
    public static void main(String[] args) {
        SuperMercado sm = new SuperMercado();
        sm.setVisible(true);
    }
}
