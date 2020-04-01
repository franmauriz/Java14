package bloquescodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static{
        contadorPersona=10;
        System.out.println("Ejecucion del bloque estaticto");
    }
    
    {
        this.idPersona=++contadorPersona;
        System.out.println("Ejecucion bloque no estatico");
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor Persona");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
}
