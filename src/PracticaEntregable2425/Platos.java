package PracticaEntregable2425;

public class Platos {
    private String nombre;
    private double precio;
    private CategoriaPlato categoria;
    private int stock;
    static int cantidadPlatos = 0;

    public Platos(String nombre, double precio, CategoriaPlato categoria, int stock) {
        this.nombre = nombre;

        if (precio >= 0.01 && precio<=999.99) {
            this.precio = precio;
        }else{
            System.out.println("ERROR 003: El precio introducido está fuera de los márgenes, se establece un precio de 3€.");
            this.precio = 3;
        }

        this.categoria = categoria;

        if (stock >= 1 && stock <= 1000){
            this.stock = stock;
        }else{
            System.out.println("ERROR 004: El stock introducido está fuera de los márgenes, se establece un stock de 3 unidades.");
        }
        cantidadPlatos++;
    }

    public Platos(String nombre, double  precio, int stock){
        this(nombre, precio, CategoriaPlato.Tapa, stock);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public CategoriaPlato getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    void datosPlato(){
        System.out.println("===DATOS DEL PLATO===");
        System.out.println("    Nombre del plato: " +getNombre());
        System.out.println("    Precio del plato: " +getPrecio());
        System.out.println("    Tipo de plato: " +getCategoria());
        System.out.println("    Stock disponible del plato: "+getStock());
    }

    void totalPlatos(){
        System.out.println("La cantidad de platos creados ha sido de "+ cantidadPlatos+ " platos");
    }
}

