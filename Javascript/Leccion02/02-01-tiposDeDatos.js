// Tipos de datos en Javascript

// La sintaxis en lo que es comentarios es muy similar
// a la de Java, realmente diriamos que es identica

var nombre = 'Pablo'; //Tipo string
console.log(typeof nombre);

var nombre = 10; //Tipo number
console.log(typeof nombre);

var nombre = 12.3;
console.log(typeof nombre);

let numero = 12;
console.log(numero);

var objeto = {
    nombre: 'Pablo',
    apellido: 'Correa',
    telefono: '123456789'
};

console.log(objeto);

//tipo de dato boolean

var bandera = true;
console.log(typeof bandera);

//tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//tipo de dato symbol
var simbolo = Symbol('Mi simbolo');
console.log(typeof simbolo);

//tipo de dato clase
class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);

//Tipo de dato undefined
var x;
console.log(typeof x);

//null: significa ausencia de valor
var x = null; //null no es un tipo de dato, pero su origen es object
console.log(typeof x);

//tipo de dato array y empty string
var autos = ['citrien', 'chevrolet', 'ford'];
console.log(typeof autos); //un arreglo es de tipo object

var z = '';  //esto se refiere a que es una cadena vacia ('Empty string')
console.log(typeof z);
