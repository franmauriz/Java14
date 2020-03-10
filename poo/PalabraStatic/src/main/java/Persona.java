
public class Persona {
    private String nombre;
    private int idPersona;
    private static int contadorPersona;
    
    Persona(String nombre){
        this.nombre=nombre;
        this.idPersona=++contadorPersona;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public static int getContadorPersona(){
        return contadorPersona;
    }
    
    public int getIdPersona(){
        return idPersona;
    }
    
    public String toString(){
        return "Nombre: " + this.nombre + " | idPersona: " + this.idPersona ;
    }
    
}
