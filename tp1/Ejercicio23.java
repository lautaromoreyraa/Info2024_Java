import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados celsius para convetirlo en Farenheit: ");

        double celsius = MyObj.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("El temperatura en grados Farenheit es: " + fahrenheit);
    }
}
