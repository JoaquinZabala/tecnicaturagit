/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg7;

/**
 *
 * @author PC
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // TODO code application logic here
         int miVariable = 10;
 System.out.println(miVariable);
 miVariable = 5;
 System.out.println(miVariable);
 
 String miVariableCadena = "Nos vemos desde java";
System.out.println(miVariableCadena);
miVariableCadena = "Chau desde java";
System.out.println(miVariableCadena);
    
    //Var - inferencia de tipos en Java
var miVariableEntera2 = 10;
var miVariableCadena2 = "seguimos estudiando"; 
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableEntera2);
        //soutv + tab
        //sout + tab
        // Para ejecutar shift + f6
        //Reglas para definir una variable en java
         
        var miVariableEjemplo = 45;
        var opcion
        var usuario = "Osvaldo"
        var titular = "Ingeniero"
        var union = titulo + "" + usuario;
        System.out.println("union = " + union);
         
        var a = 8;
        var b = 4;
        System.out.println(a + b);

        //Ejercicio: Caracteres especiales con java
        var nombre = "Natalia";
        System.out.println("Nueva linea\n" + nombre); //Diagonal inversa y letra n para salto de linea
        System.out.println("Tabulador: \t" + nombre); //Diagonal inversa y letra t para hacer un tab
        System.out.println("\t\t.:MENÚ:.");
        System.out.println("Retroceso: \b" + nombre);//Caracter de retroceso borra un espacio para atras
        System.out.println("Comillas Simples: \'" + nombre + "\'"); //Sirve para poner comillas simples
        System.out.println("Comillas Dobles: \"" + nombre + "\""); //Sirve para poner comillas dobles
       
         
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba su titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+""+usuario2);
         
    
        byte numEnteroByte = 127; 
        System.out.println("numEnteroByte = "+ numEnteroByte);
        System.out.println("Valor minimo del byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte:" + Byte.MAX_VALUE);
        
         short numEnteroShort = 10; 
        System.out.println("numEnteroShort = "+ numEnteroShort);
        System.out.println("Valor minimo del Short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo del Short:" + Short.MAX_VALUE);
        
        int numEnteroInt = (int)10; 
        System.out.println("numEnteroInt = "+ numEnteroInt);
        System.out.println("Valor minimo del int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int:" + Integer.MAX_VALUE);
        
        long numEnteroLong = 10; 
        System.out.println("numEnteroLong = "+ numEnteroLong);
        System.out.println("Valor minimo del long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo del long:" + Long.MAX_VALUE);
        
        float numFloat = 3.4028235E38F:
        System.out.println("numFloat = " + numFloat);
        System.out.println("E; valor minimo de Float: " + Float.MIN_VALUE);
        System.out.println("E; valor maximo de Float: " + Float.MAX_VALUE);
        
        double numdouble = 1.7976931348623157E208D:
        System.out.println("numDouble = " + numDouble);
        System.out.println("E; valor minimo de Double: " + Double.MIN_VALUE);
        System.out.println("E; valor maximo de Double: " + Double.MAX_VALUE);
        
        //Inferencia de tipos var y tipos primitivos
        var numEntero = 20 //Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        
        //Tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Indicamos a java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
    
    //Tipos primitivos tipos booleanos
        boolean varBool = false;
        System.out.println("varBool = " + varBool);
        if (varBool){
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }

        //Conversion de tipos primitivos
        var edad = "20";
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("ValorPI = " + valorPI);
        
        //Pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        edad = Integer.parseInt( entrada.nextLine());
        System.out.println("edad = " + edad);

        //Conversion de tipos primitivos en Java Parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(3);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un carater: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
        
        int num1= 5 , num2= 4;
        var solucion = num1 + num2;
        System.out.println("solucion suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion de la division = " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo de la division
        System.out.println("Solucion = " + solucion)

        if (num1 % 2 == 0)
            System.out.println("Es un nuemro par");
        else
            System.out.println("Es un nuemro impar");
*/
        int varNum1 = 1 varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);
        
    }
    
}
