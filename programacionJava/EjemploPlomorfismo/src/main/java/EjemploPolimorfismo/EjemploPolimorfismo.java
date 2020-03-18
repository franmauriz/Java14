package EjemploPolimorfismo;

public class EjemploPolimorfismo {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Fran",3000);
        Gerente gerente = new Gerente("Esther",8000,"Farmacia");
        
        imprimir(empleado);
        System.out.println("");
        imprimir(gerente);
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println(empleado.obtenerDetalle());
    }

}
