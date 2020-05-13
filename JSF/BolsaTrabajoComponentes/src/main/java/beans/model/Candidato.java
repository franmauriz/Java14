package beans.model;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// CDI
@Named
@RequestScoped //alcance
public class Candidato {
    private String nombre;
    private String apellido;
    private int sueldo;
    private Date fechaNacimiento;
    private String codigopostal;
    private String municipio;
    private int provinciaid;
    private String comentario;
    
    Logger log= LogManager.getRootLogger();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        log.info("Modificando el nombre del candidato: " + this.nombre);
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        log.info("Modificamos el apellido: " + this.apellido);
    }

    public int getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
        log.info("Modificamos el sueldo: " + this.sueldo);
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public int getProvinciaid() {
        return provinciaid;
    }

    public void setProvincia(int provinciaid) {
        this.provinciaid = provinciaid;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
    
}
