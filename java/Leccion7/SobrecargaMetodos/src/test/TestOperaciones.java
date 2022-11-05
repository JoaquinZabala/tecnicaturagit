
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        
        var resultado = Operaciones.sumar(7, 9);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(7.5, 9);
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3 = Operaciones.sumar(9, 6L); //El tipo int no soporta el tipo long por lo que busca un metodo compatible como el metodo double
        System.out.println("resultado3 = " + resultado3);
    }
}
