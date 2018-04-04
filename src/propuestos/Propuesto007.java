package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto007 {
    /*
    La compañía de autobuses “La curva loca” requiere determinar el costo que
    tendrá el boleto de un viaje sencillo, esto basado en los kilómetros por
    recorrer y en el costo por kilómetro. 
    */
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa que calcula el costo de un boleto de viaje"
                + " sencillo ***\n");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("¿Qué kilometraje recorrerá?: ");
        int km = n.nextInt();
        System.out.print("¿Cuál es el costo por km?: $");
        float costo = n.nextFloat();
        
        System.out.println("El costo del boleto es: $" + km*costo);
    }
}
