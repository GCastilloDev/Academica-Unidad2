package propuestos;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Propuesto008 {
    /*
    Se requiere determinar el tiempo que tarda una persona en llegar de una 
    ciudad a otra en bicicleta, considerando que lleva una velocidad constante. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que determina el tiempo que tarda en llegar"
                + "una persona a otra ciudad en bicicleta ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa los kilómetros por recorrer: ");
        int km = leer.nextInt();
        System.out.print("Ingresa la velocidad expresada en km/hr: ");
        float velocidad = leer.nextFloat();
        float tiempo = km / velocidad;
        
        System.out.println("El tiempo que tardará en llegar es: " + tiempo);
    }   
}
