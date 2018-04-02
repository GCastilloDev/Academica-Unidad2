package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto006 {
    /*
    Se requiere determinar la hipotenusa de un triángulo rectángulo. 
    */
    
    public static void main(String[] args) {
        System.out.println("*** Programa que determina la hipotenusa de un"
                + " triángulo rectángul ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa el valor del cateto a: ");
        float catetoA = leer.nextFloat();
        System.out.print("Ingresa el valor del cateto b: ");
        float catetoB = leer.nextFloat();
        
        float catetoC = (float) Math.sqrt( Math.pow(catetoA, 2) - Math.pow(catetoB, 2) );
        
        System.out.println("El valor de la hipotenusa es: " + catetoC);
    }
}
