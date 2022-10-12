//Tipos de datos en JavaScript
/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
*/

var nombre = "Joaquín"; //Tipo Str
console.log(nombre);

var numero = 12392932; 
console.log(numero);

var objeto = {
    Nombre: "Joaquín", 
    Apellido: "Zabala",
    Telefono: "2625609005",
    Correo: "joaquinzabala@gmail.com"
}

console.log(objeto);

//Tipo de dato calse
class Persona{
    constructor(Nombre,Apellido){
    this.Nombre = Nombre;
    this.Npellido = Apellido;
    }
}
console.log(typeof Persona);

//Tipo de dato undefined
var x;
console.log(x);

x = undefined;
console.log(typeof x);

//null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de un object
console.log(typeof y);

//Tipo de dato array y Empty String
var autos = ["Citroen", "Audi", "BMW", "Ford", "Ferrari"];
console.log(autos);
console.log(typeof autos); //Preguntamos que tipo de dato es:

var z = "";
console.log(z); // Esto se refiere a que es una cadena vacia:
console.log(typeof z);