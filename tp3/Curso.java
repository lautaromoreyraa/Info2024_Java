package tp3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {
    private String nombreCurso;
    private boolean estaHabilitado;
    private String descripcionCurso;
    private ArrayList<Alumno> listaAlumnos;

//Constructor
    public Curso(String nombreCurso, String descripcionCurso, boolean estaHabilitado, ArrayList<Alumno> alumnos) {
        this.nombreCurso = nombreCurso;
        this.estaHabilitado = estaHabilitado;
        this.descripcionCurso = descripcionCurso;
        this.listaAlumnos = alumnos;
    }

//Getters y setters
    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
        System.out.println();
    }

    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }


    public boolean isEstaHabilitado() {
        return estaHabilitado;
    }
    public void setEstaHabilitado(boolean estaHabilitado) {
        this.estaHabilitado = estaHabilitado;
    }


    public ArrayList<Alumno> getAlumnos() {
        return listaAlumnos;
    }
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.listaAlumnos = alumnos;
    }


    public String getDescripcionCurso() {
        return descripcionCurso;
    }
    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }

//Metodo para crear un nuevo curso
    public static Curso crearNuevoCurso (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del curso: ");
        String nombreCurso = sc.nextLine();

        System.out.println("Ingrese el descripcion del curso: ");
        String descripcionCurso = sc.nextLine();

        System.out.println("¿Está disponible el curso? si/no: ");
        boolean estaHabilitado = Boolean.parseBoolean(sc.nextLine());

        List<Alumno> listaAlumnos = new ArrayList<Alumno>();
        for (Alumno alumno : listaAlumnos) {
            listaAlumnos.add(alumno);
        }

        return new Curso (nombreCurso, descripcionCurso, estaHabilitado, (ArrayList<Alumno>) listaAlumnos);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombreCurso + '\'' +
                ", habilitado=" + estaHabilitado +
                ", descripcion='" + descripcionCurso + '\'' +
                ", alumnos=" + listaAlumnos +
                '}';
    }
}