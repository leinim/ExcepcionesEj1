/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.

 */
package pooej7;

import Entidades.Persona;

/**
 *
 * @author Mile
 */
public class POOEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = null;
        
        try{        
        
        boolean edad = p1.esMayorDeEdad(p1);
            System.out.println(edad);
        
        }catch (NullPointerException e) {
            System.out.println("Error: objeto inicializado como nulo");
        }   
        
        
    }
    
}
