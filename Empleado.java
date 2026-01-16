/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaPooUt4;

/**
 *
 * @author nerea.sanchez
 */

//Clase Empleado que hereda de la clase persona(enlazamos)
public class Empleado extends Persona {
    private String numeroCuenta;
    private String puesto;
    
    //Constructor vacio
    public Empleado()
    { 
        super(); // Para llamar al constructor vacio de la clase Padre
    }
    
    //Constructor completo 
    public Empleado(String nombre, String apellido, 
        String dni, String numeroCuenta, String puesto)//Atributos 
    {
        super(nombre, apellido,dni);// Atributos heredados de la clase Padre 
        this.numeroCuenta = numeroCuenta;
        this.puesto = puesto;
    }
    
    // Metodos Getter y Setter
    
    //Metodos Atributo numeroCuenta
    public String getnumeroCuenta(){
        return numeroCuenta;
    }
    public void setnumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    
    //Metodos Atributo puesto 
    public String getpuesto(){
        return puesto;
    }
    public void setpuesto(String puesto){
        this.puesto = puesto;
    }
    
    //Hacemos metodo toString de Empleado
    public String toString(){
    return super.toString() + ", numeroCuenta =" + this.numeroCuenta +
                              ", puesto =" + this.puesto;
    }
}

   /* @Override //Es opcional
    public String toString() {
        return "nombre =" + super.getNombre() +
               ", apellido =" + super.getApellido()+
               ", dni =" + super.getDni() +
               ", numeroCuenta =" + this.numeroCuenta +
               ", puesto =" + this.puesto; 
    }
}
  */


   
    
         
