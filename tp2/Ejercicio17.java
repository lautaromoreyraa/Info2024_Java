package tp2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        String[] directorTec = {"Pepe" , "Pipo"};
        String[] soccerClubs = {"Barsa" , "Madrid"};
        String[] playersBarsa = {"Ronald", "Martínez", "Araujo", "Gündoğan", "Lewandowski"};
        String[] playersMadrid = {"Courtois", "Carvajal", "Carvajal", "Garcìa", "Ceballos"};

        Scanner eleccionEquipo = new Scanner(System.in);
        System.out.println("Ingrese el equipo: Barsa - Madrid ->  ");
        if (eleccionEquipo.hasNextLine()) {
            soccerClubs[0] = eleccionEquipo.nextLine();
            System.out.println("El equipo elegido es: " + soccerClubs[0] + "\n y los jugadores son:" +
                    "\n "+ Arrays.toString(playersBarsa));
        }else if (eleccionEquipo.hasNextLine()) {
            soccerClubs[1] = eleccionEquipo.nextLine();
            System.out.println("El equipo elegido es: " + soccerClubs[1] + "\n y los jugadores son: " +
                    "\n "+ Arrays.toString(playersBarsa));
        }else System.out.println("Ingrese una opción válida");
        }
    }

