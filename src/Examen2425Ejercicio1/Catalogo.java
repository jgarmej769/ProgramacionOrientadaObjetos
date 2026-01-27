package Examen2425Ejercicio1;

import java.util.Arrays;

public class Catalogo {
    Pelicula catalogo[];

    public Catalogo() {
        this.catalogo = new Pelicula[0];
    }

    boolean buscarPelicula(String titulo) {
        boolean encontrada = false;
        int i = 0;
        while (i < this.catalogo.length && !encontrada) {
            if (this.catalogo[i].getTitulo().equals(titulo)){
                encontrada = true;
            }
            i++;
        }
        return encontrada;
    }

    boolean agregarPelicula(Pelicula p) {
        boolean introducida = false;
        if (!buscarPelicula(p.getTitulo())) {
            this.catalogo = Arrays.copyOf(catalogo, catalogo.length + 1);
            this.catalogo[catalogo.length - 1] = p;
            introducida = true;
        } else {
            System.out.println("ERROR 002: La película que desea introducir ya se encuentra en el catálogo.");
        }
        return introducida;
    }

    void listaPeliculas() {
        for (int i = 0; i < this.catalogo.length; i++) {
            System.out.println("Pelicula #" + i);
            System.out.println("Título: " + this.catalogo[i].getTitulo());
            System.out.println("Director " + this.catalogo[i].getDirector());
            System.out.println("Año de lanzamiento " + this.catalogo[i].getAnioLanzamiento());
            System.out.println("Género: " + this.catalogo[i].getGenero());
            System.out.println("\n");
        }
    }

    Pelicula[] buscarLaPelicula(String cadenaABuscar, String campo) {
        Pelicula catalogoBusqueda[] = new Pelicula[0];
        int indice = 0;
        for (int i = 0; i < this.catalogo.length; i++) {
            Pelicula temporal = this.catalogo[i];
            boolean coincide = false;
            switch (campo.toUpperCase()){
                case "DIR":
                    if (this.catalogo[i].getDirector().toLowerCase().contains(cadenaABuscar)){
                        coincide = true;
                    }
                    break;
                case "TIT":
                    if (this.catalogo[i].getTitulo().toLowerCase().contains(cadenaABuscar)){
                        coincide = true;
                    }
                    break;
                case "GEN":
                    if (this.catalogo[i].getGenero().toLowerCase().contains(cadenaABuscar)){
                        coincide = true;
                    }
                    break;
                default:
                    System.out.println("Campo de búsqueda no válido");
                    break;
            }
            if (coincide){
                catalogoBusqueda = Arrays.copyOf(catalogoBusqueda, catalogoBusqueda.length + 1);
                catalogoBusqueda [catalogoBusqueda.length - 1] = temporal;
            }
        }
        return catalogoBusqueda;
    }
}