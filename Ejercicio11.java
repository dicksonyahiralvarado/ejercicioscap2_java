//2.30 Escriba una aplicación que reciba del usuario un número compuesto por cinco dígitos, que separe ese
//     número en sus dígitos individuales y los imprima, cada uno separado de los demás por tres espacios.

import java.util.Scanner;
  
public class Ejercicio11

{      
    public static void main(String arg[])
    {  
        Scanner sc = new Scanner(System.in);
        int numero = 0, d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;
        int resultado1 = 0, resultado2 = 0, resultado3 = 0, resultado4 = 0;

        System.out.println("\n\nEste programa recibe cinco digitos y los imprima, cada uno separado de los demas por tres espacios.");
        
        System.out.print("\n\n");
        System.out.print("Escriba un numero entero de cinco cifras:\n");
        numero = sc.nextInt();

        resultado1 = numero/10;
        d1 = numero % 10;

        resultado2 = resultado1/10;
        d2 = resultado1 % 10;

        resultado3 = resultado2/10;
        d3 = resultado2 % 10;

        resultado4 = resultado3/10;
        d4 = resultado3 % 10;

        d5 = resultado4 % 10;

        System.out.print("\n-------------------------------------------------------------------------------\n");
       
        System.out.printf("\nEl numero separado en digitos es: \n\n%d   %d   %d   %d   %d", d5, d4, d3, d2, d1);
        System.out.print("\n");

        System.out.print("\n-------------------------------------------------------------------------------\n");

        sc.close();

    }     
}      