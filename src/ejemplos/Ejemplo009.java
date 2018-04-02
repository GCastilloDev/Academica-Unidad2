package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo009 {
    /*
    Se requiere determinar el sueldo semanal de un trabajador con base en las
    horas que trabaja y el pago por hora que recibe.
    */
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa que calcula el sueldo semanal ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa las horas trabajadas esta semana: ");
        float horas = leer.nextFloat();
        System.out.print("Ingresa el pago por hora de trabajo: $");
        float pago = leer.nextFloat();
        
        System.out.println("El sueldo semanal es: $" + (horas * pago));
    }
}
