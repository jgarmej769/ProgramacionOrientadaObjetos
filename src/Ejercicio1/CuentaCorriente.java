package Ejercicio1;

import java.util.Scanner;

public class CuentaCorriente {
    String dni;
    String nombreTitular;
    double saldo;

    public CuentaCorriente (String dni, String nombreTitular){
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }
    double sacarDinero (double saldoRetirar){
        if (saldoRetirar > saldo){
            System.out.println("La operación no se ha podido llevar a cabo debido a que no tiene saldo suficiente");
        }else{
            saldo = saldo -saldoRetirar;
            System.out.println("Ha retirado "+saldoRetirar+"€, sau saldo acutal es de "+saldo+"€.");
        }
        return saldo;
    }

    double ingresarDinero (double saldoIngresar){

        saldo += saldoIngresar;
        System.out.println("Ha ingresado "+saldoIngresar+"€, su saldo acutal es de "+saldo+"€.");
        return saldo;
    }

    void mostrarInformacion(){
        System.out.println("\n\n=====DATOS DE LA CUENTA CORRIENTE ====");
        System.out.println("Titular de la Cuenta: "+nombreTitular);
        System.out.println("DNI del titular: "+dni);
        System.out.println("Saldo Actual: "+saldo+"€");
    }
}
