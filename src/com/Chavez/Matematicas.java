package com.Chavez;

import java.lang.Math;

public class Matematicas {

    public static double elevado(double elevado1, double elevado2) {
        double resultado = Math.pow(elevado1, elevado2);
        return resultado;
    }

    public static double raiz(double raiz) {
        double resultado = Math.sqrt(raiz);
        return resultado;
    }

    public static int primo(int primo) {
        int contador = 0;
        int i;

        for (i = 1; i <= primo; i++) {
            if ((primo % i) == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            System.out.println("\tES PRIMO");
        } else {
            System.out.println("\tNO ES PRIMO");
        }
        return primo;
    }
}