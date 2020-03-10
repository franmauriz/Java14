
import java.util.Date;


public class EjemploHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Fran",4000);
        System.out.println(empleado1);
        empleado1.setEdad(18);
        empleado1.setGenero('H');
        empleado1.setDireccion("Calle falsa 2");
        System.out.println(empleado1);
        
        Cliente cliente1 = new Cliente(new Date(),true);
        cliente1.setNombre("Esther");
        System.out.println(cliente1);
    }
}
