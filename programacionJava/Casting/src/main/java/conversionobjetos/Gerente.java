package conversionobjetos;

public class Gerente extends Empleado {
    private String departamento;
    
    Gerente(String nombre, double sueldo, String departamento){
        super(nombre,sueldo);
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle() + ", Departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}
