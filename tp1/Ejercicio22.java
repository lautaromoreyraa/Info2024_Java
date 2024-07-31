import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo para saber el área: ");

        double radio = MyObj.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }
}
