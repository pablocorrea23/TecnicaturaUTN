package actividadClase9;

import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primer calificación: ");
        double calificacion1 = scanner.nextDouble();

        System.out.println("Introduce la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();

        System.out.println("Introduce la tercer calificacion: ");
        double calificacion3 = scanner.nextDouble();

        double suma = calificacion1 + calificacion2 + calificacion3;

        System.out.println("La suma de las tres calificaciones es: " + suma);

        scanner.close();
    }
}
