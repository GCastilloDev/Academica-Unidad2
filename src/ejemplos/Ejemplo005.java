package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo005 {
    /*
    Obtener el área respectiva de un terreno de medidas de cualquier valor.
    */
    public static void main(String[] args) {
        
        System.out.println("**** Obtner área de un terreno de cualquier medida ****");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la base del triángulo/rectángulo: ");
        float base = leer.nextFloat();
        System.out.print("Ingrese la altura del triángulo/rectángulo juntos: ");
        float alturaTotal = leer.nextFloat();
        System.out.print("Ingresa la altura del rectángulo: ");
        float alturaRectangulo = leer.nextFloat();
        
        float areaT = (base * (alturaTotal - alturaRectangulo))/2;
        float areaR = base * alturaRectangulo;
        
        System.out.println("El área total es: " + (areaT + areaR));
    }
    
}
