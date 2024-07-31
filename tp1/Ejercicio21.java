import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Ingrese sus Bitcoins para convertirlos a Dolares, utilice la coma: ");

        double Bitcoins = MyObj.nextDouble();
        double BitcoinsADolares = Bitcoins * 50000;
        System.out.println("Sus Bitcoins en Dolares son: " + BitcoinsADolares);
    }
}
