
public class PruebaNull {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Fran");
        Persona persona2 = persona1;
        
        System.out.println(persona1.getNombre());
        
        persona1 = null;
        
        if(persona1 != null){
            System.out.println(persona1.getNombre());
        }else{
            System.out.println("Persona1 ya no apunta a ningun objeto");
        }
        
        System.out.println(persona2.getNombre());
    }

}

class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}
