package ejercicio3;

public class Main {
  public static void main(String[] args) {
    CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "José David");
    CuentaCorriente cuenta2 = new CuentaCorriente("12345678A", "José David", 123.12);
    CuentaCorriente cuenta3 = new CuentaCorriente("12345678A", 32.21);

    // Cuenta 1
    cuenta1.mostrarInformacion();
    cuenta1.ingresarDinero(1230.23);
    cuenta1.mostrarInformacion();
    cuenta1.sacarDinero(1240.23);
    cuenta1.mostrarInformacion();

    // Cuenta 2
    cuenta2.mostrarInformacion();
    cuenta2.ingresarDinero(1230.23);
    cuenta2.mostrarInformacion();
    cuenta2.sacarDinero(1240.23);
    cuenta2.mostrarInformacion();

    // Cuenta 3
    cuenta3.mostrarInformacion();
    cuenta3.ingresarDinero(1230.23);
    cuenta3.mostrarInformacion();
    cuenta3.sacarDinero(1240.23);
    cuenta3.mostrarInformacion();
  }
}