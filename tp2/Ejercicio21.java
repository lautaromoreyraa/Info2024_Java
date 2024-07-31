package tp2;

public class Ejercicio21 {
    public static void main(String[] args) {
        double[] arreglo = {1.5, 2,3, 3.7, 4.9, 5};

        System.out.println("Ascendentes: ");
        for (int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i] + ", ");
        }
        System.out.println("\n");

        System.out.println("Descendentes: ");

        for (int j = (arreglo.length - 1); j >= 0; j--){
            System.out.println(arreglo[j] + ", ");
        }
        System.out.print("\n");
    }
}
