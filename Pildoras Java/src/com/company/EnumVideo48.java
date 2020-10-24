package com.company;

import java.util.Arrays;
import java.util.Scanner;

// Video 48 - Enum
public class EnumVideo48 {
    enum talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
    enum tallas {
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
        private String abreviatura;

        private tallas(String abreviatura){  //No se admite crear instancias  - solo private
            this.abreviatura = abreviatura;
        }

        public String getAbreviatura() {
            return abreviatura;
        }

    }

    public static void main(String[] args) {
        talla s = talla.MINI;  //En el objeto s almaceno MINI
        talla m = talla.MEDIANO;
        talla l = talla.GRANDE;
        talla xl = talla.MUY_GRANDE;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita una talla = ");
        String entradaDatos = entrada.next().toUpperCase();
        tallas laTalla = Enum.valueOf(tallas.class, entradaDatos);

        System.out.println("Talla = " + laTalla);
        System.out.println("Abreviatra " + laTalla.getAbreviatura());

    }
}
