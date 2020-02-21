package extraclass.Pila;

import javax.swing.*;

public class PrincipalPila {

    public static void main(String[] args) {
        int opcion = 0, elemento  = 0;
        Pila pilita = new Pila();    
        
        do {        
            try{
                 opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                          "1. Insertar un elemento a la PILA\n"
                        + "2. Quitar Elemento de la PILA\n"
                        + "3. ¿ La PILA esta vacia ?\n"
                        + "4. ¿ Que elemento esta en la CIMA ? \n"
                        + "5. Tamaño de la PILA\n"
                        + "6. Vaciar la PILA\n"
                        + "7. Salir\n" 
                        + "Que deseas hacer ? " , "Menu de Opciones"
                        ,JOptionPane.QUESTION_MESSAGE));
                 switch(opcion) {
                   case 1: 
                       elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                               "Ingresa el elemento a insertar" , "Insertando en la PILA"
                               ,JOptionPane.QUESTION_MESSAGE));
                       pilita.insertar(elemento);
                       break;
                   case 2: 
                       if (!pilita.vacia()) {
                           JOptionPane.showMessageDialog(null, "El elemento extraido es " + pilita.extraer(), 
                                   "Quitamos elementos de la PILA" ,JOptionPane.QUESTION_MESSAGE);
                       }else{
                            JOptionPane.showMessageDialog(null, "La PILA esta vacia ", 
                                   "PILA vacia",JOptionPane.QUESTION_MESSAGE);
                       }
                       break;
                   case 3:
                       if (pilita.vacia()) {
                            JOptionPane.showMessageDialog(null, "La PILA esta vacia ", 
                                   "PILA vacia" , JOptionPane.QUESTION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null, "La PILA NO esta vacia ", 
                                   "PILA NO vacia" , JOptionPane.QUESTION_MESSAGE);
                       }
                   break;
                   case 4:
                       if (!pilita.vacia()) {
                           JOptionPane.showMessageDialog(null, "El elemento ubicado en la cima de la PILA es " + pilita.cima(), 
                                   "Cima de la PILA" , JOptionPane.QUESTION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null, "La PILA esta vacia: ", 
                                   "PILA vacia" , JOptionPane.QUESTION_MESSAGE);
                       }
                   break;
                   case 5:
                       JOptionPane.showMessageDialog(null, "El tamaño de la PILA es " + pilita.tamanioPila(), 
                                   "Tamaño de la PILA" , JOptionPane.QUESTION_MESSAGE);
                       break;
                   case 6:
                       if (!pilita.vacia()) {
                           pilita.limpiarPila();
                           JOptionPane.showMessageDialog(null, "La pila se ha vaciado ", 
                                   "Vaciando PILA" , JOptionPane.QUESTION_MESSAGE);
                       }else{
                           JOptionPane.showMessageDialog(null, "La PILA esta vacia: ", 
                                   "NO hay nada que vaciar" , JOptionPane.QUESTION_MESSAGE);
                       }
                       break;
                   case 7:
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
        } while (opcion!=7);  
    }
}

