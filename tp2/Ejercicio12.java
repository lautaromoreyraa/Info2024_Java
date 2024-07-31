package tp2;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero y arrojara todos los numeros divisibles por 7 : ");
        int someNumber = sc.nextInt();

        for (int i = 1; i <= someNumber ; i++) {
            if (i < 0) {
                System.out.println("No puede ser negativo");
            }else if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
