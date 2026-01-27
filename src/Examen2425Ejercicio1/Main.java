package Examen2425Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Pelicula peli1 = new Pelicula("Titanic","James Cameron",1997,"Drama/Romance");
        Pelicula peli2 = new Pelicula("Inception", "Christopher Nolan", 2010, "Ciencia Ficcion/Thriller");

        Catalogo cat1 = new Catalogo();

        cat1.agregarPelicula(peli1);
        cat1.agregarPelicula(peli2);

        cat1.listaPeliculas();

        cat1.buscarLaPelicula("Nolan","DIR");

    }
}