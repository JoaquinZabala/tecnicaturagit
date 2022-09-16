package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona(); //Llamamos al constructor
        Persona persona2 = new Persona(); //Llamamos al constructor

        persona1.nombre = "Joaquín";
        persona1.apellido = "Zabala";
        
        persona2.nombre = "Ariel";
        persona2.apellido = "Betancud";

        persona1.obtenerInformacion();
        persona2.obtenerInformacion();
    }
}
