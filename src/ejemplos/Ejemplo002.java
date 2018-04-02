package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Ejemplo002 {

    /*
    Un estudiante realiza cuatro exámenes durante el semestre, los cuales tienen
    la misma ponderación. Obtener el promedio de las calificaciones obtenidas. 
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("********** Programa que obtiene el promedio de 4 exámenes **********");
        
        System.out.print("Ingrese la calificación del exámen 1: ");
        float c1 = leer.nextFloat();
        System.out.print("Ingrese la calificación del exámen 2: ");
        float c2 = leer.nextFloat();
        System.out.print("Ingrese la calificación del exámen 3: ");
        float c3 = leer.nextFloat();
        System.out.print("Ingrese la calificación del exámen 4: ");
        float c4 = leer.nextFloat();
        
        System.out.println("El promedio obtenido es: " + ((c1+c2+c3+c4)/4));
    }
}
