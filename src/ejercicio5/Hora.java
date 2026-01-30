package ejercicio5;

public class Hora {
  private int hora;
  private int minuto;
  private int segundo;

  Hora(int hora, int minuto, int segundo) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }

  Hora() {
    this(0, 0, 0);
  }

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora += hora%24;
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    setHora(minuto/60);
    this.minuto += minuto%60;
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    setHora(segundo/3600);
    setMinuto((segundo%3600)/60);
    this.segundo += (segundo%3600)%60;
  }

  public String toString() {
    String horaCompleta = "";

    if (this.hora < 10) {
      horaCompleta += "0";
    }
    horaCompleta += this.hora + ":";

    if (this.minuto < 10) {
      horaCompleta += "0";
    }
    horaCompleta += this.minuto + ":";

    if (this.segundo < 10) {
      horaCompleta += "0";
    }
    horaCompleta += this.segundo;

    return horaCompleta;
  }
}