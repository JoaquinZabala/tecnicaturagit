
package test;

import Dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57000, false);
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 con su nombre modificado: "+persona1.getNombre());

        //Modificar a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; // Ya no se puede utilizar ya que esta privado
        //System.out.println("Nombre es: "+persona1.nombre);//Error
        System.out.println("el nombre para persona1 es: "+persona1.getNombre());
        System.out.println("el sueldo de persona1 es: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.getEliminado());
     //Tarea: Crear otro objeto tipo Persona, asignar valores de manera inicial
     //Y imprimir, luego modificar sus valores y volver a imprimir
        //System.out.println("persona1: "+persona1.toString());
        System.out.println("persona1 = " + persona1);//Llama automaticamente al tostring
    }
}
