package Examen2526;

public class Artista {
    private String nombre;
    private String nif;
    private int anioNacimiento;
    private String discografica;
    private boolean esGrupo;


    public Artista(String nombre, String nif, int anioNacimiento, String discografica, boolean esGrupo){
        this.nombre = nombre;
        this.nif = nif;
        if (this.nif.length() < 9){
            while (this.nif.length() < 9){
                this.nif += '*';
            }
        }

        if (discografica.length() > 20){
            this.discografica =  discografica.substring(0,20);
        }else{
            this.discografica = discografica;
        }

        if (anioNacimiento > 1900 && anioNacimiento < 2026){
            this.anioNacimiento = anioNacimiento;
        }else{
            this.anioNacimiento = 2000; //si el año de nacimiento no cumple los requisitos, lo establecdemoe en 2000.
        }
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEsGrupo() {
        return esGrupo;
    }

    public String getDiscografica() {
        return discografica;
    }

    public String getNif() {
        return nif;
    }
}
