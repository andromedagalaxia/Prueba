
package contructoresysobrecarga;
import javax.swing.*;
public class Empleados {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private Double sueldo;
    
    //Primer constructor 
    public Empleados(String nombre,String apellidos,int edad, Double sueldo){
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.edad=edad;
    this.sueldo=sueldo;   
    
    }
    
    // Segundo Constructor
    public Empleados(){
    nombre="Lupita";
    apellidos="Brizuela";
    edad=46;
    sueldo=345.67;            
    }
//Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
     
  
   
    public void imprimir (){
        JOptionPane.showMessageDialog(null,"Los datos del empleado son: \n"+nombre+apellidos+"\nsu edad es : "+ edad+"\nel sueldo es "+sueldo);
    }
      
    
}
