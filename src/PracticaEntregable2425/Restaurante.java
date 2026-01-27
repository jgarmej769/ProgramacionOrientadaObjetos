package PracticaEntregable2425;

import java.util.Arrays;

public class Restaurante {
    private String nombre;
    private Platos listaPlatos[];
    private Empleado listaEmpleados[];
    private static String cadenaRestaurante;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getCadenaRestaurante() {
        return cadenaRestaurante;
    }
    public static void setCadenaRestaurante(String cadenaRestaurante) {
        Restaurante.cadenaRestaurante = cadenaRestaurante;
    }

    public Empleado[] getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(Empleado[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Platos[] getListaPlatos() {
        return listaPlatos;
    }
    public void setListaPlatos(Platos[] listaPlatos) {
        this.listaPlatos = listaPlatos;
    }

    private boolean buscarPlato (Platos busqueda){
        int i = 0;
        boolean encontrado = false;
        while ( i < this.listaPlatos.length && !encontrado){
            if (this.listaPlatos[i].getNombre().equals(busqueda.getNombre())){
            encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

    private boolean buscarEmpleado (Empleado busqueda){
        int i = 0;
        boolean encontrado = false;

        while (i < this.listaEmpleados.length && !encontrado){
            if (this.listaEmpleados[i].getNombreCompleto().equals(busqueda.getNombreCompleto())){
                encontrado = true;
            }
            i++;
        }

        return encontrado;
    }

    boolean insertarPlato (Platos nuevoPlato){
        boolean anadido = false;

        if (!buscarPlato(nuevoPlato)){
            this.listaPlatos = Arrays.copyOf(this.listaPlatos, this.listaPlatos.length);
            this.listaPlatos[this.listaPlatos.length-1] = nuevoPlato;
            anadido = true;
        }else{
            System.out.println("====\nERROR 001: El plato que desea añadir ya se encuentra en la lista.\n=====");
        }

        return anadido;
    }

    boolean anadirEmpleado (Empleado nuevoEmpleado){
        boolean anadido = false;

        if (!buscarEmpleado(nuevoEmpleado)){
            this.listaEmpleados = Arrays.copyOf(this.listaEmpleados, this.listaEmpleados.length + 1);
            this.listaEmpleados[this.listaEmpleados.length - 1] = nuevoEmpleado;
            anadido = true;
        }else {
            System.out.println("====\nERROR 002: El empleado que deseas añadir ya se encuentra registrado en la lista\n====");
        }
        return anadido;
        }

    boolean eliminarEmpleado (int cod){
        boolean eliminado = false;
        int i = 0;
        while (i < this.listaEmpleados.length && !eliminado){
            if (cod == this.listaEmpleados[i].getNumIdentificativo()){
                this.listaEmpleados[i] = null;
                eliminado = true;
            }
            i++;
        }
        return eliminado;
    }

    void mosotrarMenu(){
        System.out.println("\n====LISTA DE PLATOS===");
        for (int i = 0; i < this.listaPlatos.length; i++) {
            System.out.println(this.listaPlatos[i].getNombre());
        }
        System.out.println("======================");
    }

    void mostrarStock (){
        System.out.println("====UNIDADES DISPONIBLES===");
        for (int i = 0; i < this.listaPlatos.length; i++) {
            System.out.println("Plato: "this.listaPlatos[i].getNombre()+" Unidades Disponibles: "+this.listaPlatos[i].getStock());

        }
    }
}
