package PracticaEntregable2324Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique cuantas personas quieres: ");
        int tam = sc.nextInt();
        Persona array[] = new Persona[tam];
        int datosSalida[] = new int[tam];
        String nombres[] = new String[tam];

        for (int i = 0; i < tam; i++) {
            System.out.println("Introduzca el nombre de la persona "+i+": ");
            String nombre = sc.next();
            nombres[i] = nombre;

            System.out.println("Introduzca su peso: ");
            double peso = sc.nextDouble();

            System.out.println("Introduzca su edad: ");
            int edad= sc.nextInt();

            System.out.println("Introduzca su altura: ");
            double altura = sc.nextDouble();

            Persona temporal = new Persona(nombre,edad,"",peso,altura);

            datosSalida[i] = temporal.calcularMC();
        }

        System.out.println("\n**************RESULTADO DE LOS CÁLCULOS**************");
        for (int i = 0; i < tam; i++) {
            System.out.print(nombres[i]);
            int dato = datosSalida[i];

            if (dato == 0){
                System.out.print(": Peso ideal");
            }else if (dato == -1){
                System.out.print(": Por debajo de su peso ideal");
            }else if (dato == 1){
                System.out.print(": Sobrepeso");
            }
            System.out.println();
        }
    }
}
