package EjericiciosClase12;
import java.util.Scanner;
/*

import java.util.Scanner;
Ejercicio 1: Construir un programa que, dado un número total de

horas, devuelve el número de semanas, días y horas equivalentes.

Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,

6 días y 16 horas.


 */

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas a calcular: ");
        int horasTotales = scanner.nextInt(); // Ejemplo de 1000 horas

        int semanas = horasTotales / (24 * 7);

        int dias = (horasTotales % (24 * 7)) / 24;

        int horas = horasTotales % 24;

        System.out.println("Semanas: " + semanas);

        System.out.println("Días: " + dias);

        System.out.println("Horas: " + horas);

        scanner.close();

    }
    
}