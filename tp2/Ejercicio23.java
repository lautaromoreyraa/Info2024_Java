package tp2;

import java.util.Arrays;

public class Ejercicio23 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valorBuscado = 5;
        int [] nuevoArray = new int[array.length - 1];

        System.out.println("El array es: "+ Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorBuscado) {
                System.out.println("El número buscado es: "+array[i]);
                for (int j = 0; j < array.length; j++) {
                    if (j != array[i]);{
                        nuevoArray[j++] = array[i];
                    }
                }System.out.println(Arrays.toString(nuevoArray));
            }
        }
    }
}
