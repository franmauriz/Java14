
public class Empleado extends Persona {

    private int idEmpleado;
    private static int contadorEmpleado;
    private double sueldo;
    private boolean borrado;
    
    private Empleado(String nombre,int edad){
        super(nombre, edad);
    }

    public Empleado(String nombre, int edad, double sueldo, boolean borrado) {
        this(nombre,edad);
        this.sueldo = sueldo;
        this.borrado = borrado;
        this.idEmpleado = ++contadorEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isBorrado() {
        return this.borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + ", borrado=" + borrado + '}';
    }
    
    
}
