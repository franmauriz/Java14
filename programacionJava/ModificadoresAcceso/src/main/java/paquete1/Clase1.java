package paquete1;

public class Clase1 {
    /**
     * Definimos los atributos
     */
    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtegido = "Valor atributo Protegido";
    String atributoDefault = "Valor atributo Default";
    private String atributoPrivado="Valor atributo privado";
    
    public Clase1(){
        System.out.println("Contructor publico vacio");
    }
    
    public Clase1(String texto){
        System.out.println("Constructor publico con un argumento: " + texto);
    }
    
    protected Clase1(String texto,String texto2){
        System.out.println("Constructor protected con 2 argumentos: " + texto + "-" + texto2);
    }

    Clase1(String texto,String texto2,String texto3){
        System.out.println("Construtocr default");
    }
    
    private Clase1(String texto,String texto2,String texto3, String texto4){
        System.out.println("Constructor privado");
    }
    
    
    public String metodoPublico(){
        return "Metodo publico";
    }
    
    protected String metodoProtegido(){
        return "Metodo protegido";
    }
    
    String metodoDefault(){
        return "metodo default";
    }
    
    private String metodoPrivado(){
        return "metodo privado";
    }
    
}
