/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo
, y mocstrar cuantos numeros se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionPane
*/
package Leccion3;
import javax.swing.JOptionPane;
public class Ejercicio04 {
    public static void main(String[] args) {
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: ")), conteo = 0;
        while (numero >= 0){
            JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es positivo");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null,"A ingresado "+conteo+" numeros que no son negativos");
    }
}