/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendacontactos;

/**
 *
 * @author Daisy Ccaceres
 */
class Contacto {
private String nombre;
private String telefono;
private String correo;
private String direccion;
private String cumpleanos;

    public Contacto(String nombre, String telefono, String correo, String direccion, String cumpleanos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.cumpleanos = cumpleanos;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCumpleanos() {
        return cumpleanos;
    }

    public void setCumpleanos(String cumpleanos) {
        this.cumpleanos = cumpleanos;
    }
@Override
    public String toString() {
    return "> " +
            "Nombre: " + nombre + " | " +
            "Numero telefonico: " + telefono + " | " +
            "Correo: " + correo + " | " +
            "Direccion: " + direccion + " | " +
            "Cumpleanos: " + cumpleanos;
    }
    
        public boolean actualizarNumero(String nuevoTelefono) { //si el numero ingresado es diferente al actual se actualiza
        if (!nuevoTelefono.equals(this.telefono)) { 
            this.telefono = nuevoTelefono;  
            return true;  
        }
        return false;  // retorna falso si es el mismo
    }

    public boolean verificarCumpleanosHoy(String fechaHoy) {
        String fechaCumple = this.cumpleanos.substring(0, 5);  // extrae solamente los 5 caracteres de la cadena
        return fechaCumple.equals(fechaHoy);  // compara ambas fechas
    }
 
}
