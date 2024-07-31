package tp2;

public class Ejercicio5 {
    public static void main(String[] args) {
        int N = 10;
        int suma = 0;

        for (int i = 1; i <= N; i++){
            suma += i;
        }
            System.out.println("La suma de numeros naturales hasta el "+ N + ", es " + suma);
    }
}