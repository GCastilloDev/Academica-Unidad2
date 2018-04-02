package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto001 {
    /*
    Calcular el área de un triángulo.
    */
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa que calcula el área de un triángulo ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la base del triángulo: ");
        float base = leer.nextFloat();
        System.out.print("Ingrese la altura del triángulo: ");
        float altura = leer.nextFloat();
        
        float areaT = ( base * altura) / 2;
        
        System.out.println("El área del triángulo es: "+areaT);
    }
}
