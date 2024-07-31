package tp2;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        int[] numerosEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numeroIngresado = entrada.nextInt();
        if (numeroIngresado >= 0 && numeroIngresado <= 10) {
            switch ("El numero ingresado no es válido") {}
        }else System.out.println("El numero es: " + numeroIngresado);
    }
}
