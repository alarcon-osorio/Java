package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

//Video 53 - Clases Internas I
public class TemporizadorII {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(3000, true);
        reloj.Marcha();
        JOptionPane.showMessageDialog(null, "Pulsar Aceptar para terminar");
        System.exit(0);
    }
}

class Reloj{

    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;

    }

    public void Marcha(){
        ActionListener oyente = new GetHour2();
        Timer temporizador = new Timer(2000, oyente);
        temporizador.start();
    }

    private class GetHour2 implements ActionListener{ //Modificar de acceso obligatorio para clases internas
        public void actionPerformed(ActionEvent e){
            Date date = new Date();
            System.out.println("Hora cada 3 segundos= " + date);

            if (sonido){
                Toolkit.getDefaultToolkit().beep();
            }

        }
    }

}
