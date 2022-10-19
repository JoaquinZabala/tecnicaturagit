var nombre = "Joaquin ";
var apellido = "Zabala";
var nombreCompleto = nombre+" "+apellido; // Primera concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = "Ariel"+" "+"Betancud"; //Segunda concatencacion
console.log(nombreCompleto2);
var juntos = nombre +219; //Lee de izq a der siguiendo la cadena lee el numero str
console.log(juntos);
juntos = nombre + 78 + 17; //Aqui se puede diferenciar a traves de los parentesis
console.log(juntos);
juntos = 78+ 17+nombre;
console.log(juntos);

nombre += apellido;
console.log(nombre);