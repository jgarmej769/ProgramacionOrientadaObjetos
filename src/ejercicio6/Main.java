package ejercicio6;

public class Main {
  public static void main(String[] args) {
    Texto miTexto = new Texto(20);

    if (miTexto.agregarPrincipio("1234567890")) {
      System.out.println("DEBUG: Se puede");
    } else {
      System.out.println("DEBUG: NO se puede");
    }

    if (miTexto.agregarFinal("Hola")) {
      System.out.println("DEBUG: Se puede");
    } else {
      System.out.println("DEBUG: NO se puede");
    }

    System.out.println(miTexto.getNumVocales());

    miTexto.informacion();
  }
}