package propuestos;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Propuesto011 {
    /*
    La compañía de luz y sombras (CLS) requiere determinar el pago que debe
    realizar una persona por el consumo de energía eléctrica, la cual se mide en
    kilowatts (KW).
    */
    public static void main(String[] args) {
        System.out.println("*** Calcular el pago de luz ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese los kilowatts(KW) consumidos: ");
        float consumo = leer.nextFloat();
        System.out.print("Ingrese el costo del kilowatt(KW): $");
        float costo = leer.nextFloat();
        
        System.out.println("El pago por el consumo de luz es: $" + (consumo * costo));
    }
}
