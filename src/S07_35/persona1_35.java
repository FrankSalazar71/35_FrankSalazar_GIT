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
public class persona1_35 {
   

public String nombre;
public int edad;

public persona1_35(String nombre, int edad) {
this.nombre = nombre;
this.edad = edad;
}

public void saludar() {
System.out.println("Hola,como estas soy " + nombre + " y tengo " + edad + " años.");
}

}

