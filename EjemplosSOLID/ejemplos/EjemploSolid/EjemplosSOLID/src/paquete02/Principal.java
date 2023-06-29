/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();

        Ciudad c1 = new Ciudad("Loja");
        Ciudad c2 = new Ciudad("Riobamba");
        Ciudad c3 = new Ciudad("Quito");
        Ciudad c4 = new Ciudad("Ibarra");
        Ciudad c5 = new Ciudad("Tulcan");

        Persona p1 = new Persona("Soffi", 2, c1);
        Persona p2 = new Persona("Dara", 21, c4);
        Persona p3 = new Persona("Dana", 18, c2);
        Persona p4 = new Persona("Valeria", 42, c3);
        Persona p5 = new Persona("Jose", 9, c5);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        OperacionesEstudiantes op1 = new OperacionesEstudiantes();

        op1.establecerEstudiante(lista);

        op1.establecerPromedioEdades();
        op1.establecerEdadMinima();
        op1.establecerEdadMaxima();
        op1.listaCiudades();
        System.out.println("Edad Minima: "+op1.obtenerEdadMninima());
        System.out.println("Edad Maxima"+op1.obtenerEdadMaxima());
        System.out.println("Lista Ciudes\n" + op1.obtenerlistaCiudades());

    }
}
