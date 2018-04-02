package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto002 {
    /*
     Una empresa importadora desea determinar cuántos dólares puede adquirir con
    equis cantidad de dinero mexicano. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que convierte de pesos a dólares ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad en pesos: ");
        float pesos = leer.nextFloat();
        System.out.print("Ingresa el costo del dólar: ");
        float costoDolar = leer.nextFloat();
        
        System.out.println("Usted puede adquirir " + (pesos / costoDolar) + " dólares");
    }
    
}
