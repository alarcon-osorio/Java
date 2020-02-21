package g50Recursion.g51ProblemApplication;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ProblemOneProposed extends JFrame implements ActionListener{
    private JButton[][] button;
    JButton button1;
    
    ProblemOneProposed() {
        setLayout(null);
        setSize(500,600);
        setTitle("Buscaminas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button = new JButton[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                button [i][j] = new JButton ("0");
                button [i][j].setBounds (20 + j * 41, 50 + i * 41, 41, 41);
                button [i][j].setBackground(Color.lightGray);
                button [i][j].setForeground(Color.lightGray);
                button [i][j].addActionListener(this);
                add(button [i][j]);
            }
        }
        button1 = new JButton("Reiniciar");
        button1.setBounds(20,470,100,30);
        add(button1);
        button1.addActionListener(this);
        disponerBombas();
        contarBombasPerimetro();
    }
    
    public void disponerBombas() {
        int cant = 10;
        do {
            int fila = (int) (Math.random () * 10);
            int columna = (int) (Math.random () * 10);
            if (button [fila] [columna].getText().equals("b") == false)            {
                button [fila] [columna].setText("b");
                cant--;
            }
        } while (cant != 0);        
    }
    
     void contarBombasPerimetro (){
        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                if (button [i][j].getText().equals("0") == true) {
                    int cantidad = contarCoordenada(i, j);
                    button [i][j].setText (String.valueOf(cantidad));
                }
            }
        }
    }
     
     public int contarCoordenada(int fila, int columna) {
         int total = 0;
        if (fila - 1 >= 0 && columna - 1 >= 0) {
            if (button [fila - 1] [columna - 1].getText ().equals ("b") == true)
            total++;
        }
        if (fila - 1 >= 0) {        
            if (button [fila - 1] [columna].getText ().equals ("b") == true)
            total++;
        }
        if (fila - 1 >= 0 && columna + 1 < 10) {
            if (button [fila - 1] [columna + 1].getText ().equals ("b") == true)
            total++;
        }
    
        if (columna + 1 < 10) {
            if (button [fila] [columna + 1].getText ().equals ("b") == true)
            total++;
        }
        if (fila + 1 < 10 && columna + 1 < 10) {
            if (button [fila + 1] [columna + 1].getText ().equals ("b") == true)
            total++;
        }
    
        if (fila + 1 < 10) {
            if (button [fila + 1] [columna].getText ().equals ("b") == true)
            total++;
        }
        if (fila + 1 < 10 && columna - 1 >= 0) {
            if (button [fila + 1] [columna - 1].getText ().equals ("b") == true)
            total++;
        }
        if (columna - 1 >= 0) {
            if (button [fila] [columna - 1].getText ().equals ("b") == true)
            total++;
        }
        return total;
     }
     
     void desactivarJuego () {
        for (int f = 0 ; f < 10 ; f++) {
            for (int c = 0 ; c < 10 ; c++) {
                button [f] [c].setEnabled (false);
            }
        }
    }

    void reiniciar () {
        setTitle ("");
        for (int f = 0 ; f < 10 ; f++) {
            for (int c = 0 ; c < 10 ; c++) {
                button [f] [c].setText ("0");
                button [f] [c].setEnabled (true);
                button [f] [c].setBackground (Color.lightGray);
                button [f] [c].setForeground (Color.lightGray);
            }
        }
        disponerBombas ();
        contarBombasPerimetro ();
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource () == button1) {
            reiniciar();
        }
        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
            if (e.getSource () == button [i] [j]) {
                if (button [i] [j].getText ().equals ("b") == true) {
                    setTitle ("Boooooooooooooomm");
                    desactivarJuego ();
                }
                else
                if (button [i] [j].getText ().equals ("0") == true) {
                    recorrer (i, j);
                }else if (button [i] [j].getText ().equals ("1") == true ||
                        button [i] [j].getText().equals ("2") == true ||
                        button [i] [j].getText().equals ("3") == true ||
                        button [i] [j].getText().equals ("4") == true ||
                        button [i] [j].getText().equals ("5") == true ||
                        button [i] [j].getText().equals ("6") == true ||
                        button [i] [j].getText().equals ("7") == true ||
                        button [i] [j].getText().equals ("8") == true) {
                        button [i] [j].setBackground(Color.yellow);
                        button [i] [j].setForeground(Color.black);
                    }
                }
            }
        }
        verificarTriunfo ();
    }


    void verificarTriunfo () {
        int cant = 0;
        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                Color col = button [i] [j].getBackground ();
                if (col == Color.yellow)
                    cant++;
            }
        }
        if (cant == 90) {
            setTitle ("Ganooooooooo");
            desactivarJuego ();
        }
    }


    void recorrer (int fil, int col) {    
        if (fil >= 0 && fil < 10 && col >= 0 && col < 10){
            if (button [fil] [col].getText ().equals ("0")){
                button [fil] [col].setText (" ");
                button [fil] [col].setBackground (Color.yellow);
                recorrer (fil, col + 1);
                recorrer (fil, col - 1);
                recorrer (fil + 1, col);
                recorrer (fil - 1, col);
                recorrer (fil - 1, col - 1);
                recorrer (fil - 1, col + 1);
                recorrer (fil + 1, col + 1);
                recorrer (fil + 1, col - 1);
            }else if (button [fil] [col].getText ().equals ("1") == true ||
                    button [fil] [col].getText ().equals ("2") == true ||
                    button [fil] [col].getText ().equals ("3") == true ||
                    button [fil] [col].getText ().equals ("4") == true ||
                    button [fil] [col].getText ().equals ("5") == true ||
                    button [fil] [col].getText ().equals ("6") == true ||
                    button [fil] [col].getText ().equals ("7") == true ||
                    button [fil] [col].getText ().equals ("8") == true) {
                    button [fil] [col].setBackground (Color.yellow);
                    button [fil] [col].setForeground (Color.black);
                }
            }
        }

    public static void main (String[] args){
        ProblemOneProposed pop = new ProblemOneProposed();
        pop.setVisible(true);
    }
}
