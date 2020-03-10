public class Empleado extends Persona{
    private double sueldo;
    private int idEmpleado;
    private static int contadorEmpleado;
    
    Empleado(String nombre,double sueldo){
        super(nombre);
        this.sueldo=sueldo;
        this.idEmpleado=++contadorEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "sueldo=" + sueldo + ", idEmpleado=" + idEmpleado + '}';
    }
    
    
}
