// Ejercicio2: Leer un numero e indicar si es positivo o negativo.
//el proceso se repetira hasta que se introduzca un cero 0.
//Hacer este ejercicio con la clase scanner y luego hacerlo con Option.pane


package EjerciciosCiclos02;

import javax.swing.JOptionPane;

public class Ciclos02 {
    public static void main(String[] args) {
        
        
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero != 0) {
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero: "));
            
        }
        JOptionPane.showMessageDialog(null, "El numero " + numero + " finaliza el programa");

       
    }
}
