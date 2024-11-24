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
        int opcion = 0;
        
        while (opcion != 5){
            System.out.println("--- Menu Contacto ---");
            System.out.println("1. Crear  contacto");
            System.out.println("2. Mostrar contacto");
            System.out.println("3. Actualizar numero telefonico del contacto ");
            System.out.println("4. Verificar si  el contacto cumpleanos hoy"); 
            System.out.println("5. Salir del menu contacto");
            opcion = read.nextInt();
            read.nextLine();
            
            switch (opcion){
                case 1: 
                    System.out.println("INGRESAR INFORMACION DEL CONTACTO");
                    System.out.println("Nombre:");
                    String nombre = read.nextLine();
                    System.out.println("Numero telefonico:");
                    String telefono = read.nextLine();
                    System.out.println("Correo electronico:");
                    String correo = read.nextLine();
                    System.out.println("Direccion:");
                    String direccion = read.nextLine();
                    System.out.println("Cumpleanos (dia/mes/anio)");
                    String cumpleanos = read.nextLine();
                    
                    contacto = new Contacto (nombre, telefono, correo, direccion, cumpleanos);
                    System.out.println("Se ha creado el contacto");
                    break;
                    
                case 2:
                    if (contacto != null){
                     System.out.println(contacto);   
                    } else {
                        System.out.println("No tienes contactos creados");
                    }
                    break;

                case 3: // solicita cambiar numero telefonico
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
