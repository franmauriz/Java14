package sobreescibirmetodo;

public class EjemploSobreEscritura {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Fran",3000);
        Gerente gerente = new Gerente("Esther",8000,"Farmacia");
        
        System.out.println(empleado.obtenerDetalle());
        System.out.println("");
        System.out.println(gerente.obtenerDetalle());
    }

}
