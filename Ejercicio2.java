// 2.16 Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga los números del 
// usuario y muestre el número más grande, seguido de las palabras “es más grande”. Si los números son 
// iguales, imprima el mensaje “Estos números son iguales”. 

import java.util.Scanner; //el programa utiliza la clase Scanner
  
public class Ejercicio2
{           // Abre la clase Ejercicio2
 
    //el método main empieza la ejecución de la aplicación en Java
    public static void main( String args[] )
    {       // Abre el metodo main

        //crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        
        
    
        System.out.println("\n\nEscriba el primer numero entero: ");
        num1 = entrada.nextInt();

        System.out.println("\nEscriba el segundo numero entero: ");
        num2 = entrada.nextInt();
        
        if ( num1 > num2 )
        System.out.printf("\nEl numero %d es mas grande que el numero %d.\n\n", num1, num2);
        
        if ( num2 > num1 )
        System.out.printf("\nEl numero %d es mas grande que el numero %d.\n\n", num2, num1);
        
        if ( num1 == num2 )
        System.out.printf( "\nEstos numeros son iguales.\n\n", num1, num2);

        
        
        
    }       
}            
 