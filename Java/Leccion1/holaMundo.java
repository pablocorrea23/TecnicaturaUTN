package Leccion1;

//import java.util.Scanner;

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
    //var entrada = new Scanner(System.in);
    // System.out.println("digite su edad: ");
    // edad = Integer.parseInt(entrada.nextLine());
    // System.out.println("edad: " + edad);

    // entrada.close();

    //conversion de tipos primitivos en Java parte 2
    // var edadTexto = String.valueOf(10);
    // System.out.println("edadTexto = "+ edadTexto);

    // var fraseChar = "programadores".charAt(4);
    // System.out.println("fraseChar = "+ fraseChar);

    // System.out.println("Digite un caracter: ");
    // fraseChar = entrada.nextLine().charAt(0);
    // System.out.println("fraseChar = "+ fraseChar);
    // entrada.close();

    // int num1 = 10, num2 = 5;
    // var solucion = num1 + num2;
    // System.out.println("solucion suma: " + solucion);

    // solucion = num1 - num2;
    // System.out.println("solucion de la resta: " + solucion);

    // solucion = num1 * num2;
    // System.out.println("solucion de la multiplicacion: " + solucion);

    // solucion = num1 / num2;
    // System.out.println("solucion de la division: " + solucion);

    // var solucion2 = 3.4 / num2;
    // System.out.println("solucion2 = " + solucion2);

    // solucion = num1 % num2; //guarda el residuo entero de la division
    // System.out.println("solucion de la modulo: " + solucion);

    // if (num1 % 2 == 0){
    //     System.out.println("El numero es par");
    // }else{
    //     System.out.println("El numero es impar");
    // }


    // int varNum1 = 1, varNum2 = 4;
    // int varNum3 = varNum1 + 6 - varNum2;
    // System.out.println("varNum3 = " + varNum3);
    
    // varNum1 += 4; // varNum1 = varNum1 + 1;
    // System.out.println("varNum1 = " + varNum1);

    // varNum1 -= 2;
    // System.out.println("varNum1 = " + varNum1);

    // varNum1 *= 3;
    // System.out.println("varNum1 = " + varNum1);

    // varNum1 /= 4;
    // System.out.println("varNum1 = " + varNum1);

    // varNum1 %= 5;
    // System.out.println("varNum1 = " + varNum1);


    //operadores unarios

    // var varA = 7;
    // var varB = -varA;

    // System.out.println("varA =" + varA);
    // System.out.println("varB =" + varB);

    // //operador de negacion
    // var varC = true;
    // var varD = !varC;

    // System.out.println("varc = "+ varC);
    // System.out.println("varD = "+ varD);

    // //operadores unarios de incremento: preincremento
    // var varE = 9;
    // var varF = ++varE;
    // System.out.println("varE = "+ varE);
    // System.out.println("varF = "+ varF);

    // //postincremento
    // var varG = 9;
    // var varH = varG++;
    // System.out.println("varG = "+ varG);
    // System.out.println("varH = "+ varH);

    // //operadores unarios de decremento: predecremento
    // var varI = 9;
    // var varJ = --varI;
    // System.out.println("varI = "+ varI);
    // System.out.println("varJ = "+ varJ);

    // //postdecremento
    // var varK = 9;
    // var varL = varK--;
    // System.out.println("varK = "+ varK);
    // System.out.println("varL = "+ varL);

    // var aNum = 5;
    // var bNum = 10;
    // var cNum = (aNum == bNum);
    // System.out.println("cNum = " + cNum);

    // var dNum = aNum != bNum;
    // System.out.println("dNum = " + dNum);

    // var cadenaA = "Hola";
    // var cadenaB = "Hola";
    // var cadenaC = cadenaA == cadenaB;
    // System.out.println("cadenaC = " + cadenaC);

    // var fvar = cadenaA.equals(cadenaB);
    // System.out.println("fvar = " + fvar);

    // var gVar = aNum > bNum;
    // System.out.println("gVar = " + gVar);

    // var hVar = aNum < bNum;
    // System.out.println("hVar = " + hVar);

    // var edad = 30;
    // if (edad >= 18){
    //     System.out.println("Es mayor de edad");
    // }else{
    //     System.out.println("Es menor de edad");
    // }

    // var valorA = 10;
    // var valorMinimo = 0;
    // var valorMaximo = 10;
    // var respuesta = (valorA >= valorMinimo && valorA <= valorMaximo);

    // if(respuesta){
    //     System.out.println("Dentro del rango");
    // }else{
    //     System.out.println("Fuera del rango");
    // } //(valorA >= valorMinimo && valorA <= valorMaximo

    // var vacaciones = false;
    // var diaLibre = true;

    // if (vacaciones || diaLibre) {
    //     System.out.println("papa puede asistir al juego de su hijo");
    // }else{
    //     System.out.println("papa no puede asistir al juego de su hijo");
    // }

    //operador ternario

    // var edad = 4;
    // var resultado = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
    // System.out.println("resultado = " + resultado);

    // var numero = 8;
    // var resultado2 = (numero % 2 == 0) ? "Es par" : "Es impar";
    // System.out.println("resultado2 = " + resultado2);

    var x = 5;
    var y = 10;
    var z = ++x + y--;
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);

    var solucionAritmetica = 4 + 5 * 6 / 3;
    System.out.println("solucionAritmetica = " + solucionAritmetica);

    solucionAritmetica = (4 + 5) * 6 / 3;
    System.out.println("solucionAritmetica = " + solucionAritmetica);
}

}
