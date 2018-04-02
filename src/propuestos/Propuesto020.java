package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto020 {
    /*
    Determinar el promedio que obtendrá un alumno considerando que realiza tres
    exámenes, de los cuales el primero y el segundo tienen una ponderación de
    25%, mientras que el tercero de 50%. 
    */
    public static void main(String[] args) {
        System.out.println("*** Determinar el promedio con diferente ponderación por exámen ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("\nIngresa la calificación del primer exámen: ");
        float cal1 = leer.nextFloat()*0.25f;
        System.out.print("Ingresa la calificación del segundo exámen: ");
        float cal2 = leer.nextFloat()*0.25f;
        System.out.print("Ingrese la calificación del tercer exámen: ");
        float cal3 = leer.nextFloat()*0.50f;
        
        System.out.println("Tu calificación es: " + (cal1 + cal2 + cal3));
                
    }
}
