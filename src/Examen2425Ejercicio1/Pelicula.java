package Examen2425Ejercicio1;

public class Pelicula {
    private static String productora = "Warner";
    private String titulo;
    private String director;
    private int anioLanzamiento;
    private String genero;

    public Pelicula (String titulo, String director, int anioLanzamiento, String genero){
        this.titulo = titulo;

        if (director.length() > 30) {
            this.director = director.substring(0, 30);
        } else {
            this.director = director;
        }
        if(anioLanzamiento >= 1900){
            this.anioLanzamiento = anioLanzamiento;
        }else{
            this.anioLanzamiento = 1900;
        }
        this.genero = genero;
    }
    public Pelicula (String titulo, String director, int anioLanzamiento){
        this(titulo, director, anioLanzamiento, "");
    }
    //-------------------------GETTER Y SETTER----------------------------------
    public String getTitulo() {
        return titulo;
    }

    public static String getProductora() {
        return productora;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public String getDirector() {
        return director;
    }

    boolean addGenero (String genero){
        boolean anadido = false;
        if (!this.genero.contains(genero)) {
            if (!this.genero.isEmpty()) {
                this.genero += "/";
            }
            this.genero += genero;
            anadido = true;
        }else{
            System.out.println("ERROR 0001: Esta películña ya posee el género que le deseas añadir.");
        }
        return anadido;
    }

    void informacion(){
        System.out.println("Pelicula");
        System.out.println("Título: " + getTitulo());
        System.out.println("Director " + getDirector());
        System.out.println("Año de lanzamiento " + getAnioLanzamiento());
        System.out.println("Género: " + getGenero());
        System.out.println("\n");
    }
}
