package PracticaEntregable2324Ejercicio1;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private double peso;
    private double altura;
    private final String genero = "H";

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.peso = 0;
        this.altura = 0;
    }
    public Persona(String nombre){
        this();
        this.nombre = nombre;
    }
    public Persona (String nombre, int edad, String dni, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    int calcularMC(){

        double indiceMasa = this.peso / (this.altura * this.altura);
        int estado;
        if ( indiceMasa < 20){
            estado = -1; //poco peso
        }else if (indiceMasa >= 20 && indiceMasa <= 25){
            estado = 0; //peso ideal
        }else {
            estado = 1; // sobrepeso
        }
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

}
