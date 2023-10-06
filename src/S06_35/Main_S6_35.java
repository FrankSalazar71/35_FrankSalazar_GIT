/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_35;

import S07_35.persona1_35;
import S07_35.persona2_35;

/**
 *
 * @author frank
 */
public class Main_S6_35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //*calculadora_35 calcu1 = new calculadora_35  (10, 5);

        //System.out.println("Suma: " + calcu1.sumar());
        //System.out.println("Resta: " + calcu1.restar());
        //System.out.println("Multiplicación: " + calcu1.multiplicar());
        //System.out.println("División: " + calcu1.dividir());

        //System.out.println("Suma de tres números: " + calcu1.sumar(7));
        // System.out.println("Potencia: " + calcu1.potencia(2));
        
          // Crear instancias de la clase Estudiante_35
        //estudiante_35 estudiante1 = new estudiante_35("Juan", 20, 85.5);
        //estudiante_35 estudiante2 = new estudiante_35("María", 22, 90.0);

        // Llamar a métodos y mostrar información
        //estudiante1.estudiar();
        //estudiante2.estudiar("Matemáticas");

        // Mostrar calificaciones
        //System.out.println("Calificación de " + estudiante1.getNombre() + ": " + estudiante1.getCalificacion());
        //System.out.println("Calificación de " + estudiante2.getNombre() + ": " + estudiante2.getCalificacion());
        
        //*PERSONAS
        persona1_35 persona1 = new persona1_35("Thalia", 23);
        persona1_35 persona2 = new persona1_35("Marcelo", 26);

        persona1.saludar();
        persona2.saludar();

        persona2_35 persona3 = new persona2_35("Thalia", 23);
        persona2_35 persona4 = new persona2_35("Marcelo", 26);
        System.out.println(persona3.saludar());
        System.out.println(persona4.saludar());
       
    }
}
    

        

    
    

