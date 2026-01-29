package PracticaEntregable2324EjercicioB;

public class Password {
    int longitud;
    String contrasenia;

    public Password() {
        this.longitud = 8;
        this.contrasenia = "";
    }

    public Password(String contrasenia){
        this();
        this.contrasenia = contrasenia;
    }
    //--------------GETTER Y SETTER------------------

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }


    //------------------MÉTODOS----------------------
    boolean esFuerte(){
        char comprobar = 0;
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for (int i = 0; i < this.contrasenia.length(); i++) {
            comprobar = this.contrasenia.charAt(i);
            if (comprobar >= 'a' && comprobar <= 'z'){
                minusculas++;
            }else if (comprobar >= 'A' && comprobar <= 'Z'){
                mayusculas++;
            }else if (Character.isDigit(comprobar)){
                numeros++;
            }
        }
        boolean esFuerte = false;

        if (mayusculas > 2 && minusculas > 1 && numeros > 5){
            esFuerte = true;
        }
        return esFuerte;
    }
}
