package tp3;


public class App {
    public static void main(String[] args) {

        Alumno alumno = Alumno.crearNuevoAlumno();
        Alumno alumno2 = Alumno.crearNuevoAlumno();
        Alumno alumno3 = Alumno.crearNuevoAlumno();


        Curso curso1 = Curso.crearNuevoCurso();
        Curso curso2 = Curso.crearNuevoCurso();

        System.out.println("Cursos: ");
        System.out.println(curso2);

        System.out.println("Alumnos del curso: ");
        System.out.println(alumno);
        System.out.println(alumno2);
        System.out.println(alumno3);
    }
}
