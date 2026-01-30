package ejercicio4;

public class Gestor {
  public String nombre;
  private final String telefono;
  private final int importeMaximoAutorizado;

  Gestor(String nombre, String telefono, int importeMaximoAutorizado) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.importeMaximoAutorizado = importeMaximoAutorizado;
  }

  Gestor(String nombre, String telefono) {
    this(nombre, telefono, 10000);
  }

  Gestor() {
    this("", "", 10000);
  }

  public String getTelefono() {
    return telefono;
  }

  int getImporteMaximoAutorizado() {
    return importeMaximoAutorizado;
  }
}