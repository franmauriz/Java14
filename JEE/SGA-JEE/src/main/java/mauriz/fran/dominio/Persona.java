package mauriz.fran.dominio;

import java.io.Serializable;

public class Persona implements Serializable{
    private static final long serialVersionUID=1L;
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefeno;
    
    public Persona(){
        
    }

    public Persona(int idPersona, String nombre, String apellido, String email, String telefeno) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefeno = telefeno;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(String telefeno) {
        this.telefeno = telefeno;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefeno=" + telefeno + '}';
    }
    
    
    
}
