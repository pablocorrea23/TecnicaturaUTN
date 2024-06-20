package ejerciciosClase10;

import java.util.Scanner;

public class Ejercicio_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primer calificación: ");
        double calificacion1 = scanner.nextDouble();

        System.out.println("Introduce la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();

        System.out.println("Introducce la tercer calificacion: ");
        double calificacion3 = scanner.nextDouble();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        if (promedio >= 7) {
            System.out.println("EL alumno esta aprobado con: " + promedio);
        }
        else {
            System.out.println("El alumno esta reprobado con: " + promedio);
        }

        scanner.close();
    }
}