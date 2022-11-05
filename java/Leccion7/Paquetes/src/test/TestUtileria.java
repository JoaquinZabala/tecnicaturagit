
package test;

import ar.com.codesystem.paquete.Utileria; //Primera sintaxis
//import static ar.com.codesystem.paquete.Utileria.imprimir; //Solo aplica para metodos estaticos, Segunda sintaxis

public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("Saludos a todos los alumnos de la tecnicatura"); //Primera sintaxis
        //imprimir("Terminamos en unos minutos"); //Segunda sintaxis
        ar.com.codesystem.paquete.Utileria.imprimir("Ahora si estamos terminando"); //Ultima sintaxis
        
    }
}
