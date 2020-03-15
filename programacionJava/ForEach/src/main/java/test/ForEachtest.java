package test;

import entidad.Persona;

public class ForEachtest {
    public static void main(String[] args) {
        int numeros[]={1,2,3,4,5,6,7,8,9};
        System.out.print("Array numeros[");
        for(int numero : numeros){
            System.out.print(numero+",");
        }
        System.out.print("]");
        
        Persona personas[]={new Persona("Fran"),new Persona("Esther"),new Persona("Dani"), new Persona("Roberto")};
        System.out.println("");
        for(Persona persona : personas){
            System.out.println("Nombres:" + persona.getNombre());
        }
    }
}
