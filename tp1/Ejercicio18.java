import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner myObjt = new Scanner(System.in);
        System.out.println("Ingrese sus Euros para convertirlos a Dolares: ");

        double euros = myObjt.nextDouble();
        double EurosADolares= euros * 1.20;
        System.out.println("Sus Euros en Dolares: "+EurosADolares);
    }
}
