package ejerciciosClase11;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el monto de la compra >>> : ");
        double monto = scanner.nextDouble();

        if (monto >= 100) {
            double descuento = monto * 0.2;
            double total = monto - descuento;
            System.out.println("El total a pagar con descuento es: " + total);
        } else {
            System.out.println("No se aplica descuento, el total a pagar es: " + monto);
        }

        scanner.close();
    }
}
