package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto021 {
    /*
    Determinar aproximadamente cuántos meses, semanas, días y horas ha vivido
    una persona. 
    */
    public static void main(String[] args) {
        System.out.println("*** Determinar cuantos meses, semanas, días y horas"
                + "a vivido una persona ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = n.nextInt();
        int meses = edad * 12;
        int semanas = meses * 4;
        int dias = edad * 365;
        int horas = dias * 24;
        
        System.out.println("\nUsted a vivido: ");
        System.out.println(meses + " meses");
        System.out.println(semanas + " semanas");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");
    }
    
}
