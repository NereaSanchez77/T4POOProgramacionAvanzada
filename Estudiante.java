/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaPooUt4;

/**
 *
 * @author nerea.sanchez
 */
public class Estudiante extends Persona {
    private String nivel,centro;
    private int curso, nre;
   
    //Constructor vacio
    public Estudiante(){
        super();
    }
    
    //Constructor completo 
    public Estudiante(String nombre, String apellido, String dni,
        String nivel, int curso, int nre, String centro){
        
        super(nombre, apellido, dni);
            this.nivel = nivel;
            this.curso = curso;
            this.nre = nre;
            this.centro = centro;
    }
            
    // Metodos Getter y Setter
    
    //Metodos para nivel
     public String getNivel(){
        return nivel;
    }
    public void setNivel(String nivel){
        this.nivel = nivel;
    }
    
    //Metodos para curso
    public int getCurso(){
        return curso;
    }
    public void setCurso(int curso){
        this.curso = curso;
    }
    
    //Metodos para nre
    public int getNre(){
        return nre;
    }
    public void setNre(int nre){
        this.nre = nre;
    }
    
    //Metodos para centro
    public String getCentro(){
        return centro;
    }
    public void setCentro(String centro){
        this.centro = centro;
    }    
    
    // Hacemos metodo toString de Estudiante
    public String toString(){
        return super.toString() + ", centro ="+ this.centro +
                                  ", curso =" + this.curso +
                                  ", nre = " + this.nre +
                                  ", centro =" + this.centro;
    }
}
            
        


