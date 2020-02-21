package wVeintiSieteClassString;

public class IndexOf {    
    public static void main(String[] args){
        String str_Sample = "Este es el índice del ejemplo";
        // Carácter en la posición      
        System.out.println("Índice de caracteres 'x':" + str_Sample.indexOf('x'));
        // Carácter en la posición después del valor de índice dado
        System.out.println("Indice de caracteres después del índice 3:" + str_Sample.indexOf('s', 3));
        // Dar posición de índice para la subcadena dada      
        System.out.println("Índice de subcadena 'el':" + str_Sample.indexOf("el"));
        // Dar posición de índice para la subcadena dada y comenzar el índice     
        System.out.println("Index of substring 'es' form index:" + str_Sample.indexOf("es", 5));
        
        // Initialising string 
        String Str = new String("Welcome to geeksforgeeks"); 
  
        // Initialising search string 
        String subst = new String("geeks"); 
  
        // print the index of initial character 
        // of Substring 
        // prints 11 
        System.out.print("Found geeks starting at position : "); 
        System.out.print(Str.indexOf(subst)); 
        
        System.out.println(2+6<<1);
    }
}
    
