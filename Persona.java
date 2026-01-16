/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaPooUt4;

/**
 *
 * @author nerea.sanchez
 */

//Clase
public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private String dni;
    
    //Constructor vacio
    public Persona (){   
}
    //Constructor completo
    public Persona (String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        
    }
    
    // Metodos getter y Setter 

    //Metodos Atributo Nif
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     //Metodos Atributo Nombre
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
     //Metodos Atributo dni
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    
    //Metodo añadido metodo y complementado que sera sobreescrito
    public String getNombreCompleto(){
        return nombre + " " + apellido;                    
    }  
    
    // Lo hacemos con el metodo toString
    public String toString() {
            return "Persona[" +
                   "nombre =" + this.nombre +
                   "apellido =" + this.apellido +
                   "dni =" + this.dni + "]";
    }
}
