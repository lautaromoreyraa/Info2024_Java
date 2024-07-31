package tp2;

import java.util.Arrays;

public class Ejercicio24 {
    public static void main(String[] args) {
        int[] arreglo1 = {1,2,3,4,5};
        int[] arreglo2 = {6,7,8,9,10};
        int[] arregloUnido = new int[arreglo1.length + arreglo2.length];

        System.out.println("El primer array es: "+ Arrays.toString(arreglo1));
        System.out.println("El segundo array es: "+ Arrays.toString(arreglo2));

        System.arraycopy(arreglo1, 0, arregloUnido, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, arregloUnido, arreglo1.length, arreglo2.length);

        System.out.println("Y los arrays unidos quedan: "+ Arrays.toString(arregloUnido));
    }
}
