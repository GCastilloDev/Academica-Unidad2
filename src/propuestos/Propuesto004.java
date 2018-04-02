package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto004 {
    /*
    Un estacionamiento requiere determinar el cobro que debe aplicar a las
    personas que lo utilizan. Considere que el cobro es con base en las horas
    que lo disponen y que las fracciones de hora se toman como completas.
    */
    
    public static void main(String[] args) {
        System.out.println("*** Calula el pago de las horas del estacionamiento ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa las horas estacionadas: ");
        float horas = leer.nextFloat();
        System.out.print("Ingrese el costo por hora: $");
        float costoH = leer.nextFloat();
        
        System.out.println("El costo a pagar es: $" + (costoH * Math.ceil(horas)));       
    }
}
