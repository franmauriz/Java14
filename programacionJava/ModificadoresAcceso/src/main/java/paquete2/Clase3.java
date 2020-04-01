/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Clase1;

/**
 *
 * @author absol
 */
public class Clase3 extends Clase1{
    public Clase3(){
        super("uno","dos"); // contructor protegido de la clase1
        new Clase1(); // construtor publico clase1
    }
    
    public void pruebaDesdeClase3(){
        Clase1 clase1 = new Clase1();
        System.out.println(clase1.atributoPublico);
        System.out.println(atributoProtegido);
        //System.out.println(clase1.atributoDefault);        
        System.out.println("");
        System.out.println(clase1.metodoPublico());
        System.out.println(metodoProtegido());
        //System.out.println(clase1.metodoDefault());
        // no se puede llamar a metodos privados desde otra clase
        //System.out.println(clase1.metedoPrivado());
    }
    
    public static void main(String[] args) {
        Clase3 clase3 =new Clase3();        
        clase3.pruebaDesdeClase3();
    }
}
