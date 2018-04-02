package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto014 {
    /*
    Una empresa desea determinar el monto de un cheque que debe proporcionar a
    uno de sus empleados que tendrá que ir por equis número de días a la ciudad
    de Monterrey; los gastos que cubre la empresa son: hotel, comida y 100.00
    pesos diarios para otros gastos. El monto debe estar desglosado para cada
    concepto. 
    */
    public static void main(String[] args) {
        System.out.println("*** Calcular viáticos ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese los días del viaje: ");
        int dias = leer.nextInt();
        System.out.print("Ingrese el costo del hotel: $");
        float hotel = leer.nextFloat();
        System.out.print("Ingrese el costo de la comida: $");
        float comida = leer.nextFloat();
        
        System.out.println("Monto para hotel: $" + (hotel * dias));
        System.out.println("Monto para comida: $" + (comida * dias));
        System.out.println("Monto para otros gastos: $" + (dias * 100));
        System.out.println("El monto total es: $" + (float) ((hotel + comida + 100) * dias));
    }
}
