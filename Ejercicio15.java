//Escriba una aplicación que muestre los números del 1 al 4 en la misma línea, con cada par de números 
//adyacentes separado por un espacio. Use las siguientes técnicas: 
//a) Mediante una instrucción System.out.println. 
//b) Mediante cuatro instruccionesSystem.out.print. 
//c) Mediante una instrucción System.out.printf.

public class Ejercicio15 

{
    public static void main(String[] args) 

    {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

        System.out.print(num1 + " " + num2 + " " + num3 + " " + num4);
        
        System.out.printf("\n%d %d %d %d \n\n",num1,num2,num3,num4);

    } 
    
}