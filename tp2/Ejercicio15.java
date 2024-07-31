package tp2;

public class Ejercicio15 {
    public static void main(String[] args) {
        int optionSelected = 3;
        System.out.println("Menú de opciones:");
        while (optionSelected != 0) {
            switch (optionSelected) {
                case 1:
                    System.out.println("1. Opción 1");
                    break;
                case 2:
                    System.out.println("2. Opción 2");
                    break;
                case 3:
                    System.out.println("3. Opción 3");
                case 4:
                    System.out.println("4. Opcion 4");
                default: System.out.println("Opcion no valida");
                    break;
            }
            break;
        }
    }
}
