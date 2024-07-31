package tp2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el numero que desea factorear");
        int N = teclado.nextInt();

        int fact = 1;
        for (int i = 2; i <= N; i++) {
            fact *= i;
        }
        System.out.println("El factorial de "+ N +" es " + fact);;
    }
}
