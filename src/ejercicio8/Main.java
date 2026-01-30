package ejercicio8;

public class Main {
  public static void main(String[] args) {
    Bombilla b1 = new Bombilla();
    Bombilla b2 = new Bombilla();

    System.out.println(Bombilla.isInterruptorEncendido());

    System.out.println(b1.isEncendida());
    System.out.println(b2.isEncendida());

    b1.setBombillaEncendida(false);

    System.out.println(b1.isEncendida());
    System.out.println(b2.isEncendida());

    Bombilla.setInterruptorEncendido(false);

    System.out.println(b1.isEncendida());
    System.out.println(b2.isEncendida());
  }
}