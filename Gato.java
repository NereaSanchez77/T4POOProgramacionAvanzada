/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaPooUt4;

/**
 *
 * @author nerea.sanchez
 */
public class Gato extends Animal {
    //Constructor vacio
    public Gato(){
        super();
    }
    
    //Constructor completo
    public Gato (String nombre){
        super(nombre);
    }    
    
    //Metodo o función que realiza
    public void maullar(){
        System.out.println("Miau, miau");  
    }  
}
