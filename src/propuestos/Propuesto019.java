package propuestos;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Propuesto019 {
    /*
    Calcular el área de un cuadrado.
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el área de un cuadrado ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("\nIngrese el valor de un lado del cuadrado: ");
        float lado = leer.nextFloat();
        
        System.out.println("El área del cuadrado es: " + (Math.pow(lado, 2)));
    }
    
}
