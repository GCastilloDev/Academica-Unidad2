package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto023 {
    /*
    El hotel “Cama Arena” requiere determinar lo que le debe cobrar a un huésped
    por su estancia en una de sus habitaciones.
    */
    public static void main(String[] args) {
        System.out.println("*** Costo de estancia Hotel \"Cama Arena\" ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingrese los días hospedados: ");
        int dias = n.nextInt();
        System.out.print("Ingrese el costo de la habitación por día: ");
        float costo = n.nextFloat() * dias;
        
        System.out.println("El costo de tu estancia es: $" + costo);
    }
}
