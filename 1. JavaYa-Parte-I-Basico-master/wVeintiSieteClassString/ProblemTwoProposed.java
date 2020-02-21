package wVeintiSieteClassString;

import java.util.*;

public class ProblemTwoProposed {
    private Scanner teclado;
    private String str;
    
    public ProblemTwoProposed(){
        teclado = new Scanner(System.in);
        System.out.print("Ingresar alguna palabra o frase: ");
        str = teclado.nextLine();
    }
    
    public void primerMitad(){
        String mitad;
        mitad = str.substring(0, str.length()/2);
        System.out.println("La primer mitad de caracteres es: " + mitad);
    }
    
    //LOGICA MIA :(
    public void ultimoCaracter(){
        String ultimo;
        ultimo = str.substring(str.length() -1, str.length());
        System.out.println("El ultimo caracter MIO es: " + ultimo);
    }
    //LOGICA JAVAYA :)
    public void ultimoCaracterJavaYa(){
        char ultimo_javaya;
        ultimo_javaya = str.charAt(str.length() -1);
        System.out.println("El ultimo caracter de JAVAYA es: " + ultimo_javaya);
    }
    
    public void formaInversa(){
        System.out.print("Forma inversa: ");
        for (int i = str.length() - 1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    
    public void guion(){
        System.out.print("Separacion por GUIÓN: ");
        for (int i = 0; i < str.length() ; i++) {
            System.out.print(str.charAt(i) + " - ");
        }
        System.out.println();
    }
    
    public void vocales(){
        int cantidad = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'||
                str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                cantidad ++;
            }
        }
        System.out.println("La cantidad de vocales es: " + cantidad);
    }
    
    public void esCapicua(){
        int cantidad = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() -1 -i)) {
                cantidad ++;
            }
        }
        if (cantidad == str.length() / 2) {
            System.out.println("Es capicua " + str);
        }else{
            System.out.println("NO es capicua " + str);
        }
    }
    
    
    public static void main(String[] args) {
        ProblemTwoProposed ptp = new ProblemTwoProposed();
        ptp.primerMitad();
        ptp.ultimoCaracter();
        ptp.ultimoCaracterJavaYa();
        ptp.formaInversa();
        ptp.guion();
        ptp.vocales();
        ptp.esCapicua();
    }
}
