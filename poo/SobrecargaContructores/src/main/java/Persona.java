
public class Persona {

    private int idPersona;
    private static int contadorPersona;
    private String nombre;
    private int edad;

    private Persona() {
        this.idPersona = ++contadorPersona;

    }

    public Persona(String nombre, int edad) {
        this();
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + this.idPersona + ", nombre=" + this.nombre + ", edad=" + this.edad + '}';
    }

}
