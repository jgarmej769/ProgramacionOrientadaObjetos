package Examen2425Ejercicio2Buffer;

public class Main {
    public static void main(String[] args) {
        BufferCircular b = new BufferCircular();

        b.insertar(9);
        b.insertar(5);
        b.insertar(4);
        b.insertar(8);
        b.insertar(3);
        b.mostrarBuffer();
        System.out.println();

        b.leer();
        b.leer();
        b.mostrarBuffer();

        System.out.println("El porcentaje del buffer es del " + b.estadoBuffer() + "%");
        System.out.println();
        b.insertar(0);
        b.insertar(8);
        b.insertar(5);
        b.insertar(6);
        b.insertar(1);
        b.insertar(2); // Da la vuelta y lo inserta en la primera posición
        b.mostrarBuffer();
        System.out.println();

        b.insertar(0);
        b.insertar(0); // No puede insertarlo
        b.insertar(0); // No puede insertarlo
        b.mostrarBuffer();

        System.out.println();
        System.out.println("El porcentaje del buffer es del " + b.estadoBuffer() + "%");

        System.out.println();
        b.leer(); //Lee el número más antiguo del buffer (el 4 en este caso)
        b.leer();
        b.insertar(3); //Ahora si puede insertar de nuevo un número
        b.mostrarBuffer();
    }
}
