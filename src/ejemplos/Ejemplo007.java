package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo007 {
    /*
    Un productor de leche lleva el registro de lo que produce en litros, pero
    cuando entrega le pagan en galones. Ayude al productor a saber cuánto
    recibirá por la entrega de su  producción de un día (1 galón = 3.785 litros). 
    */
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa que obtiene el total de $ por un día de producción ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de litros que vendiste hoy: ");
        float litros = leer.nextFloat();
        System.out.print("Ingrese el precio que le pagan por galón: $");
        float precioGalon = leer.nextFloat();
        
        float galones = litros / 3.785f;
        
        System.out.println("La ganancia del día de hoy es :$" + (precioGalon * galones));
    }
    
}
