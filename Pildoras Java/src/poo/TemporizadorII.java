package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

//Video 53 - Clases Internas I
public class TemporizadorII {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(); //Error ya que no existe se quitan parametros 3000, true y se estableven en marcha
        reloj.Marcha(3000, true);
        JOptionPane.showMessageDialog(null, "Pulsar Aceptar para terminar");
        System.exit(0);
    }
}

class Reloj{

    private int intervalo;
    private boolean sonido;

    /***** Se comenta Video 54
    public Reloj(int intervalo, boolean sonido){
        this.intervalo = intervalo;
        this.sonido = sonido;

    } *******/

    public void Marcha(int intervalo, final boolean sonido){ //Video 54 - Clases Internas II --- Se llaman las variables para simplificar codigo, modificador final para acceder a variable local

        //Video 54 - Clases internas II --- Se mueve la clase dentro del motodo
        class GetHour2 implements ActionListener{ //Modificar de acceso obligatorio para clases internas  // Video 54 - Clases Internas II --- Quitar modificar de acceso private
            public void actionPerformed(ActionEvent e){
                Date date = new Date();
                System.out.println("Hora cada 3 segundos= " + date);

                if (sonido){
                    Toolkit.getDefaultToolkit().beep();  //Sonido de Windows
                }

            }
        }

        ActionListener oyente = new GetHour2();
        Timer temporizador = new Timer(2000, oyente);
        temporizador.start();
    }

    /***** Se comenta para que se traslade al metodo Video 54
    private class GetHour2 implements ActionListener{ //Modificar de acceso obligatorio para clases internas
        public void actionPerformed(ActionEvent e){
            Date date = new Date();
            System.out.println("Hora cada 3 segundos= " + date);

            if (sonido){
                Toolkit.getDefaultToolkit().beep();
            }

        }
    }**********/

}
