
package test;

import Dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57000, false);
        System.out.println("persona1 con su nombre modificado: "+persona1.getNombre());

        //Modificar a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; // Ya no se puede utilizar ya que esta privado
        //System.out.println("Nombre es: "+persona1.nombre);//Error
        System.out.println("el nombre para persona1 es: "+persona1.getNombre());
        System.out.println("el sueldo de persona1 es: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.getEliminado());
        
    }
}
