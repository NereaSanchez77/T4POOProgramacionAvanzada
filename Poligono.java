/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaPooUt4;

/**
 *
 * @author nerea.sanchez
 */

//Definimos la clase Padre abstracta de Poligono
public abstract class Poligono {
    private int numLados; // Atributos de la clase
    
    // Constructor vacio
    public Poligono(){
    }
    
    //Constructor completo
    public Poligono(int numLados){
        this.numLados = numLados;
    }
    
    //Metodos Getter y Setter
    
    //Get
    public int getnumLados(){
        return numLados;
    }
    
    //Set
    public void setnumLados(int numLados){
        this.numLados = numLados;
    }
    
    //Añadimos metodos(funciones) complementarias
    //Declaración del metodo de abtranción area
    public abstract double area();//Se represnta en curiva en el UML
    public abstract double perimetro();
}
