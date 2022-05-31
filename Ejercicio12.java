//2.32 Escriba un programa que reciba cinco números, y que determine e imprima la cantidad de números negativos,
//     positivos, y la cantidad de ceros recibidos.


import java.util.Scanner;
   
public class Ejercicio12

{  
    public static void main(String arg[])

    {  
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;

        System.out.print("\n\n-------------------------------------------------------------------------------\n");
        System.out.println("\nEste programa recibe cinco numeros enteros y se determina la cantidad de numeros negativos, positivos, y la cantidad de ceros recibidos.\n");
        
        System.out.println("Escriba el primer numero entero:");
        num1 = entrada.nextInt();
        
        System.out.println("Escriba el segundo numero entero:");
        num2 = entrada.nextInt();
        
        System.out.println("Escriba el tercer numero entero:");
        num3 = entrada.nextInt();
        
        System.out.println("Escriba el cuarto numero entero:");
        num4 = entrada.nextInt();
        
        System.out.println("Escriba el quinto numero entero:");
        num5 = entrada.nextInt();
        
  
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        if ( num1 > 0)
        positivos = positivos + 1;
        
        if ( num1 < 0)
        negativos = negativos + 1;
        
        if ( 0 == num1)
        ceros = ceros + 1;
        
        if ( num2 > 0)
        positivos = positivos + 1;
        
        if ( num2 < 0)
        negativos = negativos + 1;
  
        if ( 0 == num2)
        ceros = ceros + 1;
        
        if ( num3 > 0)
        positivos = positivos + 1;
        
        if ( num3 < 0)
        negativos = negativos + 1;
        
        if ( 0 == num3)
        ceros = ceros + 1;
        
        if ( num4 > 0)
        positivos = positivos + 1;
        
        if ( num4 < 0)
        negativos = negativos + 1;

        if ( 0 == num4)
        ceros = ceros + 1;
  
        if ( num5 > 0)
        positivos = positivos + 1;
        
        if ( num5 < 0)
        negativos = negativos + 1;
        
        if ( 0 == num5)
        ceros = ceros + 1;
        
        //Imprime los resultados de los numeros recibidos
        System.out.printf("\nDe los numeros recibidos, %d son positivos, %d son negativos y %d son ceros.\n", positivos, negativos, ceros);
        System.out.print("\n-------------------------------------------------------------------------------\n\n");
    } 
}  
