package ejercicio13;

import Ejercicio11.Lista;

public class Pila {
  private Lista lista;

  public Pila(Lista lista) {
    this.lista = lista;
  }

  public Pila() {
    this(new Lista());
  }

  public void apilar(Integer num) {
    lista.insertarFinal(num);
  }

  public Integer desapilar() {
    Integer res = null;

    if (lista.getNumElementos() > 0) {
      int ultimoElemento = lista.getNumElementos()-1;
      res = lista.obtenerElemento(ultimoElemento);
      lista.eliminarElemento(ultimoElemento);
    }

    return res;
  }
}