package propuestos;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Propuesto010 {
    /*
    La CONAGUA requiere determinar el pago que debe  realizar una persona por
    el total de metros cúbicos que consume de agua. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Calcular el pago de agua ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese los metros cúbicos que consumío: ");
        float consumo = leer.nextFloat();
        System.out.print("Ingrese el costo del metro cúbico: $");
        float costo = leer.nextFloat();
        
        System.out.println("El pago por el consumo es: $" + (consumo * costo));
    }
}
