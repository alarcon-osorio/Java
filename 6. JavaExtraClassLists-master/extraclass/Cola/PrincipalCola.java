package extraclass.Cola;

import extraclass.Cola.Cola;
import javax.swing.*;

public class PrincipalCola {
    
    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        Cola colita = new Cola();
        do {
            try{
               opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                          "1. Insertar un elemento a la cola\n"
                        + "2. Quitar Elemento de la Cola\n"
                        + "3. ¿ La cola esta vacia ?\n"
                        + "4. Elemento ubicado al inicio de la cola\n"
                        + "5. Tamaño de la cola\n"
                        + "6. Salir" , "Menu de Opciones de una Cola"
                        ,JOptionPane.QUESTION_MESSAGE));
               switch(opcion) {
                   case 1: 
                       elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                               "Ingresa el elemento a insertar" , "Insertando en la Cola"
                               ,JOptionPane.QUESTION_MESSAGE));
                       colita.insertar(elemento);
                       break;
                   case 2: 
                       if (!colita.vacia()) {
                           JOptionPane.showMessageDialog(null, "El elemento atendido es " + colita.extraer(), 
                                   "Quitamos elementos de la Cola" ,JOptionPane.QUESTION_MESSAGE);
                       }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia ", 
                                   "cola vacia",JOptionPane.QUESTION_MESSAGE);
                       }
                       break;
                   case 3:
                       if (colita.vacia()) {
                            JOptionPane.showMessageDialog(null, "La cola esta vacia: ", 
                                   "Cola vacia" , JOptionPane.QUESTION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null, "La cola NO esta vacia: ", 
                                   "Cola NO vacia" , JOptionPane.QUESTION_MESSAGE);
                       }
                   break;
                   case 4:
                       if (!colita.vacia()) {
                           JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio de la cola es " + colita.inicioCola(), 
                                   "Cola vacia" , JOptionPane.QUESTION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null, "La cola esta vacia: ", 
                                   "Cola vacia" , JOptionPane.QUESTION_MESSAGE);
                       }
                   break;
                   case 5:
                       JOptionPane.showMessageDialog(null, "El tamaño de la cola es " + colita.tamanioCola(), 
                                   "Cola vacia" , JOptionPane.QUESTION_MESSAGE);
                       break;
                   case 6:
                       JOptionPane.showMessageDialog(null, "Aplicacion finalizada", 
                                   "FIN" , JOptionPane.QUESTION_MESSAGE);
                       break;
                   default: 
                       JOptionPane.showMessageDialog(null, "Opcion Incorrecta ", 
                                   "Cuidado" , JOptionPane.QUESTION_MESSAGE);
                       
               }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion!=6);
        
    }
    
}
