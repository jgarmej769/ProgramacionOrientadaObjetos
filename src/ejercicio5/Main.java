package ejercicio5;

public class Main {
  public static void main(String[] args) {
    Hora hora = new Hora();

    hora.setMinuto(3600);

    System.out.println("Hora completa: " + hora.toString());
  }
}