/*
Ejercicio 3: Leer numeros hasta que se instroduzca un cero
Para cada uno indicar si es par o impar.
Primero lo haremos con la clase Scanner
Luego con la clase JOptionPane
*/
package ejerciciociclo06;

import java.util.Scanner;

public class EjercicioCiclo06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero,suma = 0;
        
        do{
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma+= numero;
            
        }while (numero != 0);
        
        System.out.println("La suma de todos los numeros ingresados es: "+suma);
    }
}
