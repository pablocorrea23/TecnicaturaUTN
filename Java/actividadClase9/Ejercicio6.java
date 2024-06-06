package actividadClase9;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dólares que tiene Guillermo: ");
        double guillermo = scanner.nextDouble();

        double luis = guillermo / 2;

        double juan = (guillermo + luis) / 2;

        double total = guillermo + luis + juan;

        System.out.printf("La cantidad de dinero que tienen entre los tres es: ", total);


        scanner.close();
    }
}