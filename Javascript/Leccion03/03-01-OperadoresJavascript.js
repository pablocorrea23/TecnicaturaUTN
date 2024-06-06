//ejercicio para encontrar numeros pares e impares
let parInpar = 9;
if (parInpar % 2 == 0) {
    console.log("El numero es par");
} else {
    console.log("El numero es impar");
}

//ejercicio es mayor de edad
let edad = 10;
let adulto = 18;
if (edad >= adulto) {
    console.log("Es mayor de edad");
} else {
    console.log("Es menor de edad");
}

//ejerciico dentro de un rango
let dentroRango = 10;
let min = 0;
let max = 40;

if(dentroRango >= min && dentroRango <= max){
    console.log("Dentro del rango");
}
else{
    console.log("Fuera del rango");
}

descanso = true
vacaciones = false

if (descanso || vacaciones){
    console.log("El trabajador puede ir al juego de su hijo");

}else{
    console.log("El trabajador no puede ir al juego de su hijo");
}

//operador ternario
resultado = (3 > 2) ? "verdadero" : "falso";
console.log(resultado);

num = 6;
resultado2 = (num % 2 == 0) ? 'Es numero PAR' : 'Es numero IMPAR';
console.log(resultado2);

//convertir string a number
let miNumero = "10"; // esto es una cadena
console.log(typeof miNumero);

let edad2 = Number(miNumero); //esta es la funcion que va a hacer la conversion
console.log(edad2);


if(edad2 >= 18){
    console.log("Puede votar");
}else{
    console.log("No puede votar");
}

//haciendolo en ternario
votacion = (edad2 >= 18) ? 'Puede votar' : 'No puede votar';
console.log(votacion);

//funcion isNan
if(isNaN(edad2)){ //is not a number = no es un numero (devulve un boleano)
    console.log("No es un numero");
}else{
    console.log("Es un numero");
}


