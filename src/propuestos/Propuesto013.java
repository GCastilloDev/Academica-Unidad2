package propuestos;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Propuesto013 {

    /*
    Determinar cuánto dinero ahorra una persona en un año si considera que cada
    semana ahorra 15% de su sueldo (considere cuatro semanas por mes y que no
    cambia el sueldo).
     */
    public static void main(String[] args) {
        System.out.println("*** Calcula el ahorro anual ***");

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa tu sueldo semanal: $");
        float sueldo = leer.nextFloat();

        float ahorroSemanal = sueldo * 0.15f;
        float ahorroAnual = ahorroSemanal * 48;

        System.out.println("Su ahorro anual es de: $" + ahorroAnual);
    }

}
