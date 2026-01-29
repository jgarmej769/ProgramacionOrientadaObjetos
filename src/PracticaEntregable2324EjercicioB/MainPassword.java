package PracticaEntregable2324EjercicioB;

import Agenda.Contacto;

import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas Passwords desea comprobar?: ");
        int tam = sc.nextInt();

        System.out.println("Introduzca la longitud de los Passwords: ");
        int longitud = sc.nextInt();

        Password lista[] = new Password[tam];
        for (int i = 0; i < lista.length; i++)  {
            System.out.println("Introduzca la contraseña "+(i+1)+": ");
            String contrasenia = sc.next();

            Password contaseniaTemporal = new Password(contrasenia);
            lista[i] = contaseniaTemporal;
        }

        System.out.println("****RESULTADO DEL ANÁLISIS****");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i].getContrasenia() +": ");
            if (lista[i].esFuerte()){
                System.out.print("Contraseña fuerte.");
            }else{
                System.out.print("Contraseña débil.");
            }
            System.out.println();
        }

    }
}
