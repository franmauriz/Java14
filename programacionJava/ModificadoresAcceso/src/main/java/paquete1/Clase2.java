package paquete1;

public class Clase2 {
    public Clase2(){
        new Clase1();
        new Clase1("Clase","protected");
        new Clase1("Clase","default","paquete");
        // no podemos llamar a constructores privados desde otras clases sin importar si estamos en el miso paquete
        //new Calse1("Calse","privado","paquete","privados");
    }
    
    public void pruebaDesdeClase2(){
        Clase1 clase1 = new Clase1();
        System.out.println(clase1.atributoPublico);
        System.out.println(clase1.atributoProtegido);
        System.out.println(clase1.atributoDefault);        
        System.out.println("");
        System.out.println(clase1.metodoPublico());
        System.out.println(clase1.metodoProtegido());
        System.out.println(clase1.metodoDefault());
        // no se puede llamar a metodos privados desde otra clase
        //System.out.println(clase1.metedoPrivado());
    }
    
    public static void main(String[] args) {
        Clase2 clase2 =new Clase2();        
        clase2.pruebaDesdeClase2();
    }
    
}
