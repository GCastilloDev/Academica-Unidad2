package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto022 {
    /*
    Determinar el costo que tendrá realizar una llamada telefónica con base en
    el tiempo que dura la llamada y en el costo por minuto. 
    */
    public static void main(String[] args) {
        System.out.println("*** Costo de una llamada ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresa el tiempo de la llamada: ");
        float tiempo = n.nextFloat();
        System.out.print("Ingresa el costo por minuto: $");
        float costo = n.nextFloat() * tiempo;
        
        System.out.println("El costo de tu llamada es de: $" + costo);
    }
    
}
