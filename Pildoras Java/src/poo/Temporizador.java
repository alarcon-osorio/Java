package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Date;

// Video 52 - Interfaces IV --Temporizador
public class Temporizador {
    public static void main(String[] args) {
        //ActionListener oyente = new GetHour(); //Otra forma de intancia
        GetHour oyente = new GetHour(); //Instancio la clase
        Timer temporizador = new Timer(1000, oyente); //reciber dos parametros delay y actionListener(Interface)
        temporizador.start(); //El programa muere en este punto
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
        System.exit(0);
    }
}

class GetHour implements ActionListener{
    public void actionPerformed(ActionEvent e){
        int contador = 1;
        Date date = new Date(); //Solo importar la clase, se almacena la hora y fecha actual
        System.out.println("La hora cada " +  contador  + " segundos " + date);
        //Video 53 - Clases Internas I
        Toolkit.getDefaultToolkit().beep();  //Video 53 - Clases Internas I --- Hace el sonido defecto de Windows
    }

}
