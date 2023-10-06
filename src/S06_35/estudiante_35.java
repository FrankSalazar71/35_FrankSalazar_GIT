/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_35;

/**
 *
 * @author frank
 */
public class estudiante_35 {
    
    
       // Atributos
    private String nombre;
    private int edad;
    private double calificacion;

    // Constructor por defecto (sobrecarga de constructores)
    public estudiante_35() {
        nombre = "";
        edad = 0;
        calificacion = 0.0;
    }

    // Constructor con parámetros (sobrecarga de constructores)
    public estudiante_35(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Método sin valor de retorno
    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    // Método con sobrecarga (sobrecarga de métodos)
    public void estudiar(String materia) {
        System.out.println(nombre + " está estudiando " + materia + ".");
    }

    // Método con valor de retorno
    public double getCalificacion() {
        return calificacion;
    }

    // Método con valor de retorno para obtener el nombre
    public String getNombre() {
        return nombre;
    }

}
  