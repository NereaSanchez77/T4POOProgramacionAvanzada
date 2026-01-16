/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaPooUt4;

/**
 *
 * @author nerea.sanchez
 */
//Definimos la clase hija de Poligono
public class Rectangulo extends Poligono {
    
    private double lado1; //Atributos
    private double lado2;
            
    //Constructor vacio
    public Rectangulo(){
        super();
    }
    
    //Constructor completo
    public Rectangulo(double lado1, double lado2){
        super(4);
        this.lado1 =lado1;
        this.lado2 =lado2;
    }
    
     //Llamamos al metodo area definido en el UML
    @Override
    public double area(){
        return lado1*lado2;
    }  
    
    @Override 
    public double perimetro(){
        return 2*lado1 + 2*lado2;
    }
}

