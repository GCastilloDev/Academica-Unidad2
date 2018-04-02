package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo001 {
    
    /*
    Obtener la suma de dos números cualesquiera
    */
    
    public static void main (String [] args){
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("********** Programa que obtiene la suma de dos números **********");
        
        System.out.print("Ingrese el primer número: ");
        int n1 = leer.nextInt();        
        System.out.print("Ingrese el segundo número: ");
        int n2 = leer.nextInt();
        
        System.out.println("El resultado es: " + (n1+n2));
    }
}
