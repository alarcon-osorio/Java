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

    public LaminaConImagen(){ //Video 64 - Incluyendo imagenes Carga en memoria gracias al constructor
        File miimagen = new File("src/graficos/img/punto.png"); //ruta absoluta - Video 64 Copy Area
        try{
            imagen = ImageIO.read(miimagen);
        }catch(IOException e) {
            System.out.println("La imagen no se encuentra");
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int anchoImagen = imagen.getWidth(this);
        int altoImagen = imagen.getHeight(this);
        g.drawImage(imagen, 0,0, null); // Video 64 - Copy Area

        for(int i = 0; i<300;i++){
            for(int j=0; j<200;j++){
                if (i+j>0) {
                    g.copyArea(0, 0, anchoImagen, altoImagen, anchoImagen * i, altoImagen * j);
                }
            }
        }


    }

}