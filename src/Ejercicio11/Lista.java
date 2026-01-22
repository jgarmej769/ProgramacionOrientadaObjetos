package Ejercicio11;

import java.util.Arrays;

public class Lista {
    private Integer tabla[];

    public Lista (){
        this.tabla = new Integer[0];
    }

    public int getNumeroElementos (){
        return this.tabla.length;
    }

    public void insertarAlPrincipio (Integer num){
        Integer temporal [] = Arrays.copyOfRange(this.tabla,1,this.tabla.length + 1);
        temporal [0] = num;
        this.tabla = temporal;
    }

    public void insertarAlFinal (Integer num){
        Integer temporal [] = Arrays.copyOf(this.tabla, this.tabla.length+1);
        temporal[this.tabla.length] = num;
        this.tabla = temporal;
    }

    public void insertarEnPosicion (Integer num, int posicion){
        int contador = 0;

        Integer temporal[] = new Integer[this.tabla.length];
        for (int i = 0; i < temporal.length; i++) {
            if (i == posicion){
                temporal[i] = num;
            }else{
                temporal[i] = this.tabla[contador];
                contador++;
            }
        }

        this.tabla = temporal;
    }

    public void concatenarListas (Integer tabla2[]){
        int tam = this.tabla.length + tabla2.length;
        Integer tablaCompleta[] = Arrays.copyOfRange(this.tabla,0, tam);

        int contador = 0;
        for (int i = this.tabla.length ; i < tablaCompleta.length; i++) {
            tablaCompleta[i] = tabla2[contador];
            contador++;
        }
        this.tabla = tablaCompleta;
    }

    public void eliminarElementoPosicion (int posicion){

    }

}
