package EjericiciosClase12;
import java.util.Scanner;
/*

import java.util.Scanner;
Ejercicio 2: Hacer un programa que calcule el cuadrado de una suma,

el usuario debe ingresar el valor de a y el valor de b.

Formula: (a+b)2=a2+b2+2*a*b

Para esto deberán utilizar la clase Math y un método llamado pow

 */

public class Ejercicio_2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        int a = scanner.nextInt();
        
        System.out.println("Ingrese el valor de b: ");
        int b = scanner.nextInt(); 

        int cuadradoSuma = (int) (Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b);

        System.out.println("El cuadrado de la suma de " + a + " y " + b + " es: " + cuadradoSuma);

        scanner.close();
    }

}
