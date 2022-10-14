
package Operaciones;

public class Aritmetica {
    //Atribbutos de la clase
    int a; //Si o inicializamos asi,tienen el valor de 0 y False
    int b;
    //El constructor es un metodo especial
    
    public Aritmetica(){
        System.out.println("Se esta ejecutando este constructor numero uno");
    }
    //Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando este constructor numero dos");
    }
    //Metodo
    public void sumarNumeros(){
        //Cuerpo de la clase
        //Las variables que se definan dentro se definen como variables locales y se destruyen al terminar la ejecucion
        int resultado = (a + b);
        System.out.println("resultado = " + resultado);    
    }
    
    public int sumarConRetorno (){
       //int resultado = a + b;
        return a + b;
    }
    
    public int sumarConArgumentos(int a, int b){
    this.a = a; //El argumento a se asigna al atributo this.a
    this.b = b;
    //return a + b;
    return this.sumarConRetorno();
    }
}
