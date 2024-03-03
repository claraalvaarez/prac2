package numeropi;

import java.util.Random;

public class Aproximacion {
    
    // Función recursiva para aproximar pi utilizando Monte Carlo
    public static double generarNumeroPiRecursivo(long pasos) {
        return generarNumeroPiRecursivoHelper(pasos, 0, 0);
    }

    // Función auxiliar recursiva para aproximar pi utilizando Monte Carlo
    private static double generarNumeroPiRecursivoHelper(long pasos, long dentroCirculo, long total) {
        if (pasos == 0) {
            return 4.0 * dentroCirculo / total; // Aproximación de pi usando la fórmula de Monte Carlo
        }

        // Generar un punto aleatorio dentro del cuadrado unitario
        Random rand = new Random();
        double x = rand.nextDouble();
        double y = rand.nextDouble();

        // Verificar si el punto está dentro del círculo unitario
        if (x * x + y * y <= 1) {
            dentroCirculo++;
        }
        total++;

        // Llamada recursiva para el siguiente punto
        return generarNumeroPiRecursivoHelper(pasos - 1, dentroCirculo, total);
    }
}
