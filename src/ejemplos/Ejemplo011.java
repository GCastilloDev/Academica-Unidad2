package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo011 {
    /*
    La conagua requiere determinar el pago que debe realizar una persona por el
    total de metros cúbicos que consume de agua al llenar una alberca 
    */
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa que determina cuanto se pagara por el consumo de agua de una alberca ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa la altura de la alberca: ");
        float altura = leer.nextFloat();
        System.out.print("Ingresa el largo de la alberca: ");
        float largo = leer.nextFloat();
        System.out.print("Ingresa el ancho de la alberca: ");
        float ancho = leer.nextFloat();
        System.out.print("Ingresa el costo del metro cúbico: $");
        float costo = leer.nextFloat();
        
        float volumen = altura * largo * ancho;
        
        System.out.println("Se pagará: $" + (costo * volumen));
    }
    
}
