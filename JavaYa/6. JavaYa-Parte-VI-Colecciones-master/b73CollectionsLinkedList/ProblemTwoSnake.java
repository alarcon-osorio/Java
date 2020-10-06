package b73CollectionsLinkedList;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import javax.swing.JFrame;

public class ProblemTwoSnake extends javax.swing.JFrame  implements Runnable, KeyListener{

    public ProblemTwoSnake() {
        initComponents();
        setSize(600, 600);
        // escuchamos los eventos de teclado para identificar cuando se presionan las
        // teclas de flechas
        this.addKeyListener(this);
        // la vibora comienza con cuatro cuadraditos
        lista.add(new Punto(4, 25));
        lista.add(new Punto(3, 25));
        lista.add(new Punto(2, 25));
        lista.add(new Punto(1, 25));
        // indicamos la ubicacion de la cabeza de la vibora
        columna = 4;
        fila = 25;
        // generamos la coordenada de la fruta
        colfruta = (int) (Math.random() * 50);
        filfruta = (int) (Math.random() * 50);
        // creamos el hilo y lo arrancamos (con esto se ejecuta el metodo run()
        hilo = new Thread(this);
        hilo.start();
    }
    
    private enum Direccion {
        IZQUIERDA, DERECHA, SUBE, BAJA
    };

    class Punto {
        int x, y;

        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    @Override
    public void run() {
        while (activo) {
            try {
                // dormimos el hilo durante una décima de segundo para que no se mueva tan
                // rapidamente la vibora
                Thread.sleep(100);
                // segun el valor de la variable direccion generamos la nueva posicion de la
                // cabeza de la vibora
                switch (direccion) {
                case DERECHA:
                    columna++;
                    break;
                case IZQUIERDA:
                    columna--;
                    break;
                case SUBE:
                    fila--;
                    break;
                case BAJA:
                    fila++;
                    break;
                }

                repaint();
                sePisa();
                // insertamos la coordenada de la cabeza de la vibora en la lista
                lista.addFirst(new Punto(columna, fila));

                if (this.verificarComeFruta() == false && this.crecimiento == 0) {
                    // si no estamos en la coordenada de la fruta y no debe crecer la vibora
                    // borramos el ultimo nodo de la lista
                    // esto hace que la lista siga teniendo la misma cantidad de nodos
                    // ls.borrarUltimo();
                    lista.remove(lista.size() - 1);
                } else {
                    // Si creciento es mayor a cero es que debemos hacer crecer la vibora
                    if (this.crecimiento > 0)
                        this.crecimiento--;
                }
                verificarFin();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // controlamos si la cabeza de la vibora se encuentra dentro de su cuerpo
    private void sePisa() {
        for (Punto p : lista) {
            if (p.x == columna && p.y == fila) {
                activo = false;
                setTitle("Perdiste");
            }
        }
    }

    // controlamos si estamos fuera de la region del tablero
    private void verificarFin() {
        if (columna < 0 || columna >= 50 || fila < 0 || fila >= 50) {
            activo = false;
            setTitle("Perdiste");
        }
    }

    private boolean verificarComeFruta() {
        if (columna == colfruta && fila == filfruta) {
            colfruta = (int) (Math.random() * 50);
            filfruta = (int) (Math.random() * 50);
            this.crecimiento = 10;
            return true;
        } else
            return false;
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (!lista.isEmpty()) {
            if (imagen == null) {
                imagen = createImage(this.getSize().width, this.getSize().height);
                bufferGraphics = imagen.getGraphics();
            }
            // borramos la imagen de memoria
            bufferGraphics.clearRect(0, 0, getSize().width, getSize().width);
            // dibujar recuadro
            bufferGraphics.setColor(Color.red);
            bufferGraphics.drawRect(20, 50, 500, 500);
            // dibujar vibora
            for (Punto punto : lista) {
                bufferGraphics.fillRect(punto.x * 10 + 20, 50 + punto.y * 10, 8, 8);
            }
            // dibujar fruta
            bufferGraphics.setColor(Color.blue);
            bufferGraphics.fillRect(colfruta * 10 + 20, filfruta * 10 + 50, 8, 8);
            g.drawImage(imagen, 0, 0, this);
        }
    }

    public void keyPressed(KeyEvent arg0) {
        if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
            direccion = Direccion.DERECHA;
        }
        if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
            direccion = Direccion.IZQUIERDA;
        }
        if (arg0.getKeyCode() == KeyEvent.VK_UP) {
            direccion = Direccion.SUBE;
        }
        if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
            direccion = Direccion.BAJA;
        }
    }

    public void keyReleased(KeyEvent arg0) {
    }

    public void keyTyped(KeyEvent arg0) {
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProblemTwoSnake().setVisible(true);
            }
        });
    }

    private LinkedList<Punto> lista = new LinkedList<Punto>();
    private int columna, fila; // columna y fila donde se encuentra la cabeza de la vibora
    private int colfruta, filfruta; // columna y fila donde se encuentra la fruta
    private boolean activo = true; // disponemos en false cuando finaliza el juego
    private Direccion direccion = Direccion.DERECHA;
    private Thread hilo; // Hilo de nuestro programa
    private int crecimiento = 0; // indica la cantidad de cuadraditos que debe crecer la vibora
    private Image imagen; // Para evitar el parpadeo del repaint()
    private Graphics bufferGraphics;// Se dibuja en memoria para evitar parpadeo

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
