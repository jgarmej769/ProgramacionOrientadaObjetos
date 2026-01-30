package ejercicio7;

public class Main {
  public static void main(String[] args) {
    FM miRadio = new FM();

    miRadio.display();

    if (miRadio.up(140)) {
      System.out.println("Se ha podido");
    } else {
      System.out.println("No se ha podido");
    }

    miRadio.display();

    if (miRadio.down(1)) {
      System.out.println("Se ha podido");
    } else {
      System.out.println("No se ha podido");
    }

    miRadio.display();
  }
}