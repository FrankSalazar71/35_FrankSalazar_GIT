/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_35;

/**
 *
 * @author frank
 */
public class persona2_35 {
    public String nombre;
     public int edad;

     public persona2_35(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    

    }

  public String getNombre() {
        return nombre;
    

    }

  public int getEdad() {
         return edad;
    

    }

  public String saludar() {
        return "Hola, como estas soy " + nombre + " y tengo " + edad + " años.";
    
    }
}

