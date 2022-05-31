//2.24 Escriba una aplicación que lea cinco enteros y que determine e imprima los enteros mayor y menor 
//     en el grupo.

import java.util.Scanner;
  
public class Ejercicio7

{          

    // el método main empieza la ejecución de la aplicación en Java
    public static void main( String args[])

    {           
        
        //crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        System.out.print("\n-------------------------------------------------------------------------------\n");
        System.out.println("\nEste programa lee cinco numeros enteros y determina el numero mayor y menor.\n");
        System.out.println("Escriba el primer numero entero:");
        num1 = entrada.nextInt();
        
        System.out.println("\nEscriba el segundo entero:");
        num2 = entrada.nextInt();
        
        System.out.println("\nEscriba el tercer entero:");
        num3 = entrada.nextInt();
        
        System.out.println("\nEscriba el cuarto entero:");
        num4 = entrada.nextInt();
        
        System.out.println("\nEscriba el quinto entero:");
        num5 = entrada.nextInt();

        //calculo del numero mayor en el grupo
        int mayor = num1;
        
        if (num2 > mayor)
        mayor = num2;
        if (num3 > mayor)
        mayor = num3;
        if (num4 > mayor)
        mayor = num4;
        if(num5 > mayor)
        mayor = num5;
        
        //calculo del numero menor en el grupo
        int menor = num1;
        
        if ( num2 < menor)
        menor = num2;
        if ( num3 < menor)
        menor = num3;
        if (num4 < menor)
        menor = num4;
        if (num5 < menor)
        menor = num5;

        //se imprime el numero mayor y menor
        System.out.printf("\nEl mayor de los numeros es: %d\n", mayor);
        System.out.printf("\nEl menor de los numeros es: %d\n", menor);
        System.out.print("\n-------------------------------------------------------------------------------\n\n");

    }           

}      