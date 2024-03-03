package aplicacion;
import numeropi.Aproximacion;
/**
 * La clase {@code Aplicacion} proporciona un programa principal para calcular una aproximación del número Pi
 * utilizando el método de Monte Carlo de forma recursiva.
 */
public class Aplicacion {
    /**
     * El método principal para ejecutar el programa.
     *
     * @param args los argumentos de la línea de comandos. Se espera que el primer argumento sea el número de pasos.
     */
    public static void main(String[] args) {
        // Imprimir el resultado de la aproximación de Pi
        System.out.println("El número PI es " + Aproximacion.generarNumeroPiRecursivo(Integer.parseInt(args[0])));
    }
}
