package tp2;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] nombresAmigos = {"Guille", "Maxi", "Juan", "Ian" };

        System.out.println("Array de nombres: ");
        //Mientras el iterador sea MENOR a la cantidad de amigos, el contador a la variable i suma 1.
        //Imprime el array "nombresAmigos" en la posiciòn que el iterador va sumando dentro del bucle
        for (int i = 0; i < nombresAmigos.length; i++) {
            System.out.println(nombresAmigos[i]);
        }
    }
}

