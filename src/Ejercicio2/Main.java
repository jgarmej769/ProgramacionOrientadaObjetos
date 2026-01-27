package Ejercicio2;

public class Main {
    public static void main(String[] args){
        CuentaCorriente sinNombre = new CuentaCorriente("4698615H",15);
        CuentaCorriente sinSaldo = new CuentaCorriente("48965314H","Mauro");
        CuentaCorriente cuentaCompleta = new CuentaCorriente("8464654H","NombreCompleto",60);

        CuentaCorriente cuentaCeres = new CuentaCorriente("493888h","Ceres",14141414);


        sinNombre.mostrarInformacion(); //el nombre debe estar vacío
        sinSaldo.mostrarInformacion(); //el saldo debe ser 0
        cuentaCompleta.mostrarInformacion(); //datos completos
        cuentaCeres.mostrarInformacion();
    }
}
