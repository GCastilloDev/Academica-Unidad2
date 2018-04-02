package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo010 {
    /*
    Una modista, para realizar sus prendas de vestir, encarga las telas al
    extranjero. Para cada pedido, tiene que proporcionar las medidas de la tela
    en pulgadas, pero ella generalmente las tiene en metros. Determine cuántas
    pulgadas debe pedir con base en los metros que requiere(1 pulgada = 0.0254 m). 
    */
    
    public static void main(String[] args) {
        
        System.out.println("*** Programa que convierte de metros a pulgadas ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de tela en metros: ");
        float metros = leer.nextFloat();
        
        System.out.println("La cantidad que debes de pedir es: " + (metros / 0.0254) + " pulgadas");
    }
}
