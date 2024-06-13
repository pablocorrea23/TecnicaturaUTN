//Ejercicio 1: calcular la estacion del año

//let mes = input("Ingresa el mes del año: ");
mes = "febrero";
// let estacion;
// switch (mes) {
//     case "enero":
//     case "febrero":
//     case "marzo":
//         estacion = "Verano";
//         break;
//     case "abril":
//     case "mayo":
//     case "junio":
//         estacion = "Otoño";
//         break;
//     case "julio":
//     case "agosto":
//     case "septiembre":
//         estacion = "Invierno";
//         break;
//     case "octubre":
//     case "noviembre":
//     case "diciembre":
//         estacion = "Primavera";
//         break;
//     default:
//         estacion = "No es un mes válido";
// }

//Usando if
let estacion;
if (mes == 'enero' || mes == 'febrero' || mes == 'marzo') {
    estacion = 'Verano';
} else if (mes == 'abril' || mes == 'mayo' || mes == 'junio') {
    estacion = 'Otoño';
} else if (mes == 'julio' || mes == 'agosto' || mes == 'septiembre') {
    estacion = 'invierno';
} else if (mes == 'octubre' || mes == 'noviembre' || mes == 'diciembre') {
    estacion = 'primavera';
} else {
    estacion = 'No es un mes válido';
}

console.log("La estación del año es: " + estacion);