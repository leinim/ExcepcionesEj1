/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Persona {
    
    Scanner leer = new Scanner(System.in);
    
    public String nombre;
    public int edad;
    public String sexo;
    public int peso;
    public double altura;
    
    
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public Persona crearPersona(){
        System.out.println("Nombre:");
        String n = leer.nextLine();
        System.out.println("Edad:");
        int ed = leer.nextInt();
        
        System.out.println("Sexo(M/F/O");
        String s = leer.next();         
        while (!s.equalsIgnoreCase("M") || !s.equalsIgnoreCase("F") || !s.equalsIgnoreCase("O")){
        
        System.out.println("Respuesta invalida. Intente nuevamente (M/F/O):");
        s = leer.next(); 
        
        }
        
        System.out.println("Peso:");
        int p = leer.nextInt();
        System.out.println("Altura (en metros)");
        int a = leer.nextInt();
        
        return new Persona(n, ed, s, p, a);
    }
    
    public int calcularIMC(Persona p){
        double imc;
        imc = p.getPeso() / Math.pow(p.getAltura(), 2);
        int retorno;
        if (imc < 20) {
            retorno = -1;
        } else if (imc >= 20 && imc <= 25) {
            retorno = 0;
        } else {
            retorno = 1;
        }
        return retorno;
    }
    
    public boolean esMayorDeEdad(Persona p){
        boolean retorno;
        retorno = p.getEdad() >= 18;
        return retorno;
    }
}
