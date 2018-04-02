package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo004 {
    /*
    Se requiere obtener el área de una circunferencia.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("***** Programa que obtiene el área de una circunferencia *****");
        
        System.out.print("Ingrese el radio de la circunferencia: ");
        float radio = leer.nextFloat();
        float PI = 3.1416f;  
        
        System.out.println("El área de la circunferencia es: " + (PI * radio * radio));
                
    }
    
}
