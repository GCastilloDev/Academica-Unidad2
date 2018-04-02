package ejemplos;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Ejemplo008 {
    /*
    Se requiere obtener la distancia entre dos puntos en el plano cartesiano.
    */
    
    public static void main(String[] args) {
        
        System.out.println("*** Obtener la distancia entre dos puntos del plano cartesiano ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresar el valor X del punto 1: ");
        float x1 = leer.nextFloat();
        System.out.print("Ingresar el valor Y del punto 1: ");
        float y1 = leer.nextFloat();
        System.out.print("Ingresar el valor X del punto 2: ");
        float x2 = leer.nextFloat();
        System.out.print("Ingresar el valor Y del punto 2: ");
        float y2 = leer.nextFloat();
        
        float x = (float) Math.pow(x2-x1,2);
        float y = (float) Math.pow(y2-y1,2);
        float distancia = (float) Math.sqrt(x + y);
        
        System.out.println("La distancia es: " + distancia);
    }
}
