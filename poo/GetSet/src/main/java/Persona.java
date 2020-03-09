public class Persona {
    private String nombre;
    private double sueldo;
    private boolean borrado;
    
    Persona(String nombre, double sueldo, boolean borrado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.borrado = borrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
    @Override
    public String toString(){
        return "Datos: " + this.nombre + " | " + this.sueldo + " | " + this.borrado;
    }
    
}
