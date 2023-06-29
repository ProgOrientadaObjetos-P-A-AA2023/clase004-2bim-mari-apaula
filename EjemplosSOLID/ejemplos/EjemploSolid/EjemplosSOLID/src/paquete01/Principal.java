/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author Sistemas G Didactic
 */
public class Principal {
 
    public static void main(String[] args) {
        ArrayList<Persona> mylista = new ArrayList<>();
        Persona p1 = new Persona("Soffi", 24);
        Persona p2 = new Persona("Dara", 21);
        
        System.out.printf("%s\n", p1.obtenerNombre());        
        System.out.printf("%s\n", p2.obtenerNombre());
        
        mylista.add(p1);
        mylista.add(p2);
        
       double  promedio = p1.promedioEdades(mylista);
       System.out.printf("%.2f\n",promedio);


    }
}
