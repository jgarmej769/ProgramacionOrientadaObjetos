package PracticaEntregable2324Ejercicio1;

public class Cafetera {
    int cantidadMaxima;
    int cantidadActual;
    Persona duenio;

    Persona pepe = new Persona("Pepe");

    public Cafetera(){
        this.cantidadMaxima = 1;
        this.cantidadActual = 0;
        this.duenio = pepe;
    }

    public Cafetera(int cantidadMaxima, int cantidadActual, Persona duenio){
        this.cantidadMaxima = cantidadMaxima;
        if (cantidadActual >= this.cantidadMaxima){
            this.cantidadActual = this.cantidadMaxima;
        }else{
            this.cantidadActual = cantidadActual;
        }
        this.duenio = duenio;
    }

    void llenarCafetera(){
        this.cantidadActual = this.cantidadMaxima;
        System.out.println("¡La cafetera se ha llenado correctamente!");
    }

    void servirTaza(int cantidad){
        int cantidadRestante = (this.cantidadActual - cantidad);
        if (this.cantidadActual >= cantidad){
            this.cantidadActual -= cantidad;
            System.out.println("Su café se ha servido correctamente.");
        }else{
            System.out.println("No había suficiente café. Se ha servido la taza con los " + this.cantidadActual + " ml restantes.");
            this.cantidadActual = 0;
        }
    }

    void vaciarCafetera(){
        this.cantidadActual = 0;
        System.out.println("Su cafetera ha sido completamente vaciada.");
    }

    void agregarCafe(int cantidad){
        int nuevaCantidad = this.cantidadActual + cantidad;
        if (nuevaCantidad <= this.cantidadMaxima){
            this.cantidadActual = nuevaCantidad;
            System.out.println("¡Su café se ha agregado correctamente!");
        }else{
            int sobra = nuevaCantidad - this.cantidadMaxima;
            this.cantidadActual = this.cantidadMaxima;
            System.out.println("¡Cafetera llena! Han sobrado " + sobra + " unidades.");
        }
    }

    void mostrarCafeDisponible(){
        System.out.println("La cafetera de " + this.duenio.getNombre() + " tiene una capacidad de " + this.cantidadMaxima + " litros, y actualmente tiene " + this.cantidadActual +" litros de café");
    }
}
