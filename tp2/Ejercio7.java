package tp2;

public class Ejercio7 {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el promedio de notas");

        double notes1 = 90.0;
        double notes2 = 70.0;
        double notes3 = 50.0;

        double promedio = (notes1 + notes2 + notes3) / 3 ;
        double notaMinima = 70.0;
        if (promedio >= notaMinima) {
            System.out.println("El promedio es: " + promedio + " Aprobaste");
        }else System.out.println("El promedio es: " + promedio + " Desaprobaste");
    }
}
