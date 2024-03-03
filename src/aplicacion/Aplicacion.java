package aplicacion;
import numeropi.Aproximacion;


public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("El número PI es " + Aproximacion.generarNumeroPiRecursivo(Integer.parseInt(args[0])));
    }
}
