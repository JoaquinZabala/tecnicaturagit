
package Ejercicio_6;

import java.util.Scanner;


public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     float guillermo,luis,juan,total;
        System.out.println("Digite la cantidad de dinero de Guillermo: ");
        guillermo = Float.parseFloat(entrada.nextLine());
        luis = guillermo/2;
        System.out.println("El dinero de Luis es: US$"+luis);
        juan = (luis + guillermo)/2;
        System.out.println("El dinero de Juan es: US$"+juan);
        total = juan + luis + guillermo;
        System.out.println("El dinero total es de: US$"+total);
        
    }
    
}
