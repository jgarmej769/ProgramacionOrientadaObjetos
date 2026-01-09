package Ejercicio2;

public class CuentaCorriente {
    String dni;
    String nombreTitular;
    double saldo;

    public CuentaCorriente (String dni, String nombreTitular, double saldo){
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public CuentaCorriente (String dni, String nombreTitular){
        this(dni, nombreTitular, 0);
    }

    public CuentaCorriente(String dni, double saldo){
        this(dni, "",saldo);
    }

    double sacarDinero (double saldoRetirar){
        if (saldoRetirar > this.saldo){
            System.out.println("La operación no se ha podido llevar a cabo debido a que no tiene saldo suficiente");
        }else{
            this.saldo = this.saldo -saldoRetirar;
            System.out.println("Ha retirado "+saldoRetirar+"€, sau saldo acutal es de "+this.saldo+"€.");
        }
        return this.saldo;
    }

    double ingresarDinero (double saldoIngresar){

        this.saldo += saldoIngresar;
        System.out.println("Ha ingresado "+saldoIngresar+"€, su saldo acutal es de "+this.saldo+"€.");
        return this.saldo;
    }

    void mostrarInformacion(){
        System.out.println("\n\n=====DATOS DE LA CUENTA CORRIENTE ====");
        System.out.println("Titular de la Cuenta: "+this.nombreTitular);
        System.out.println("DNI del titular: "+this.dni);
        System.out.println("Saldo Actual: "+this.saldo+"€");
    }
}
