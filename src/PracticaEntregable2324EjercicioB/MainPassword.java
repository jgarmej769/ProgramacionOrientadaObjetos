package PracticaEntregable2324EjercicioB;

import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas Passwords desea comprobar?: ");
        int tam = sc.nextInt();

        System.out.println("Introduzca la longitud de los Passwords: ");
        int longitud = sc.nextInt();

        for (int i = 0; i < tam; i++) {
            System.out.println("Introduzca la contraseña "+(i+1)+": ");
            String contrasenia = sc.next();

            Password contaseniaTemporal = new Password(contrasenia);
        }

    }
}
