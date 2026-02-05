package ProyectoBiblioteca;

import java.util.Arrays;

public class Libro {
    private String autor;
    private String titulo;
    private int ejemplaresVendidos;
    private Libro secuela;
    private Libro precuela;

    public Libro(String autor,String titulo){
        this.autor=autor;
        this.titulo=titulo;
        this.ejemplaresVendidos=0;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEjemplaresVendidos() {
        return ejemplaresVendidos;
    }

    public Libro getSecuela() {
        return secuela;
    }

    public Libro getPrecuela() {
        return precuela;
    }

    public String obtenerInformacion(){
        return "El libro " + this.titulo + " pertenece a " + this.autor + " y ha vendido un total de: " + this.ejemplaresVendidos + " ejemplares";
    }

    public void registrarVenta(int ejemplares){
        this.ejemplaresVendidos+=ejemplares;
    }

    public String obtenerTituloPrecuela(){
        String precuelaBuscada;
        if (this.precuela!=null){
            precuelaBuscada=this.precuela.getTitulo();
        }else{
            precuelaBuscada="<NINGUNA>";
        }
        return "La precuela de " + this.titulo + " es: " + precuelaBuscada;
    }

    public String obtenerTituloSecuela(){
        String secuelaBuscada;
        if (this.secuela!=null){
            secuelaBuscada=this.secuela.getTitulo();
        }else{
            secuelaBuscada="<NINGUNA>";
        }
        return "La secuela de " + this.titulo + " es: " + secuelaBuscada;
    }

    public void mostrarResumenSaga(){
        Libro[] saga=this.obtenerSaga();
        int posicion=0;
        int contadorEjemplares=0;
        for (int i=0;i<saga.length;i++){
            contadorEjemplares += saga[i].getEjemplaresVendidos();
            if (saga[i].getTitulo().equals(this.titulo)){
                posicion=i+1;
            }
        }
        System.out.println("El libro " + this.titulo + " es el libro número " + posicion + " de una saga que tiene un total de " + saga.length + " libros. Entre todos han vendido un total de: " + contadorEjemplares + " ejemplares.");
    }

    public void anadirPrecuela(Libro lprecuela){
        this.precuela=lprecuela;
        lprecuela.secuela=this;
    }

    public void anadirSecuela(Libro lsecuela){
        this.secuela=lsecuela;
        lsecuela.precuela=this;
    }

    public Libro[] obtenerSaga(){
        Libro[] librosSaga=new Libro[0];
        if (this.precuela==null && this.secuela==null){
            librosSaga=Arrays.copyOf(librosSaga,librosSaga.length+1);
            librosSaga[librosSaga.length-1]=this;
        }else{
            Libro libro=this;
            while(libro.precuela!=null){
                libro=libro.precuela;
            }

            librosSaga=Arrays.copyOf(librosSaga,librosSaga.length+1);
            librosSaga[librosSaga.length-1]=libro;

            while (libro.secuela!=null){
                librosSaga=Arrays.copyOf(librosSaga,librosSaga.length+1);
                librosSaga[librosSaga.length-1]=libro.secuela;
                libro=libro.secuela;
            }
        }
        return librosSaga;
    }
}