import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Ingrese sus Pesos para convertilos a Euros: ");

        double Pesos = MyObj.nextDouble();
        double PesosAEuros = Pesos / 20;
        System.out.println("Sus Pesos en Euros son: "+ PesosAEuros);
    }
}
