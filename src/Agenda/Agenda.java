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

        while (!anadido){
            if(!contactoExiste(nuevoContacto.getTelefono())){
                this.listaContactos = Arrays.copyOf(this.listaContactos,this.listaContactos.length + 1);
                this.listaContactos[listaContactos.length-1] = nuevoContacto;
                anadido = true;
            }else{
                System.out.println("AVISO: Ya existe un contacto con el teléfono que desea registrar.");
            }
        }

        return anadido;
    }

    void informacionContacto (Contacto contactoEntrada){
        System.out.println("===DATOS DEL CONTACTO===");
        System.out.println("\nNombre: "+contactoEntrada.getNombre());
        System.out.println("Telefono: "+contactoEntrada.getTelefono());
    }
}
