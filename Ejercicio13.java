//2.33 Cree una calculadora del BMI que lea el peso del usuario en libras y la altura en pulgadas 
//     (o, si lo prefiere, el peso del usuario en kilogramos y la altura en metros), para que luego 
//     calcule y muestre el índice de masa corporal del usuario. 

import java.util.Scanner;
 
public class Ejercicio13 
{
    public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);

        double p,e,imc;

        System.out.print("\n--------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("\nEste programa lee el peso del usuario en kilogramos y la altura en metros, para que luego calcular y mostrar el indice de masa corporal del usuario. ");
        
        System.out.println("\nEscriba su peso en kg: ");
        p= teclado.nextDouble();
        System.out.println("Escriba su estatura en mts: ");
        e= teclado.nextDouble();

        imc= p/(e*e);
        System.out.println("\nSU IMC ES: " +imc);

        //VALORES DE BMI   
        if (imc<18.5)
        {
            System.out.println("SU SITUACION ES: BAJO PESO \n");
        } else if (imc>=18.5 && imc<=24.9) 
        
        {
            System.out.println("SU SITUACION ES: NORMAL \n");
        } else if (imc>=25 && imc<=29.9) 
        
        {
            System.out.println("SU SITUACION ES: SOBREPESO \n");
        } else 
        
        {
            System.out.println("SU SITUACION ES: OBESO \n");
        }

        System.out.print("--------------------------------------------------------------------------------------------------------------------------------\n\n");
        
    }
 
}

