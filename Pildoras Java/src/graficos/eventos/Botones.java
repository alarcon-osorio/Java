package graficos.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Botones {
    public static void main(String[] args) {
        MarcoConBotones marco = new MarcoConBotones();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoConBotones extends JFrame{
    public MarcoConBotones() {
        setTitle("Botones y eventos");
        setSize(400,400);
        LaminaBotones lamina = new LaminaBotones();
        add(lamina);
    }
}

class LaminaBotones extends JPanel  { //Video 66 - Se debe reescribir el metodo ActionPerformed //Video 67 - Quito implements
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");
    public LaminaBotones() {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        ColorFondo Azul = new ColorFondo(Color.blue);
        ColorFondo Amarillo = new ColorFondo(Color.yellow);
        ColorFondo Rojo = new ColorFondo(Color.red);

        botonAzul.addActionListener(Azul); //Action = Hacer Click, Listener= Oyente, this= Objeto que recibe el evento
        botonAmarillo.addActionListener(Amarillo);
        botonRojo.addActionListener(Rojo);

    }

    //Video 67 - Forma 2 Clase internas
    private class ColorFondo implements ActionListener{ //Debe tener el metodo ActionPerformed
        private Color colorDeFondo;
        public ColorFondo(Color c){
            colorDeFondo = c;
        }

        public void actionPerformed(ActionEvent e){
            setBackground(colorDeFondo); //Pertenece a la clase Jpanel - Se soluciona poniendola interna
        }
    }

}

