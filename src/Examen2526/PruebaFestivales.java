package Examen2526;

import java.time.LocalDate;
import java.util.Arrays;

public class PruebaFestivales {
    public static void main(String[] args) {
        Artista artista1 = new Artista("Los Chichos","111111H",1990,"SevillaMusic",true);
        Artista artista2 = new Artista("Manolo Escobar","12345678H",1995,"SevillaMusic",false);
        Artista artista3 = new Artista("Victor Losada","25632156J",2004,"MusicaDestripada",false);
        Artista artista4 = new Artista("Extremoduro","56874230",1954,"LaMusik",true);
        Artista artista5 = new Artista ("CaliBoys","87654321L",2000,"SevillaMusic",true);

        Festival f1 = new Festival("Sevilla",LocalDate.of(2026,10,14),4,100,40,20);
        Festival f2 = new Festival("Morón", LocalDate.of(2026,2,15));
        Festival f3 = new Festival("Chiclana",LocalDate.of(2026,8,14),5,200,150,75);

        //cargamos los arrays solicitados
        Festival festivales[] = new Festival[3];
        festivales[0] = f1;
        festivales[1] = f2;
        festivales[2] =f3;

        Artista artistasFestivales[] = new Artista[5];
        artistasFestivales[0] = artista1;
        artistasFestivales[1] = artista2;
        artistasFestivales[2] = artista3;
        artistasFestivales[3] = artista4;
        artistasFestivales[4] = artista5;

        //Añadimos al primer festival los diversos artistas
        f1.confirmarArtista(artista1);
        f1.confirmarArtista(artista3,2);
        f1.confirmarArtista(artista4,2); //lo ponemos en el mismo sitio que el anterior, por lo que debería situarlo en el puesto 4
        //mostramos información para ver que se han introducido correctamente
        f1.mostrarCartelFestival();
        f1.mostrarDiasRestantes();
        f1.comprarEntradas(60,TipoEntrada.Pista);
        f1.comprarEntradas(30,TipoEntrada.Grada);
        f1.comprarEntradas(10,TipoEntrada.VIP);

        //Añadimos al segundo y tercer festival los artistas y comprobamos
        f2.confirmarArtista(artista5);
        f2.confirmarArtista(artista2);
        f2.confirmarArtista(artista4, 4);
        f2.confirmarArtista(artista1);
        f2.mostrarCartelFestival();
        f2.mostrarDiasRestantes();
        f2.comprarEntradas(50,TipoEntrada.Pista);
        f2.comprarEntradas(20,TipoEntrada.VIP);

        System.out.println(contarFestivalesArtistas(artista3,festivales));
        obtenerArtistasComunes(f1,f2);
        festivalMasVendido(festivales);

    }

    public static int contarFestivalesArtistas(Artista artista, Festival festivales[]){
        int cantidadFestivales = 0;
        for (int i = 0; i < festivales.length; i++) {
            if (festivales[i].buscarArtista(artista.getNif())){
                cantidadFestivales++;
            }
        }
        return cantidadFestivales;
    }

    public static  Artista[] obtenerArtistasComunes (Festival f1, Festival f2){
        Artista lista[] = new Artista[0];
        Festival mayor = null;
        Festival menor = null;
        if (f1.artistas.length >= f2.artistas.length){
            mayor = f1;
            menor = f2;
        }else{
            mayor = f2;
            menor = f1;
        }
        for (int i = 0; i < mayor.artistas.length; i++) {
            for (int j = 0; j < menor.artistas.length; j++) {
                if (mayor.artistas[i] != null && menor.artistas[j] != null && mayor.artistas[i].getNif().equals(menor.artistas[j].getNif())){
                    int indice = 0;
                    lista = Arrays.copyOf(lista, lista.length + 1);
                    lista[indice] = mayor.artistas[i];
                    indice++;
                }
            }
        }
        return lista;
    }

    public static Festival festivalMasVendido (Festival festivales[]){
        Festival temporal = null;
        int entradasVendidas = 0;

        for (int i = 0; i < festivales.length; i++) {
            int entradasFestival = (festivales[i].vendidasPista + festivales[i].vendidasGrada + festivales[i].vendidasVIP);
            if (entradasFestival > entradasVendidas){
                entradasVendidas = entradasFestival;
                temporal = festivales[i];
            }
        }
        return temporal;
    }
}
