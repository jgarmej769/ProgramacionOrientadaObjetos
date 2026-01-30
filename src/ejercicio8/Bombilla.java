package ejercicio8;

public class Bombilla {
  private boolean encendida;
  private static boolean interruptor = true;

  public static boolean isInterruptorEncendido() {
    return interruptor;
  }

  public static void setInterruptorEncendido(boolean interruptor) {
    Bombilla.interruptor = interruptor;
  }

  public Bombilla() {
    this.encendida = true;
  }

  public boolean isEncendida() {
    return this.encendida && interruptor;
  }
  
  public void setBombillaEncendida(boolean encendida) {
    this.encendida = encendida;
  }
}