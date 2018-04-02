package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto005 {
    /*
    Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos
    de pintura. Considere que se cobra por m2.
    */
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa que calcula cuanto se cobrará por un "
                + "trabajo de pintura ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa los m2 que se van a pintar: ");
        float metros = leer.nextFloat();
        System.out.print("Ingresa el costo por m2: $");
        float costo = leer.nextFloat();
        
        System.out.println("El costo de este trabajo es: $" + (metros * costo));
    }
    
}
