package paquete2;

import paquete1.Clase1;

public class Clase4 {

    public Clase4(){
        
        new Clase1();
    }
    
    public void pruebaDesdeClase4(){
        Clase1 clase1 = new Clase1();
        System.out.println(clase1.atributoPublico);
        //System.out.println(atributoProtegido);
        //System.out.println(clase1.atributoDefault);        
        System.out.println("");
        System.out.println(clase1.metodoPublico());
        //System.out.println(metodoProtegido());
        //System.out.println(clase1.metodoDefault());
        // no se puede llamar a metodos privados desde otra clase
        //System.out.println(clase1.metedoPrivado());
    }
    
    public static void main(String[] args) {
        Clase4 clase4 =new Clase4();        
        clase4.pruebaDesdeClase4();
    }
}
