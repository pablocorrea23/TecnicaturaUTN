package actividadClase9;

import java.util.Scanner;

public class Ejercicio7 {
    private static final double SALARIO_BASE = 1000.0;
    private static final double COMISION_POR_CARRO = 150.0;
    private static final double PORCENTAJE_VENTA = 0.05;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de carros vendidos: ");
        int cantidadCarrosVendidos = scanner.nextInt();

        System.out.println("Ingrese el valor total de ventas de los carros: ");
        double valorTotalVentas = scanner.nextDouble();

        double comisionCarros = cantidadCarrosVendidos * COMISION_POR_CARRO;
        double comisionVentas = valorTotalVentas * PORCENTAJE_VENTA;
        double salarioTotal = SALARIO_BASE + comisionCarros + comisionVentas;

        System.out.println("El salario mensual del vendedor es: $" + salarioTotal);

        scanner.close();
    }
}
