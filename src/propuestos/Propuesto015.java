package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto015 {
    /*
    Se desea calcular la potencia eléctrica de circuito.
    */
    public static void main(String[] args) {
        System.out.println("*** Calcular potencia eléctrica ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la tensión en Voltios: ");
        float tension = leer.nextFloat();
        System.out.print("Ingrese la intensidad en Amperios: ");
        float intensidad = leer.nextFloat();
        
        System.out.println("La potencia eléctrica es: " + (tension * intensidad) + "w");
    }
}
