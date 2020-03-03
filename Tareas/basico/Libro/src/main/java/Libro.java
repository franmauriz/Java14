
import java.util.Scanner;

public class Libro {

    public static void main(String[] args) {
        var titulo = "";
        var autor = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Proporciona el titulo: ");
        titulo = scanner.nextLine();
        System.out.println("");
        System.out.print("Proporciona el autor: ");
        autor = scanner.nextLine();
        System.out.println("");
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
