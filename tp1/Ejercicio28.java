public class Ejercicio28 {
    public static void main(String[] args) {
       double m, v, r;
       m= 4;
       v= 2;
       r= 6;
       double F_c = m * Math.pow(v, 2) / r;
       System.out.println("La fuerza centripeda necesaria para\n" +
               "mantener un objeto en una trayectoria circular es: "+F_c);
    }
}
