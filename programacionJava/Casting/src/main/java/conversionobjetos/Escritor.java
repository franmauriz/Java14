package conversionobjetos;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre,sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle() + ", Tipo Escritura: " + this.tipoEscritura.getDescripcion();
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    
    public String getTipoEscrituraEnTexto(){
        return this.tipoEscritura.getDescripcion();
    }
}
