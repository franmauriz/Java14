package ejemploinstanceof;

public class EjemploInstanceof {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Fran", 3000);
        Gerente gerente = new Gerente("Esther", 8000, "Farmacia");

        determinaTipo(empleado);
        System.out.println("");
        determinaTipo(gerente);
    }

    public static void determinaTipo(Empleado empleado) {
        if(empleado instanceof Gerente) {
            Gerente gerente = (Gerente) empleado;
            System.out.println(gerente.getDepartamento());
            //System.out.println(((Gerente) empleado).getDepartamento());
        }else if (empleado instanceof Empleado) {
            System.out.println(empleado.getNombre());
        }
        

    }
}
