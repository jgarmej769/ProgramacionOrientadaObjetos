package Examen2425Ejercicio2Buffer;

public class BufferCircular {
    Integer array[];
    static int ultimaPosicion = 0;
    static int posLectura = 0;
    static int elementos = 0;

    public BufferCircular(){
        this.array = new Integer[10];
    }
    boolean insertar(Integer num){
        boolean insertado = false;
        int  i = 0;
       if (elementos != this.array.length){
           this.array[ultimaPosicion] = num;
           ultimaPosicion = (ultimaPosicion + 1) % this.array.length;
           elementos++;
           insertado = true;
       }
        return insertado;
    }

    Integer leer(){
        Integer numLeido = null;
        if(elementos != 0){
            numLeido = this.array[posLectura];
            this.array[posLectura] = null;

            posLectura = (posLectura + 1) % 10;
            elementos--;

        }
        return numLeido;
    }

    void mostrarBuffer(){
        for (int i = 0; i < this.array.length; i++) {
            System.out.print("["+ this.array[i] +"] ");
        }
        System.out.println();
    }

    int estadoBuffer(){
        int contadorNull = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == null){
                contadorNull++;
            }
        }
        int estado = (this.array.length - contadorNull) *10;
        return estado;
    }
}
