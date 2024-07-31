import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduzca sus dolares para obtener el valor en pesos: ");

        double dolares = myObj.nextDouble();
        double DolaresAPesos= dolares * 20;
        System.out.println("Tus pesos son: Us"+ DolaresAPesos);
    }
}
