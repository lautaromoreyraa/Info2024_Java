package tp2;

import java.util.Arrays;

public class Ejercicio22 {
    public static void main(String[] args) {
        double[] array1 = {2.5, 5.5, 7.5, 9.5, 3.5};
        double[] array2 = {1.5, 2.5, 4.5, 6.5, 5.5};

        int lenght = array1.length;

        double[] resultArray = new double [lenght];

        for (int i = 0; i < lenght; i++) {
            double result = array1[i] - array2[i];
            resultArray[i] = result;
            if (result < 0){
                result = 0;
                System.out.println("El resultado es: " + result);
            }
        }
        System.out.println("El resultado de la resta es: " + Arrays.toString(resultArray));
    }
}
