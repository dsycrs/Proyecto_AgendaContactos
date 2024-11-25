/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendacontactos;
import java.util.Scanner;
/**
 *
 * @author Daisy Ccaceres
 */
public class AgendaContactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        Contacto contacto = null; 
        Agenda agenda = new Agenda(100); // Crea una agenda con capacidad para 100 contactos
        int opcion = 0;
        
        //contactos de ejemplo
        agenda.agregarContacto(new Contacto("Juan Perez", "1234567890", "juan.perez@unitec.edu", "Calle Falsa 123", "15/05/2000"));
        agenda.agregarContacto(new Contacto("Maria Lopez", "0987654321", "maria.lopez@unitec.edu", "Avenida Siempre Viva 456", "20/10/2004"));
        agenda.agregarContacto(new Contacto("Carlos Ruiz", "5556667777", "carlos.ruiz@unitec.edu", "Boulevard Morazan 789", "01/01/2004"));
        
        agenda.agregarContacto(new Contacto("juan Perez", "1234567890", "juan.perez@unitec.edu", "Calle Falsa 123", "15/05/2000"));
        agenda.agregarContacto(new Contacto("maria Lopez", "0987654321", "maria.lopez@unitec.edu", "Avenida Siempre Viva 456", "20/10/2004"));
        agenda.agregarContacto(new Contacto("carlos Ruiz", "5556667777", "carlos.ruiz@unitec.edu", "Boulevard Morazan 789", "01/01/2004"));
        while (opcion != 5){
            System.out.println("==== Agenda de Contactos ====");
            System.out.println("1) Crear contacto");
            System.out.println("2) Mostrar contactos");
            System.out.println("3) Actualizar numero telefonico del contacto ");
            System.out.println("4) Verificar si el contacto cumpleanos hoy"); 
            System.out.println("5) Salir");
            opcion = read.nextInt();
            read.nextLine();
            
            switch (opcion){
                case 1: 
                    System.out.println("INGRESAR INFORMACION DEL CONTACTO");
                    System.out.print("> Nombre: ");
                    String nombre = read.nextLine();
                    System.out.print("> Numero telefonico: ");
                    String telefono = read.nextLine();
                    System.out.print("> Correo electronico: ");
                    String correo = read.nextLine();
                    System.out.print("> Direccion: ");
                    String direccion = read.nextLine();
                    System.out.print("> Cumpleanos (dia/mes/anio): ");
                    String cumpleanos = read.nextLine();

                    contacto = new Contacto(nombre, telefono, correo, direccion, cumpleanos);
                    agenda.agregarContacto(contacto); // agregar contacto
                    System.out.println("Se ha creado el contacto");
                    break;
                    
                case 2:
                    System.out.println("1) Mostrar organisado por primera letra del nombre");
                    System.out.println("2) Mostrar todos los contactos");
                    int opcion2 = read.nextInt();
                    switch (opcion2){
                        case 1:
                            agenda.mostrarContactosOrganizado();
                            break;
                        case 2:
                            agenda.mostrarContactos();
                            break;
                    }
                    break;

                case 3: 
                if (contacto != null) {
                    System.out.println("Ingrese el nuevo numero telefonico:");
                    String nuevoTelefono = read.nextLine();
                    if (contacto.actualizarNumero(nuevoTelefono)) {
                        System.out.println("Numero telefonico actualizado");
                    } else {
                        System.out.println("El numero telefonico es el mismo");
                    }
                } else {
                    System.out.println("No tienes contactos creados");
                }
                break;                    
                case 4: // solicita la fecha de hoy para verificar si coincide con la fecha de cumpleanos
                if (contacto != null) {
                    System.out.println("Ingrese la fecha de hoy (dia/mes):");
                    String fechaHoy = read.nextLine();
                    if (contacto.verificarCumpleanosHoy(fechaHoy)) {  
                        System.out.println("Hoy es el cumpleanos de " + contacto.getNombre());
                    } else {
                        System.out.println(contacto.getNombre() + " no cumple anos hoy");
                    }
                } else {
                    System.out.println("No tienes contactos creados");
                }
                break;
                case 5:
                    break;
                default:
                    System.out.println("La opcion no es valida");
                    break;
            }
        }
    }
    
}
