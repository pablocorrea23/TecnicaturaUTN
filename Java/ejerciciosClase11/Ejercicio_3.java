package ejerciciosClase11;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            int resultado = num1 * num2;
            System.out.println("Los números son iguales, el resultado de la multiplicación es: " + resultado);
        }else if(num1 > num2){
            int resultado = num1 - num2;
            System.out.println("El primero es mayor que el segundo, la resta es: " + resultado);
        }else{
            int resultado = num1 + num2;
            System.out.println("La suma es: " + resultado);
        }
        scanner.close();
    }
}
