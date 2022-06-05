
package Ejercicio_4;

import java.util.Scanner;


public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el alto del rectangulo: ");
        int alto = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el ancho del rectangulo: ");
        int ancho = Integer.parseInt(entrada.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho)* 2 ;
        System.out.println("Area = " + area);
        System.out.println("perimetro = " + perimetro);
        
       
        System.out.println("Digite un numero");
        int num1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite otro numero");
        int num2 = Integer.parseInt(entrada.nextLine());
        System.out.println("El numero mayor es: ");
        System.out.println(num1 > num2 ? num1 : num2);
        
    }
    
}
