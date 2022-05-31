// 2.15 Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números del  
//      usuario e imprima la suma, producto, diferencia y cociente (división) de los números.

 import java.util.Scanner; //el programa usa la clase Scanner

 public class Ejercicio1
 {     
   //el método main empieza la ejecución de la aplicación en Java   
  public static void main( String args[] )
  {       
    //crea objeto Scanner para obtener la entrada de la ventana de comandos
    Scanner entrada = new Scanner(System.in);

    int num1;
    int num2;
    int suma;
    int producto;
    int diferencia;
    int cociente;

    System.out.print("\n-------------------------------------------------------------------------------");
    System.out.print("\n\nEste programa recibe dos numeros e imprime su suma, producto, diferencia y cociente.\n\n");

    System.out.println("Escriba el primer numero entero: ");
    num1 = entrada.nextInt();

    System.out.println("Escriba el segundo numero entero: ");
    num2 = entrada.nextInt();

    suma = num1 + num2;
    diferencia = num1 - num2;
    producto = num1*num2;
    cociente = num1/num2;

    System.out.printf("\nLa suma es: %d\n", suma);
    System.out.printf("\nEl producto es: %d\n", producto);
    System.out.printf("\nLa diferencia es: %d\n", diferencia);
    System.out.printf("\nEl cociente es: %d\n", cociente);
    System.out.print("\n-------------------------------------------------------------------------------\n\n");


   }       // fin del metodo main
 }        // fin de la clase Ejercicio1