/*
Ejercicio 6: Pedir numeros hasta que se teclee un 0,
 mostrar la suma de todos los numeros introducidos
*/
package Leccion3;

import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0){
            System.out.println("El numero ingresado es "+numero+"");
            conteo++;
            
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("A ingresado "+conteo+" numeros");
    }
}
