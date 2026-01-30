package ejercicio6;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
  private char cadenaCaracteres[];
  private LocalDate fechaCreacion;
  private LocalDateTime fechaHoraModificacion;

  Texto(int longitud) {
    this.cadenaCaracteres = new char[longitud];
    this.fechaCreacion = LocalDate.now();
  }

  Texto() {
    this(0);
  }

  private int getNumCaracteres() {
    int caracteres = 0;

    for (int i = 0; i < this.cadenaCaracteres.length; i++) {
      if (this.cadenaCaracteres[i] != 0) {
        caracteres += 1;
      }
    }

    return caracteres;
  }

  public boolean agregarPrincipio(char caracter) {
    boolean resultado = false;
    char nuevaCadena[] = new char[this.cadenaCaracteres.length];

    if (this.getNumCaracteres() < cadenaCaracteres.length) {
      int iGuardado = 1;
      for (int i = 0; i < this.cadenaCaracteres.length; i++) {
        if (this.cadenaCaracteres[i] != 0) {
          nuevaCadena[iGuardado++] = this.cadenaCaracteres[i];
        }
      }

      nuevaCadena[0] = caracter;
      this.cadenaCaracteres = nuevaCadena;
      resultado = true;
      this.fechaHoraModificacion = LocalDateTime.now();
    }

    return resultado;
  }

  public boolean agregarPrincipio(String cadena) {
    boolean resultado = false;

    if (this.getNumCaracteres()+cadena.length() <= this.cadenaCaracteres.length) {
      char cadenaAlreves[] = new char[cadena.length()];
      for (int i = 0; i < cadena.length(); i++) {
        cadenaAlreves[i] = cadena.charAt((cadena.length()-1-i));
      }

      for (int i = 0; i < cadenaAlreves.length; i++) {
        resultado = this.agregarPrincipio(cadenaAlreves[i]);
      }
    }

    return resultado;
  }

  public boolean agregarFinal(char caracter) {
    boolean resultado = false;

    if (this.getNumCaracteres() < cadenaCaracteres.length) {
      boolean insertado = false;
      for (int i = 0; i < this.cadenaCaracteres.length && !insertado; i++) {
        if (this.cadenaCaracteres[i] == 0) {
          this.cadenaCaracteres[i] = caracter;
          insertado = true;
        }
      }

      resultado = true;
      this.fechaHoraModificacion = LocalDateTime.now();
    }

    return resultado;
  }

  public boolean agregarFinal(String cadena) {
    boolean resultado = false;

    if (this.getNumCaracteres()+cadena.length() <= this.cadenaCaracteres.length) {
      for (int i = 0; i < cadena.length(); i++) {
        resultado = this.agregarFinal(cadena.charAt(i));
      }
    }

    return resultado;
  }

  private boolean isVocal(char c) {
    return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
  }

  public int getNumVocales() {
    int numVocales = 0;

    for (int i = 0; i < this.cadenaCaracteres.length; i++) {
      if (this.cadenaCaracteres[i] != 0 && isVocal(this.cadenaCaracteres[i])) {
        numVocales += 1;
      }
    }

    return numVocales;
  }

  public String toString() {
    char cadenaTemporal[] = new  char[cadenaCaracteres.length];

    for (int i = 0; i < this.cadenaCaracteres.length; i++) {
      if (this.cadenaCaracteres[i] != 0) {
        cadenaTemporal[i] = this.cadenaCaracteres[i];
      } else {
        cadenaTemporal[i] = ' ';
      }
    }

    return String.valueOf(cadenaTemporal);
  }

  public void informacion() {
    System.out.println("\n=== INFORMACIÓN DEL TEXTO ===");
    System.out.println("Texto: "+this.toString());
    System.out.println("Fecha de creación: "+fechaCreacion.toString());
    System.out.println("Última fecha/hora modificación: "+fechaHoraModificacion.toString()+"\n");
  }
}