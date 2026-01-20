package Agenda;

public class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre (){
        return this.nombre;
    }

    public String getTelefono (){
        return this.telefono;
    }

    public String setNombre(String nombre){
        this.nombre = nombre;
        return this.nombre;
    }

    public String setTelefono (String telefono){
        this.telefono = telefono;
        return this.telefono;
    }

}
