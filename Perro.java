/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaPooUt4;

/**
 *
 * @author nerea.sanchez
 */
public class Perro extends Animal {
    private String nombre;
    
    //Constructor vacio
    public Perro(){
        super();
    }
    
    //Constructor Completo
    public Perro(String nombre){
        super(nombre);
        
    }
    
    //Metodo o función que realiza
    public void ladrar(){
        System.out.println("Guau, guau");
    }
}
