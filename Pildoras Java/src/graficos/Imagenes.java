package graficos;

//Video 63 - Incluyendo imagenes
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Imagenes {
    public static void main(String[] args) {
        MarcoImagen mimarco = new MarcoImagen();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class MarcoImagen extends JFrame{
    public MarcoImagen(){
        setTitle("Imagenes");
        setSize(400,400);
        LaminaConImagen milamina =  new LaminaConImagen();
        add(milamina);
    }
}

class LaminaConImagen extends JPanel {
    private Image imagen;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        File miimagen = new File("src/graficos/img/insta.png"); //ruta absoluta

        try{
            imagen = ImageIO.read(miimagen);
        }catch(IOException e) {
            System.out.println("La imagen no se encuentra");
        }

        g.drawImage(imagen, 5,5, null);

    }

}