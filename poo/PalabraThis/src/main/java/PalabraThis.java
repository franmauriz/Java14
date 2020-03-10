
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Fran");
        //Imprimir impresora = new Imprimir();
        
        
    }
}

class Persona {
    String nombre;
    Persona(String nombre) {
        this.nombre = nombre;
        System.out.println("impresion del operador this dentro de la clase Persona:" + this);
        Imprimir impresora = new Imprimir();
        impresora.imprimir(this);
    }
}

class Imprimir {
    
    public void imprimir(Persona p){
        System.out.println("Imprimir p:" + p);
        System.out.println("Imprimir this:" + this);
    }
}
