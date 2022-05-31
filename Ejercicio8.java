//2.26 Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e 
//     imprima el resultado. [Sugerencia:use el operador residuo]. 

import java.util.Scanner;
   
public class Ejercicio8
   
{  

//el método main empieza la ejecución de la aplicación en Java 
public static void main(String arg[])

    {   

        //crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int mayor;
        int menor;
 
        System.out.print("\n-------------------------------------------------------------------------------\n");
        System.out.println("\nEste programa recibe dos numeros enteros y verifica si el primero es un multiplo del segundo.");
        
        System.out.println("\nEscriba el primer numero entero:");
        num1 = entrada.nextInt();
  
        System.out.println("Escriba el segundo numero entero:");
        num2 = entrada.nextInt();
        
        mayor = num1;
        menor = num2;
        
        if ( num2 > num1 )
        {          
            mayor = num2;
            menor = num1;
        }          
            
        if ( 0 == mayor % menor )
        System.out.printf("\nEl numero %d es multiplo del numero %d\n", mayor, menor);
     
        if ( 0 != mayor % menor )
        System.out.println("\nLos numeros no son multiplos.\n");

        System.out.print("-------------------------------------------------------------------------------\n\n");
 
    }   
 
}   