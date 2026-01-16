/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaPooUt4;

/**
 *
 * @author nerea.sanchez
 */
//Definimos la clase hija rectangulo 
public class Triangulo extends Poligono {
    private double lado1; //Atributos
    private double lado2;
    private double lado3;
    
    //Constructor vacio
    public Triangulo(){
        super();
    }
    
    //Constructor completo
    public Triangulo(double lado1, double lado2, double lado3){
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    //Metodos Getter y Setter 
    
    //lado1
    public double getlado1(){
        return lado1;
    }
    public void setlado1(double lado1){
        this.lado1 = lado1;
    }
    
    //lado2
    public double getlado2(){
        return lado2;
    }
    public void setlado2(double lado2){
        this.lado2 = lado2;
    }
    
    //lado3
    public double lado3(){
        return lado3;
    }
    public void setlado3(double lado3){
        this.lado3 =lado3;
    }
    
    //Definimos el metodo doubleArea
    @Override
    public double area(){
        return (lado1 + lado2 + lado3)/2;
    } 
    
    //Definimos el metodo doublePerimetro
    @Override
    public double perimetro(){
        return lado1 + lado2 + lado3;
    }
}
