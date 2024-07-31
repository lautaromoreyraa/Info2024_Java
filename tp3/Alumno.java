package tp3;

import java.time.LocalDate;
import java.util.Scanner;

public class Alumno {
        private String nombreAlumno;
        private String apellidoAlumno;
        private int edadAlumno;

        public Alumno (String nombreAlumno, String apellidoAlumno, int edadAlumno) {
            this.nombreAlumno = nombreAlumno;
            this.apellidoAlumno = apellidoAlumno;
            this.edadAlumno = edadAlumno;
        }

//getters y setters
        public String getNombreAlumno() {
         return nombreAlumno;
        }

        public void setNombreAlumno(String nombreAlumno) {
         this.nombreAlumno = nombreAlumno;
        }

        public String getApellidoAlumno() {
         return apellidoAlumno;
        }

        public void setApellidoAlumno(String apellidoAlumno) {
         this.apellidoAlumno = apellidoAlumno;
         }

        public int getEdadAlumno() {
         return edadAlumno;
        }

        public void setEdadAlumno(int edadAlumno) {
         this.edadAlumno = edadAlumno;
        }

//Metodo para crear un alumno
        public static Alumno crearNuevoAlumno(){
            Scanner teclado = new Scanner(System.in);

            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = teclado.nextLine();


            System.out.println("Ingrese el apellido del alumno: ");
            String apellido = teclado.nextLine();

            System.out.println("Ingrese la edad del alumno: ");
            int edad = teclado.nextInt();

            return new Alumno(nombre, apellido, edad);
        }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombreAlumno + '\'' +
                ", apellido='" + apellidoAlumno + '\'' +
                ", edad=" + edadAlumno +
                '}';
    }
 }
