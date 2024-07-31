package tp2;

public class Ejercicio14 {
    public static void main(String[] args) {
        int cantidadAmigos = 4;
        String[] namesAmigos = {"Guille", "Maxi", "Juan", "Ian" };
        int[] edades = {23, 25, 16, 18};

        for (int i = 0; i <= cantidadAmigos; i++) {
            if (edades[i] >= 18) {
            System.out.println(namesAmigos[i] + " tiene " +edades[i] + " y es mayor de edad" );
            }else System.out.println("El menor de edad es " + namesAmigos[i] + " y tiene " +edades[i]);
        }
    }
}
