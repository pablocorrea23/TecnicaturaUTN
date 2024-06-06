package Leccion1;

import java.util.Scanner;

//import java.util.Scanner;

class HolaMundo {
    public static void main(String[] args) {
        // System.out.println("Hola Mundo");

        // int miVariable = 10;
        // System.out.println(miVariable);

        // miVariable = 5;
        // System.out.println(miVariable);

        // //Tipo string
        // String miVariableCadena = "Bienvenidos";
        // System.out.println(miVariableCadena);
        // miVariableCadena = "Sigamos creciendo en programación";
        // System.out.println(miVariableCadena);

        // Var - inferencia de tipos en java
        // var miVariable = 10;
        // var miVariableCadena = "Hola mundo";
        // System.out.println("miVariable = " + miVariable);
        // System.out.println("miVariableCadena = " + miVariableCadena);
        // soutv + tab

        // Reglas para definir una variable en Java

        // var usuario = "Pablo";
        // var titulo = "Programador";
        // var union = usuario + " " + titulo;
        // System.out.println("union = " + union);

        // var a = 8;
        // var b = 4;
        // System.out.println("a + b = " + (a + b));
        // System.out.println(usuario +(a + b));

        // ejercicios: caracteres especiales en Java
        // var nombre = "Natalia";
        // System.out.println("Nueva linea \n" + nombre); //diagonal inversa y letra n
        // System.out.println("Tabulador \t" + nombre); //tabulador
        // System.out.println("retroceso: \b" + nombre); //va un lugar hacia atras
        // System.out.println("Comillas simples: \'" + nombre+"\'"); //agregar comillas

        // clase Scanner
        // Scanner entrada = new Scanner(System.in);
        // System.out.println("Ingrese su nombre: ");
        // var usuario2 = entrada.nextLine();
        // System.out.println("usuario2 =" +usuario2);
        // System.out.println("Escriba el titulo: ");
        // var titulo2 = entrada.nextLine();
        // System.out.println("titulo2 = " + titulo2);
        // entrada.close();

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("proporsiona el titulo: ");
        // String titulo = scanner.nextLine();
        // System.out.println("proporsiona el autor: ");
        // String autor = scanner.nextLine();
        // System.out.println(titulo + " fue escrito por " + autor);
        // scanner.close();

        // byte numEnteroByte = (byte)127;
        // System.out.println("numeroEnteroByte = " + numEnteroByte);
        // System.out.println("Valor minimo del Byte: "+ Byte.MIN_VALUE);
        // System.out.println("Valor maximo del Byte: "+ Byte.MAX_VALUE);

        // short numEnteroShort = 32767;
        // System.out.println("numeroEnteroShort = " + numEnteroShort);
        // System.out.println("Valor minimo del Short: "+ Short.MIN_VALUE);
        // System.out.println("Valor maximo del Short: "+ Short.MAX_VALUE);

        // int numEnteroInt = 2147483647;
        // System.out.println("numeroEnteroShort = " + numEnteroInt);
        // System.out.println("Valor minimo del Short: "+ Integer.MIN_VALUE);
        // System.out.println("Valor maximo del Short: "+ Integer.MAX_VALUE);

        // long numEnteroLong = 9223372036854775807L;
        // System.out.println("numeroEnteroShort = " + numEnteroLong);
        // System.out.println("Valor minimo del Short: "+ Long.MIN_VALUE);
        // System.out.println("Valor maximo del Short: "+ Long.MAX_VALUE);

        // float numFloat = 3.4028235E38F;
        // System.out.println("numFloat = "+ numFloat);
        // System.out.println("El valor minimo de float: "+ Float.MIN_VALUE);
        // System.out.println("El valor maximo de float: "+ Float.MAX_VALUE);

        // double numDouble= 3.4028235E38F;
        // System.out.println("numFloat = "+ numDouble);
        // System.out.println("El valor minimo de Double: "+ Double.MIN_VALUE);
        // System.out.println("El valor maximo de Double: "+ Double.MAX_VALUE);

        // Inferencia de tipos var y tipos primitivos
    //     var numEntero = 20; //Las literales sin punto son automaticamente de tipo int
    //     System.out.println("numEntero = "+ numEntero);

    //     var numFloat = 10.0; //automaticamnte con el punto se transforma en tipo double
    //     System.out.println("numFloat = "+ numFloat);

    //     var numDouble = 10.0;
    //     System.out.println("numDouble = "+ numDouble);
    
    //tipos primitivos char
    // char miVariableChar = 'a';
    // System.out.println("miVariableChar = "+ miVariableChar);

    // char varCaracter = '\u0024'; //indicamos a Java la asignacion con el codigo unicode
    // System.out.println("varCaracter = " + varCaracter);
    // char varCaracterDecimal = 36; //valor decimal del juego de caracteres unicode
    // System.out.println("varCaracterDecimal = "+ varCaracterDecimal);
    // char varCaracterSimbolo = '$'; //un caracter especial, podemos copiar y pegar desde unicode
    // System.out.println("varCaracterSimbolo = "+ varCaracterSimbolo);

    
    // var varCaracter1 = '\u0024'; //indicamos a Java la asignacion con el codigo unicode
    // System.out.println("varCaracter1 = " + varCaracter1);
    // var varCaracterDecimal1 = (char)36; //valor decimal del juego de caracteres unicode
    // System.out.println("varCaracterDecimal1 = "+ varCaracterDecimal1);
    // var varCaracterSimbolo1 = '$'; //un caracter especial, podemos copiar y pegar desde unicode
    // System.out.println("varCaracterSimbolo1 = "+ varCaracterSimbolo1);

    // int varEnteroChar = '$';
    // System.out.println("varRnteroChar = " + varEnteroChar);
    // int caracterChar = 'b';
    // System.out.println("caracterChar = " + caracterChar);

    //Tipos de primitivos tipos boleanos
    // boolean varBool = false;
    // System.out.println("varBool = " + varBool);

    // if(varBool){
    //     System.out.println("La bandera es verdadera");
    // }else{
    //     System.out.println("La bandera es falsa");
    // }

    // var edad = 15;
    // //var adulto = edad >= 18;
    // if (edad >= 18){
    //     System.out.println("Es adulto");
    // }else{
    //     System.out.println("Es menor de edad");
    // }

    //coversion de tipos primitivos
    // var edad = Integer.parseInt("20");
    // System.out.println("edad = " + (edad + 1));

    // var valorPi = Double.parseDouble("3.1416");
    // System.out.println("valorPi = " + valorPi);

    // Pedir un valor
     var entrada = new Scanner(System.in);
    // System.out.println("digite su edad: ");
    // edad = Integer.parseInt(entrada.nextLine());
    // System.out.println("edad: " + edad);

    // entrada.close();

    //conversion de tipos primitivos en Java parte 2
    var edadTexto = String.valueOf(10);
    System.out.println("edadTexto = "+ edadTexto);

    var fraseChar = "programadores".charAt(4);
    System.out.println("fraseChar = "+ fraseChar);

    System.out.println("Digite un caracter: ");
    fraseChar = entrada.nextLine().charAt(0);
    System.out.println("fraseChar = "+ fraseChar);
    entrada.close();

    


}
}