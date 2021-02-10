/*
Elaborado por : Lupita Brizuela
Programa con sobrecarga y contructores
9 de febrero del 2021
Materia Programación Orientada a objetos 
 */
package contructoresysobrecarga;


public class ContructoresYSobrecarga {

   
    public static void main(String[] args) {
       
        Empleados objEmpleado1 = new Empleados();
        Empleados objEmpleado2 = new Empleados("Juan","López",15,123.45);
        
        objEmpleado1.imprimir();
        objEmpleado2.imprimir();
        

        
        
    }
    
}
