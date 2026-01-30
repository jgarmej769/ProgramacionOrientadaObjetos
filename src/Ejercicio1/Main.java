package Ejercicio1;

public class Main {
  public static void main(String[] args) {
    CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "José David");

    cuenta1.mostrarInformacion();

    cuenta1.ingresarDinero(1230.23);
    cuenta1.mostrarInformacion();

    cuenta1.sacarDinero(1240.23);
    cuenta1.mostrarInformacion();
  }
}