//Hacer un ejercicio similar al que esta hecho, pero ahora con los
//meses del año, debes hacerlo con la estructura switch y luego con la
//funcion en la opcion mejorada

let mes = 1;

switch (mes) {
    case 1:
        console.log("Enero");
        break;
    case 2:
        console.log("Febrero");
        break;
    case 3:
        console.log("Marzo");
        break;
    case 4: 
        console.log("Abril");
        break;
    case 5:
        console.log("Mayo");
        break;
    case 6:
        console.log("Junio");
        break;
    case 7:
        console.log("Julio");
        break;
    case 8:
        console.log("Agosto");
        break;
    case 9:
        console.log("Septiembre");
        break;
    case 10:
        console.log("Octubre");
        break;
    case 11:
        console.log("Noviembre");
        break;
    case 12:
        console.log("Diciembre");
        break;
    default:
        console.log("No es un mes válido");
}

let mes2 = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];

function getMes(e){
    if (e < 1 || e > 12){
        throw new Error('Mes invalido - fuera de rango');
    }
    return mes2[e - 1];
}
console.log(getMes(10));