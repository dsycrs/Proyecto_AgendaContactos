/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacontactos;

/**
 *
 * @author eduar
 */
public class Agenda {
    private Contacto[] contactos;
    private int contador;

    public Agenda(int capacidad) {
        contactos = new Contacto[capacidad]; // Inicializa el arreglo
        contador = 0;
    }

    //para agregar un nuevo contacto
    public boolean agregarContacto(Contacto contacto) {
        if (contador < contactos.length) { 
            contactos[contador] = contacto; 
            contador++;
            return true;
        } else {
            System.out.println("agenda llena.");
            return false;
        }
    }

    //para mostrar todos los contactos
    public void mostrarContactos() {
        if (contador == 0) {
            System.out.println("No hay contactos registrados.");
            return;
        }
        System.out.println("--- Lista de Contactos ---");
        for (int i = 0; i < contador; i++) {
            System.out.println(contactos[i]); // Imprime
        }
    }
    
    //para eliminar contacto por nombre completo
    public boolean eliminarContacto(String nombre) {
    for (int i = 0; i < contador; i++) {
        if (contactos[i].getNombre().equals(nombre)) {
            //desplaza los contactos
            for (int j = i; j < contador - 1; j++) {
                contactos[j] = contactos[j + 1];
            }
            contactos[contador - 1] = null;
            contador--; 
            return true;
        }
    }
    System.out.println("Contacto no encontrado.");
    return false; // 
}
    
    
}