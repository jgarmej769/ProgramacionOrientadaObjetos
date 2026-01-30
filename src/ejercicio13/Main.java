package ejercicio13;

public class Main {
  public static void main(String[] args) {
    Pila pila = new Pila();

    System.out.println("\n- Resultado de desapilar: "+pila.desapilar());

    pila.apilar(1);
    pila.apilar(2);
    pila.apilar(3);

    System.out.println("\n- Resultado de desapilar: "+pila.desapilar());
    System.out.println("\n- Resultado de desapilar: "+pila.desapilar());
    System.out.println("\n- Resultado de desapilar: "+pila.desapilar());
  }
}