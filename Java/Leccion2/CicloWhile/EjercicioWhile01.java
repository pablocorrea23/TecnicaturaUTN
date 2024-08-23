package Leccion2.CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0; //inferencia de tipos
        while(conteo < 3){
            System.out.println("conteo = " + conteo);
            conteo++; //vamos aumnetando en 1 la variable 
        }

        var contador = 0;

        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 3);


        for(var i = 0; i < 8; i++){
            if(i % 2 == 0){
            System.out.println("i = " + i);
            //break; corta la ejecucion en la primer vuelta
            }
        }
    }
}
