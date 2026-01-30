package ejercicio4;

public class CuentaCorriente {
  private final String dni;
  public String nombreTitular;
  private double saldo;
  private static String nombreBanco;
  private Gestor gestor;

  public CuentaCorriente(String dni, String nombreTitular, double saldo, Gestor gestor) {
    this.dni = dni;
    this.nombreTitular = nombreTitular;
    this.saldo = saldo;
    this.gestor = gestor;
  }

  public CuentaCorriente(String dni, double saldo) {
    this(dni, "", saldo, null);
  }

  public CuentaCorriente(String dni, double saldo, Gestor gestor) {
    this(dni, "", saldo, gestor);
  }

  public CuentaCorriente(String dni, String nombreTitular) {
    this(dni, nombreTitular, 0, null);
  }

  public CuentaCorriente(String dni, String nombreTitular, Gestor gestor) {
    this(dni, nombreTitular, 0, gestor);
  }

  public void sacarDinero(double importe) {
    if (importe <= this.saldo) {
      System.out.println("==== OPERACIÓN REALIZADA ====");
      System.out.println(" - Se ha sacado: "+importe+"€");
    } else {
      System.out.println("==== OPERACIÓN DENEGADA ====");
      System.out.println(" - No hay saldo suficiente.");
    }
    System.out.println();
  }

  public void ingresarDinero(double importe) {
    this.saldo += importe;
  }

  public void mostrarInformacion() {
    System.out.println("==== INFORMACIÓN DE LA CUENTA CORRIENTE ====");
    System.out.println(" - DNI: "+dni);
    System.out.println(" - Nombre del Titular: "+nombreTitular);
    System.out.println(" - Saldo disponible: "+saldo+"€");
    System.out.println();
  }

  public static String getNombreBanco() {
    return nombreBanco;
  }

  public static void setNombreBanco(String nombreBanco) {
    CuentaCorriente.nombreBanco = nombreBanco;
  }

  public Gestor getGestor() {
    if (gestor == null) {
      System.out.println("[CuentaCorriente] Esta cuenta no tiene un gestor.");
    }
    return gestor;
  }

  public void setGestor(Gestor gestor) {
    this.gestor = gestor;
  }
}