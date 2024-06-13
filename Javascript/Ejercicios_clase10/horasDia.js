//Ejercicio 2- Horas del dia

// mañana - medioDia - siesta - tarde - noche

hora = 'mañana';

//switch
let actividad;

// switch (hora){
//     case 'mañana':
//         actividad = 'desayuno - estudio';
//         break;
//     case 'medioDia':
//         actividad = 'almuerzo';
//         break;
//     case 'siesta':
//         actividad = 'estudio';
//         break;
//     case 'tarde':
//         actividad = 'cursado Tecnicatura Programación';
//         break;
//     case 'noche':
//         actividad = 'cena - dormir';
//         break;
//     default:
//         actividad = 'Ingrese una hora válida';
// }

//if

if (hora == 'mañana') {
    actividad = 'desayuno - estudio';
} else if (hora == 'medioDia') {
    actividad = 'almuerzo';
} else if (hora == 'siesta') {
    actividad = 'estudio';
} else if (hora == 'tarde') {
    actividad = 'cursado Tecnicatura Programación';
} else if (hora == 'noche') {
    actividad = 'cena - dormir';
} else actividad = 'Ingrese una hora valida lpm';

console.log(`La actividad para la hora seleccionada es: ${actividad}`);
