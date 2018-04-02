package propuestos;
import java.util.Scanner;
import java.util.Calendar;
/**
 *
 * @author Gustavo
 */
public class Propuesto003 {
    /*
     Una empresa que contrata personal requiere determinar la edad de las
    personas que solicitan trabajo, pero cuando se les realiza la entrevista
    sólo se les pregunta el año en que nacieron. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Calcular la edad ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa tu año de nacimiento: ");
        int anioN = leer.nextInt();
        
        Calendar fecha = Calendar.getInstance();
        
        System.out.println("La edad es: " + (fecha.getWeekYear() - anioN));
    }
    
}
