
/**
 *
 * @author Rafael ING
 */
import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el numero de la tabla");
        int tabla = leer.nextInt();

        int contador = 0;

        while (contador <= 10) {
            System.out.printf(" %d x %d = %d \n", tabla, contador, (tabla * contador));
            contador++;
        }

    }
}
