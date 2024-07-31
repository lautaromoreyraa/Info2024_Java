public class Ejercicio14 {
    public static void main(String[] args) {
        String Sofi= "Sofia Prodanov";
        int EdadSofi= 25;
        System.out.println(Sofi+" Tiene: "+EdadSofi);
        String Lauti= "Lautaro Moreyra";
        int EdadLauti= 22;
        System.out.println(Lauti+" Tiene: "+EdadLauti);
        String Maxi= "Maximiliano Roganovich";
        int EdadMaxi= 22;
        System.out.println(Maxi+" Tiene: "+EdadMaxi);
        int PromedioEdades= EdadSofi+EdadLauti+EdadMaxi / 3;
        System.out.println("El promedio de las edades es: "+PromedioEdades);
    }
}
