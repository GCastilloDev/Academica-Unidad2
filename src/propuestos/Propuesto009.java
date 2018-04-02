package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto009 {
    /*
    Se requiere determinar el costo que tendrá realizar una llamada telefónica
    con base en el tiempo que dura la llamada y en el costo por minuto.
    */
    
    public static void main(String[] args) {
        System.out.println("*** Calcular el costo de una llamada ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el tiempo de la llamada: ");
        float tiempo = leer.nextFloat();
        System.out.print("Ingrese el costo por minuto: ");
        float costo = leer.nextFloat();
        
        System.out.println("El costo de la llamada es: $" + (tiempo * costo));
    }
    
}
