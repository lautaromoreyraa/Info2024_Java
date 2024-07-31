package AgendaDeContactos;

public class Contacto {
    String nombre;
    String numeroDeTelefono;
    String correoElectronico;

    //Constructor
    public Contacto(String nombre, String numeroDeTelefono, String correoElectronico) {
        this.nombre = nombre;
        this.numeroDeTelefono = numeroDeTelefono;
        this.correoElectronico = correoElectronico;
    }

    //getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }
    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Contactos {" +
                "Nombre='" + nombre + '\'' +
                "Número de teléfono='" + numeroDeTelefono + '\'' +
                "Correo electrónico='" + correoElectronico + '\'' +
                '}';
    }


}
