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

class LaminaBotones extends JPanel implements ActionListener { //Video 66 - Se debe reescribir el metodo ActionPerformed
    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");
    public LaminaBotones() {
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        botonAzul.addActionListener(this); //Action = Hacer Click, Listener= Oyente, this= Objeto que recibe el evento
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){ //Pertenece a la interface ActionListener
        Object botonPulsado = e.getSource();
        if(botonPulsado == botonAzul){
            setBackground(Color.blue);
        }else if(botonPulsado == botonAmarillo){
            setBackground(Color.yellow);
        }else if(botonPulsado == botonRojo){
            setBackground(Color.red);
        }

    }

}
