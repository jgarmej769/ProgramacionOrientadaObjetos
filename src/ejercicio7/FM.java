package ejercicio7;

public class FM {
  private double frecuencia;

  public FM(double frecuenciaInicial) {
    if (frecuenciaInicial >= 80 && frecuenciaInicial <= 108) {
      this.frecuencia = frecuenciaInicial;
    } else {
      this.frecuencia = 80;
    }
  }

  public FM() {
    this(80);
  }

  public boolean up(int frecuenciaASubir) {
    boolean resultado = false;

    if (frecuenciaASubir > 0) {
      for (int i = 0; i < frecuenciaASubir; i++) {
        this.frecuencia += 0.5;

        if (this.frecuencia > 108) {
          this.frecuencia = 80;
        }
      }

      resultado = true;
    }

    return resultado;
  }

  public boolean down(int frecuenciaABajar) {
    boolean resultado = false;

    if (frecuenciaABajar > 0) {
      for (int i = 0; i < frecuenciaABajar; i++) {
        this.frecuencia -= 0.5;

        if (this.frecuencia < 80) {
          this.frecuencia = 108;
        }
      }

      resultado = true;
    }

    return resultado;
  }

  public void display() {
    System.out.println("Frecuencia actual: "+this.frecuencia);
  }
}