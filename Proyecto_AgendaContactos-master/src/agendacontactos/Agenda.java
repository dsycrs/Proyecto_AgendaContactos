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
    
    public void mostrarContactosOrganizado() {
        if (contador == 0) {
            System.out.println("No hay contactos registrados.");
            return;
        }
        System.out.println("--- Lista de Contactos ---");
        //voy a usar los numeros de la tabla acii para encontrar la primera letra
        for (int l = 65; l <= 90; l++) {
            for (int i = 0; i < contador; i++) {
                String a=contactos[i].getNombre();
                int b=(a.charAt(0));
                
                if (b==l)
                    System.out.println(contactos[i]);
                
                if (b==(l+32))
                    System.out.println(contactos[i]);
            }
        }
    }
}