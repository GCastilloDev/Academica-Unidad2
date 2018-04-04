package propuestos;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Propuesto007{
    /*
    La compañía de autobuses “La curva loca” requiere determinar el costo que
    tendrá el boleto de un viaje sencillo, esto basado en los kilómetros por
    recorrer y en el costo por kilómetro. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que determina el costo de un boleto de"
                + " viaje sencillo ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa los kilómetros por recorrer: ");
        int km = leer.nextInt();
        System.out.print("Ingresa el costo por kilómetro :$");
        float costo = leer.nextFloat();
        
        System.out.println("El costo del boleto es: $" + (km * costo));
    }   
}
