//2.35 Cree una aplicación que calcule su costo diario al conducir su automóvil, de modo que pueda estimar 
//     cuánto dinero puede ahorrar si comparte los viajes en automóvil, lo cual también tiene otras ventajas,
//     como la reducción de las emisiones de carbono y la reducción de la congestión de tráfico. 
//     La aplicación debe recibir como entrada la siguiente información y mostrar el costo por día para el 
//     usuario por conducir al trabajo: 
//     a) T otal de kilómetros conducidos por día. 
//     b) C osto por litro de gasolina. 
//     c) P romedio de kilómetros por litro. 
//     d) Cuotas de estacionamiento por día. 
//     e) Peaje por día.


import java.util.Scanner;

public class Ejercicio14

{
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        double tkmpordia, costporgalon, promporgalon;
        double estaciona, peajepordia, costmanejodiario;

        System.out.println("\n\nEste programa recibe como entrada la siguiente informacion y mostrara el costo por dia para el usuario por conducir al trabajo.");
        
        tkmpordia = requestInput("Escriba el total de kilometros conducidos por dia: ", sc);
        costporgalon = requestInput("Escriba el costo por litro de gasolina: ", sc);
        promporgalon = requestInput("Escriba el promedio de kilometros por litro: ", sc);
        estaciona = requestInput("Escriba las cuotas de estacionamiento por dia: ", sc);
        peajepordia = requestInput("Escriba el peaje por dia: ", sc);

        // calculo del costo diario de conducir
        costmanejodiario = ((tkmpordia / promporgalon) * costporgalon) + estaciona + peajepordia;

        System.out.printf("\nEl costo de manejar diario es de: %.2f\n\n\n", costmanejodiario);
    }

    private static double requestInput(String s, Scanner input)

    {
        System.out.print(s);
        return input.nextDouble();
    }
}