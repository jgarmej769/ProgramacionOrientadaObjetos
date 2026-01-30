package Ejercicio11;

public class Main {
  public static void main(String[] args) {
    Lista lista = new Lista();

    lista.insertarFinal(12);
    lista.insertarFinal(32);
    lista.insertarPrincipio(13);

    if (lista.insertarEnIndice(26, 3)) {
      System.out.println("\n- Se ha insertado el número 26 en la posición 3");
    } else {
      System.out.println("\n- No se ha podido insertar el número 26 en la posición 3");
    }

    lista.mostrarLista();

    lista.insertarDesdeOtraLista(lista);

    lista.mostrarLista();

    if (lista.eliminarElemento(lista.getNumElementos()-1)) {
      System.out.println("\n- Se ha eliminado el último número.");
    } else {
      System.out.println("\n- No se ha podido eliminar el último número.");
    }

    lista.mostrarLista();

    System.out.println("\n- Elemento 0: "+lista.obtenerElemento(0));

    System.out.println("\n- Indice del número 26: "+lista.buscarElemento(26));

    Lista.concatenar(lista, lista).mostrarLista();
  }
}