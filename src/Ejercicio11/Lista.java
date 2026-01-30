package Ejercicio11;

import java.util.Arrays;

public class Lista {
  private Integer listaNumeros[];

  public Lista() {
    this.listaNumeros = new Integer[0];
  }

  public Integer[] getListaNumeros() {
    return listaNumeros;
  }

  public static Lista concatenar(Lista listaA, Lista listaB) {
    Lista res = null;

    if (listaA.getListaNumeros().length + listaB.getListaNumeros().length > 0) {
      Integer numerosListaA[] = listaA.getListaNumeros();
      Integer numerosListaB[] = listaB.getListaNumeros();
      Integer listaNumerosTemp[] = Arrays.copyOf(numerosListaA, numerosListaA.length+numerosListaB.length);

      for (int i = 0; i < numerosListaB.length; i++) {
        listaNumerosTemp[numerosListaA.length+i] = numerosListaB[i];
      }

      res = new Lista();
      res.listaNumeros = listaNumerosTemp;
    }

    return res;
  }

  public int getNumElementos() {
    int numElementos = 0;
    for (int i = 0; i < this.listaNumeros.length; i++) {
      if (this.listaNumeros[i] != null) {
        numElementos++;
      }
    }

    return numElementos;
  }

  public void insertarFinal(Integer num) {
    this.listaNumeros = Arrays.copyOf(this.listaNumeros, this.listaNumeros.length+1);
    this.listaNumeros[this.listaNumeros.length-1] = num;
  }

  public void insertarPrincipio(Integer num) {
    Integer listaNumerosTemp[] = new Integer[this.listaNumeros.length+1];
    listaNumerosTemp[0] = num;

    for (int i = 0; i < this.listaNumeros.length; i++) {
      listaNumerosTemp[i+1] = this.listaNumeros[i];
    }

    this.listaNumeros = listaNumerosTemp;
  }

  public boolean insertarEnIndice(Integer num, int index) {
    boolean res = false;

    if (index <= this.listaNumeros.length) {
      Integer listaNumerosTemp[] = new Integer[this.listaNumeros.length+1];
      listaNumerosTemp[index] = num;

      int iOriginal = 0;
      for (int i = 0; i < listaNumerosTemp.length; i++) {
        if (listaNumerosTemp[i] == null) {
          listaNumerosTemp[i] = this.listaNumeros[iOriginal++];
        }
      }

      this.listaNumeros = listaNumerosTemp;
      res = true;
    }

    return res;
  }

  public void insertarDesdeOtraLista(Lista lista) {
    Lista listaTemp = Lista.concatenar(this, lista);

    this.listaNumeros = listaTemp.listaNumeros;
  }

  public boolean eliminarElemento(int index) {
    boolean res = false;

    if (index < this.listaNumeros.length) {
      Integer listaNumerosTemp[] = new Integer[this.listaNumeros.length-1];
      this.listaNumeros[index] = null;

      int iGuardado = 0;
      for (int i = 0; i < this.listaNumeros.length; i++) {
        if (this.listaNumeros[i] != null) {
          listaNumerosTemp[iGuardado++] = this.listaNumeros[i];
        }
      }

      this.listaNumeros = listaNumerosTemp;
      res = true;
    }

    return res;
  }

  public Integer obtenerElemento(int index) {
    Integer res = null;

    if (index < this.listaNumeros.length) {
      res = this.listaNumeros[index];
    }

    return res;
  }

  public int buscarElemento(Integer num) {
    int res = -1;

    for (int i = 0; i < this.listaNumeros.length && res == -1; i++) {
      if (this.listaNumeros[i].equals(num)) {
        res = i;
      }
    }

    return res;
  }

  public void mostrarLista() {
    System.out.println("\n=== Elementos de la lista ===");
    System.out.print("|");
    if (this.getNumElementos() > 0) {
      for (int i = 0; i < this.listaNumeros.length; i++) {
        if (this.listaNumeros[i] != null) {
          System.out.print(" "+this.listaNumeros[i]+" ");
        } else {
          System.out.print(" X ");
        }
        System.out.print("|");
      }
      System.out.println();
    } else {
      System.out.println("- La lista esta vacía.");
    }
  }
}