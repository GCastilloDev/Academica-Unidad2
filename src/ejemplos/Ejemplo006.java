package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo006 {
    /*
    Para resolver este problema se puede partir de que está formada por tres
    figuras: dos triángulos rectángulos, con H como hipotenusa y R como uno de
    los catetos, que también es el radio de la otra figura, una semicircunferencia
    que forma la parte circular
    */
    
    public static void main(String[] args) {
        
        System.out.println("**** Obtner área de una figura tipo helado ****");
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la base del triángulo rectángulo: ");
        float radio = leer.nextFloat();
        System.out.print("Ingrese la hipotenusa del triángulo: ");
        float hipotenusa = leer.nextFloat();
        
        float cateto = (float) Math.sqrt( (Math.pow(hipotenusa, 2)) - (Math.pow(radio,2)) );
        float areaTriangulo = (2 * (radio * cateto)) / 2;
        float areaCirculo = (float) (Math.PI * radio * radio) / 2;
                        
        System.out.println("El área total de la figura es: " + (areaTriangulo + areaCirculo));
        
    }
}
