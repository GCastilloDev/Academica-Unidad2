package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo003 {
    /*
    Se requiere conocer el área de un rectángulo.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("********** Programa que obtiene el área de un rectángulo **********");
        
        System.out.print("Ingrese la base del rectángulo: ");
        float base = leer.nextFloat();
        System.out.print("Ingrese la altura del rectángulo: ");
        float altura = leer.nextFloat();
        
        System.out.println("El área del rectángulo es: " + (base*altura));
    }
}
