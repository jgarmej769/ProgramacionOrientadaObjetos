package Agenda;

import java.util.Arrays;

public class Agenda {
    Contacto listaContactos[];

    public Agenda (){
        this.listaContactos = new Contacto[0];
    }
    void insertarContacto (String nombre, String telefono){
        Contacto temporal  = new Contacto(nombre, telefono);
        insertarContacto(temporal);
    }

    Contacto buscarContactoTelefono (String telefonoBuscar){
        int i = 0;
        boolean encontrado = false;
        Contacto contactoEncontrado = null;
        while (i < this.listaContactos.length && !encontrado) {
            if (this.listaContactos[i].getTelefono().equals(telefonoBuscar)) {
                contactoEncontrado = listaContactos[i];
                encontrado = true;
            }
            i++;
        }
        return contactoEncontrado;
    }

    boolean contactoExiste (String telefonoBuscar){
        int i = 0;
        boolean existe = false;

        while(i < this.listaContactos.length && !existe){
            if (this.listaContactos[i].getTelefono().equals(telefonoBuscar)){
                existe = true;
            }
            i++;
        }
        return existe;
    }
    boolean insertarContacto (Contacto nuevoContacto) {
        boolean anadido = false;
        boolean existente = false;
        while (!anadido && !existente){
            if(!contactoExiste(nuevoContacto.getTelefono())){
                this.listaContactos = Arrays.copyOf(this.listaContactos,this.listaContactos.length + 1);
                this.listaContactos[listaContactos.length-1] = nuevoContacto;
                anadido = true;
            }else{
                System.out.println("AVISO: Ya existe un contacto con el teléfono que desea registrar.");
                existente = true;
            }
        }

        return anadido;
    }

    private Contacto[] buscaryEliminarContactoListaTemporal (Contacto listaTemporal[], String nombreContacto) {
        boolean encontrado = false;
        int i =0;
        Contacto temporal = null;
        while (!encontrado && i<listaTemporal.length) {
            if (listaTemporal[i].getNombre().equals(nombreContacto)) {
                listaTemporal[i] = null;
            }
            i++;
        }
        return listaTemporal;
    }


    void informacionContacto (Contacto contactoEntrada){
        System.out.println("===DATOS DEL CONTACTO===");
        System.out.println("\nNombre: "+contactoEntrada.getNombre());
        System.out.println("Telefono: "+contactoEntrada.getTelefono());
    }

    void mostrarAgendaOrdenada (){
        Contacto listaTemporal[] = Arrays.copyOf(this.listaContactos,this.listaContactos.length);
        Contacto contactoOrdenados [] = new Contacto [listaTemporal.length];
        String listaNombres[] = new String[listaTemporal.length];

        for (int i = 0; i < listaTemporal.length; i++) {
            listaNombres[i] = listaTemporal[i].getNombre();
        }

        Arrays.sort(listaNombres);

        for (int i = 0; i < listaTemporal.length ; i++) {
            boolean encontrado = false;
            int j = 0;

            while (!encontrado && j<listaTemporal.length){
                if (listaTemporal[j].getNombre().equals(listaNombres[i])){
                    contactoOrdenados[i] = listaTemporal[j];
                    listaTemporal = buscaryEliminarContactoListaTemporal(listaTemporal, listaNombres[i]);
                    encontrado = true;
                }
                j++;
            }
        }

        System.out.println("\n===CONTACTOS EN SU AGENDA===");
        for (int i = 0; i < contactoOrdenados.length; i++) {
            System.out.println("Contacto "+ (i+1)+ "-----------------------------");
            System.out.println("Nombre: "+contactoOrdenados[i].getNombre());
            System.out.println("Telefono: "+contactoOrdenados[i].getTelefono());
        }

    }
}
