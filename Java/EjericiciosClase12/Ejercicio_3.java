package EjericiciosClase12;
import java.util.Scanner;

/*Ejercicio 3: La calificacion final de un estudiante de informática

import java.util.Scanner;
se calcula con base a las calificaciones de cuatro aspectos de su

rendimiento académico: participación, primer examen parcial, segundo

examen parcial y examen final. Sabiendo que las calificaciones anteriores

entran a la calificación final con ponderaciones de 10%, 25%, 25%

y 40%, Hacer un programa que calcule e imprima la calificación final

obtenida por un estudiante. 

Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,

la calificación final.


*/

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nota por participación: ");
        double participacion = scanner.nextDouble();

        System.out.println("Ingrese su nota de primer examen: ");
        double primerExamen = scanner.nextDouble();

        System.out.println("Ingrese la nota del segundo parcial: ");
        double segundoExamen = scanner.nextDouble();

        System.out.println("Ingrese la nota del examen final: ");
        double examenFinal = scanner.nextDouble();

        double calificacionFinal = (participacion * 0.1) + (primerExamen * 0.25) + (segundoExamen * 0.25) + (examenFinal * 0.4);

        System.out.println("Su calificacion final es: "+ calificacionFinal);

        scanner.close();
    }
    
}
