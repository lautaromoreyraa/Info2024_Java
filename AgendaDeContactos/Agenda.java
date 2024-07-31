package AgendaDeContactos;

import java.util.LinkedList;
import java.util.Scanner;

public class Agenda {

    private LinkedList<Contacto> listaContactos = new LinkedList<>();
    private Scanner teclado = new Scanner(System.in);

    public void agregarContacto() {
        System.out.println("Nombre del contacto: ");
        String nombreContacto = teclado.nextLine();

        System.out.println("Número de telefono: ");
        String telefonoContacto = teclado.nextLine();

        System.out.println("Correo electrónico: ");
        String correoContacto = teclado.nextLine();

        listaContactos.add(new Contacto(nombreContacto, telefonoContacto, correoContacto));
        System.out.println("Telefono agregado");
    }

    public void eliminarContacto() {
        System.out.println("Nombre del contacto a eliminar: ");
        String nombreContactoEliminar = teclado.nextLine();

        Contacto contactoPorEliminar = null;
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombreContactoEliminar)) {
                contactoPorEliminar = contacto;
                break;
            }
        }
        if (contactoPorEliminar != null) {
            listaContactos.remove(contactoPorEliminar);
            System.out.println("Contacto eliminado");
        }else System.out.println("Contacto no encontrado");
    }

    public void buscarContactos() {
        System.out.println("Nombre del contacto: ");
        String nombreContacto = teclado.nextLine();
        for (Contacto contactoBuscado : listaContactos) {
            if (contactoBuscado.getNombre().equalsIgnoreCase(nombreContacto)) {
                System.out.println(contactoBuscado);
            }else System.out.println("Contacto no encontrado");
        }
    }

    public void mostrarContactos() {
        if (listaContactos.isEmpty()) {
            System.out.println("No hay un contacto que coincida con ese nombre");
        }else {
            for (Contacto contacto : listaContactos) {
                System.out.println(contacto);
            }
        }
    }

    public void menu(){
        int opcion;
        do{
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Eliminar Contacto");
            System.out.println("3. Buscar Contactos");
            System.out.println("4. Mostrar Contactos");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    eliminarContacto();
                    break;
                case 3:
                    buscarContactos();
                    break;
                case 4:
                    mostrarContactos();
                    break;
                case 5:
                    System.out.println("Saliendo del teléfono :)");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (opcion != 5);
    }

}
