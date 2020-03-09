
public class PruebaGetSet {

    public static void main(String[] args) {
        
        Persona persona = new Persona("Fran", 3000, false);

        System.out.println("Datos originales:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Sueldo: " + persona.getSueldo());
        System.out.println("Borrado: " + persona.isBorrado());
        System.out.println("");
        System.out.println("Datos modificados:");
        persona.setNombre("Felipe");
        persona.setBorrado(true);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Sueldo: " + persona.getSueldo());
        System.out.println("Borrado: " + persona.isBorrado());
        System.out.println("");
        System.out.println("Optimizado al escribir los datos:");
        System.out.println(persona.toString());
    }
}
