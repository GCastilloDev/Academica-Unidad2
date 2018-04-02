package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto012 {
    /*
    Determinar cuánto pagará finalmente una persona por un artículo equis,
    considerando que tiene un descuento de 20%, y debe pagar 15% de IVA
    (debe mostrar el precio con descuento y el precio final). 
    */
    public static void main(String[] args) {
        System.out.println("*** Calcular IVA y descuento ***");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el costo del artículo: $");
        float articulo = leer.nextFloat();
        
        float descuento = articulo * 0.20f;
        float precioDes = articulo - descuento;
        float precioFinal = precioDes * 1.16f;
        
        System.out.println("El precio del artículo es: $" + articulo);
        System.out.println("El precio con el 20% de descuento es: $" + precioDes);
        System.out.println("El precio final con IVA y descuento es: $" + precioFinal);
    }
    
}
