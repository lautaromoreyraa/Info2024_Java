import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Ingrese sus Libras Esterlinas para convertirlos a Dolares: ");

        double LibrasEsterlinas = MyObj.nextDouble();
        double LibrasADolares = LibrasEsterlinas * 1.40;
        System.out.println("Sus Libras son: Usd" + LibrasADolares);
    }
}
