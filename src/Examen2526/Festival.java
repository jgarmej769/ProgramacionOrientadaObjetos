package Examen2526;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Festival {
    int numArtistas; //nunca mayor que 10
    String lugarCelebracion;
    LocalDate fecha;
    String codigo;
    static int ultimo_codigo = 1;
    int aforoPista;
    int aforoGrada;
    int aforoVIP;

    int entradasPista;
    int entradasGrada;
    int entradasVIP;

    int vendidasPista;
    int vendidasGrada;
    int vendidasVIP;

    Artista artistas[];
    static String promotor = "SONY_MUSIC";

    public Festival(String lugarCelebracion, LocalDate fecha, int numArtistas, int aforoPista, int aforoGrada, int aforoVIP){
        this.lugarCelebracion = lugarCelebracion;
        this.fecha = fecha;
        this.numArtistas = numArtistas;
        this.artistas = new Artista[numArtistas];
        this.aforoPista = aforoPista;
        this.aforoGrada = aforoGrada;
        this.aforoVIP = aforoVIP;

        this.entradasGrada = aforoGrada; //ponemos a la venta el mismo numero de entradas que de aforo
        this.entradasPista = aforoPista;
        this.entradasVIP = aforoVIP;

        this.vendidasPista = 0;
        this.vendidasGrada = 0;
        this.vendidasVIP = 0;

        if (ultimo_codigo > 10){
            String num = String.valueOf(ultimo_codigo);
            this.codigo = "FEST_00"+ num;
        }else{
            String num = String.valueOf(ultimo_codigo);
            this.codigo = "FEST_0"+ num;
        }
    }

    public Festival(String lugarCelebracion, LocalDate fecha){
        this(lugarCelebracion,fecha,5,100,100,100);
        this.lugarCelebracion = lugarCelebracion;
        this.fecha = fecha;
    }
    //-------METODOS PARA LA GESTIÓN DE ENTRADAS
    public boolean comprarEntradas(int numEntradas, TipoEntrada tipo){
        boolean ventaRealizada = false;
        switch (tipo){
            case Pista:
                if (numEntradas < this.entradasPista){ //comprobamos disponibilidad de entradas
                    this.entradasPista -= numEntradas; //en caso de haberlas, se retiran del monto actual y se devuelve true
                    this.vendidasPista += numEntradas;
                    ventaRealizada = true;
                }
                break;
            case Grada:
                if (numEntradas < this.entradasGrada){
                    this.entradasGrada -= numEntradas;
                    this.vendidasGrada += numEntradas;
                    ventaRealizada = true;
                }
                break;
            case VIP:
                if (numEntradas < this.entradasVIP){
                    this.entradasVIP -= numEntradas;
                    this.vendidasVIP += numEntradas;
                    ventaRealizada = true;
                }
                break;
            default:
                System.out.println("ERROR"); //default, lanzamos mensaje de error y no se realiza ninguna venta
                break;
        }
        return ventaRealizada;
    }

    void mostrarDisponibilidad(){
        System.out.println("\n=====DISPONIBILIDAD DE ENTRADAS POR ZONAS=====");
        System.out.println("    Pista: " + this.aforoPista + " entradas.");
        System.out.println("    Grada: " + this.aforoGrada + " entradas.");
        System.out.println("    VIP: "+ this.aforoVIP + " entradas.");
    }

    //-----------------MÉTODOS PARA LA GESTIÓN DE LOS ARTISTAS
    boolean buscarArtista (String nif){ //creamos un metodo para buscar si el artista ya ha sido añadidpo, buscando mediante su nif
        boolean encontrado = false;
        int i = 0;

        while (this.artistas[i] !=null && i < this.artistas.length && !encontrado){
            if (this.artistas[i].getNif().equals(nif)){
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

    boolean confirmarArtista (Artista artista){
        boolean confirmado = false;
        int i = 0;
        if (!buscarArtista(artista.getNif())){ //comprobamos que el artista no ha sido añadido ya
            while (i < this.artistas.length && !confirmado){
                if (this.artistas[i] == null){
                    this.artistas[i] = artista;
                    confirmado = true;
                }
                i++;
            }
        }

        return confirmado;
    }

    boolean confirmarArtista (Artista artista, int orden){
        boolean confirmado = false;
        if (!buscarArtista(artista.getNif())){ //nos aseguramos que el artista no haya sido añadido ya
            if (this.artistas[orden] == null){ //se comprueba que el hueco donde desea cantar esta vacio, si esta vacio, añadimos
                this.artistas[orden] = artista;
                confirmado = true;
            }else{ //si no está disponible el hueco, se comprueba si hay más adelante;
                int i = orden;
                while (i < this.artistas.length && !confirmado){
                    if (this.artistas[i] == null){
                        this.artistas[i] = artista;
                        confirmado = true;
                    }
                    i++;
                }

            }
        }

        return confirmado;
    }

    //----------MÉTODOS PARA LA INFORMACIÓN DEL FESTIVAL
    void mostrarCartelFestival(){
        System.out.println("=====CARTELERA DEL FESTIVAL "+ this.codigo +" POR ORDEN DE ACTUACIÓN=====");

        for (int i = 0; i < this.artistas.length; i++) {
            if (this.artistas[i] != null){
                System.out.println("Artista "+ (i+1));
                System.out.println("Nombre: "+this.artistas[i].getNombre());
                System.out.println("Discográfica: "+ this.artistas[i].getDiscografica());
                if (this.artistas[i].isEsGrupo()){
                    System.out.println("¡Este artista es un Grupo!");
                }else{
                    System.out.println("¡Este artista canta en Solitario");
                }
                System.out.println("***********************************************************************");
            }

        }
    }
    void mostrarCartelFestival (String discografica){
        System.out.println("=====ARTISTAS DEL FESTIVAL "+ this.codigo + " DE LA DISCOGRÁFICA "+ discografica+"=====");
        for (int i = 0; i < this.artistas.length; i++) {
            if (this.artistas[i].getDiscografica().equals(discografica)){
                System.out.println("Artista "+ (i+1));
                System.out.println("Nombre: "+this.artistas[i].getNombre());
                System.out.println("Discográfica: "+ this.artistas[i].getDiscografica());
                if (this.artistas[i].isEsGrupo()){
                    System.out.println("¡Este artista es un Grupo!");
                }else{
                    System.out.println("¡Este artista canta en Solitario");
                }
                System.out.println("***********************************************************************");
            }
        }
    }

    void mostrarDiasRestantes(){
        long diferenciaFecha = this.fecha.until(LocalDate.now(), ChronoUnit.DAYS);
        long diferenciaImprimir = -diferenciaFecha;
        System.out.println("El festival " + this.codigo + "se celebrará el " + this.fecha +" con lo que faltan " + diferenciaImprimir +" días.");
    }
}
