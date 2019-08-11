package com.Chavez;

public class Main {

    public static void main(String[] args) {
        boolean x = true;
        while (x == true) {
            System.out.println("<><><> MENU <><><>");
            System.out.println("1. Elevar un numero");
            System.out.println("2. Calcular raiz cuadrada");
            System.out.println("3. Verificar si el numero ingresado es primo");
            System.out.println("4. Salir");
            int opcion = LectorDeDatos.solicitarEntero("Elija una opcion: ");

            switch (opcion) {
                case 1:
                    double elevado1 = LectorDeDatos.solicitarDouble("Ingrese el primer numero que desea elevar: ");
                    double elevado2 = LectorDeDatos.solicitarDouble("Ingrese la cantidad que quiere elevar el numero: ");
                    System.out.println("El resultado es :" + Matematicas.elevado(elevado1, elevado2));
                    break;
                case 2:
                    double raiz = LectorDeDatos.solicitarDouble("Ingrese el numero para sacar la raiz cuadrada: ");
                    System.out.println("El resultado es: " + Matematicas.raiz(raiz));
                    break;
                case 3:
                    int primo = LectorDeDatos.solicitarEntero("Ingrese el numero que quiere comprobar si es primo: ");
                    System.out.println(Matematicas.primo(primo));
                    break;
                case 4:
                    x = false;
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
