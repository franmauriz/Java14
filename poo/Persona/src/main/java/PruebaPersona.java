
public class PruebaPersona {

    public static void main(String[] args) {
        // Creacion de un objeto tipo Persona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        persona1.nombre="Francisco";
        persona1.apellidoPaterno="Mauriz";
        persona1.apellidoMaterno="Pereira";
        
        persona1.darNombre();
        
        persona2.nombre = "juan";
        persona2.apellidoPaterno="perez";
        persona2.apellidoMaterno="peres";
        System.out.println("");
        persona2.darNombre();
        
        
    }
}
