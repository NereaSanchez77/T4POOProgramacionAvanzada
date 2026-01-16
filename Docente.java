/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaPooUt4;

/**
 *
 * @author nerea.sanchez
 */
public class Docente extends Persona {
    private String[] modulos;
    private int nrp;
    private String centro;
    
    //Constructor vacio
    public Docente(){
        super();
    }
    
    //Constructor completo 
    public Docente(String nombre, String apellido, String dni,
            String[] modulos, int nrp, String centro){
        
        super(nombre, apellido, dni);
            this.modulos = modulos;
            this.nrp = nrp;
            this.centro = centro;
    }
            
    //Metodos Getter y Setter
    
    //Metodos de modulos
    public String [] getModulos(){
        return modulos;
    }
    public void setModulos(String modulos []){
        this.modulos = modulos;
    }
    
    //Metodos de nrp
    public int getNrp(){
        return nrp;
    }
    public void setNrp(int nrp){
        this.nrp = nrp;
    }
    
    //Metodos de centro
    public String getCentro(){
        return centro;
    }
    public void setCentro(String centro){
        this.centro = centro;
    }
    
    /*
    */
   @Override
    //Metodo complementario añadido
    public String getNombreCompleto(){
        return super.getApellido() + " " + super.getNombre();
    }
    // Hacemos metodo toString de Docente
    public String toString(){
        return super.toString() + ", modulos ="+ this.modulos +
                                  ", nrp =" + this.nrp +
                                  ", centro =" + this.centro;
    }
}

