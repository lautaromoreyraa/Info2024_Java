package TareasSimple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea {
    private String titulo;
    private String descripcion;
    private String fechaVencimiento;

    private static List<Tarea> listaTareas = new ArrayList<>();

    //constructor
    public Tarea(String titulo, String descripcion, String fechaVencimiento) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }

    //getters y setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    //Metodo para crear tareas
    public static List<Tarea> crearTarea() {
        System.out.println("Creador de tareas :)");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el titulo de la tarea: ");
        String titulo = teclado.nextLine();

        System.out.println("Ingrese la descripcion de la tarea: ");
        String descripcion = teclado.nextLine();

        System.out.println("Ingrese la fecha de vencimiento de la tarea: ");
        String fechaVencimiento = teclado.nextLine();

        listaTareas.add(new Tarea(titulo, descripcion, fechaVencimiento));
        return listaTareas;
    }
//Metodo para mostrar las tareas

    public static void mostrarTareas() {
        System.out.println("Lista de tareas: ");
        for (Tarea tarea : listaTareas) {
            System.out.println(tarea);
        }
    }

    @Override
    public String toString() {
        return "Tarea {" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha de vencimiento='" + fechaVencimiento + '\'' +
                '}';
    }

}
