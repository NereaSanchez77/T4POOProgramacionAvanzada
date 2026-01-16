/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HerenciaPooUt4;

/**
 *
 * @author nerea.sanchez
 */
public class TestingAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Definimos un array Animal
        Animal granjaAnimales [] = new Animal [4];
        
        granjaAnimales[0] = new Animal ("Zipi");
        granjaAnimales[1] = new Perro ("Tobi");
        granjaAnimales[2] = new Animal ("Zape");
        granjaAnimales[3] = new Gato ("Michu");
        
        for(int i =0; i<granjaAnimales.length; i++)
           {
           if(granjaAnimales[i] instanceof Animal)
           { 
               System.out.println(granjaAnimales[i]);
               granjaAnimales[i].comer();
           }
           if(granjaAnimales[i] instanceof Gato)
           {
               Gato g1 = (Gato) granjaAnimales[i];
               g1.maullar();
           }
           if(granjaAnimales[i] instanceof Perro){
               Perro p1 = (Perro) granjaAnimales[i];
               p1.ladrar();
           }
           
        }
    }
    
}
