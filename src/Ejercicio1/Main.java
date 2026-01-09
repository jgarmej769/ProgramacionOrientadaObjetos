package Ejercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente("49388698H","Juan Garcia");
        System.out.println("CUENTA CREADA CON ÉXITO");
        cuenta.mostrarInformacion();
        //prueba de retirada (debe dar error)
        System.out.println("\n\n");
        cuenta.sacarDinero(5); //tengo 0 y quiero retirar 5
        cuenta.mostrarInformacion(); //comprobamos información
        //prueba de ingreso
        cuenta.ingresarDinero(100);
        cuenta.mostrarInformacion(); //comprobamos información
        //retirada correcta
        cuenta.sacarDinero(20);
        cuenta.mostrarInformacion(); //comprobamos información

    }
}