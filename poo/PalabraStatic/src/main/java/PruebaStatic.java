
public class PruebaStatic {
    public static void main(String[] args) {
        Persona persona1 = new Persona("fran");
        Persona persona2 = new Persona("Esther");
        Persona persona3 = new Persona("Dani");
        Persona persona4 = new Persona("Roberto");
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        System.out.println(persona4.toString());
        System.out.println("");
        System.out.println("Total personas: " + Persona.getContadorPersona());
    }
}
