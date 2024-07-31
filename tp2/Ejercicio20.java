package tp2;

public class Ejercicio20 {
    public static void main(String[] args) {
        int[] numbers = {21, 33, 54, 25, 99, 110};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }else if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("El valor mínimo del arreglo es: "+min);
        System.out.println("El valor máximo del arreglo es: "+max);
    }
}
