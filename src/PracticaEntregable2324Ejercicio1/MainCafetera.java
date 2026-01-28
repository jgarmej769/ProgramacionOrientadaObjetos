package PracticaEntregable2324Ejercicio1;

public class MainCafetera {
    public static void main(String[] args) {

        Persona ceres = new Persona("Ceres");

        Cafetera c1 = new Cafetera(); //cafetera de pepe, con 0 litros y una capacidad máxima de 1 litro
        Cafetera c2 = new Cafetera(14,3,ceres); //cafetera de ceres, 14 litros de maximo y 3 actuales

        c1.mostrarCafeDisponible();
        c2.mostrarCafeDisponible();
        System.out.println(); //imprimimos cafés actuales;

        c1.llenarCafetera(); //llenamos la cafetera de pepe
        c2.vaciarCafetera(); //vaciamos la de ceres
        c1.mostrarCafeDisponible();
        c2.mostrarCafeDisponible(); //mostramos info
        System.out.println();

        c1.llenarCafetera(); //llenamos cafetera de ceres
        c1.servirTaza(13); //servimos una taza de 13 litros
        c2.servirTaza(1); //servimos una taza de 1 litro de la de pepe (se vacia)
        c1.mostrarCafeDisponible();
        c2.mostrarCafeDisponible(); //mostramos informacion
        System.out.println();

        c1.servirTaza(2); //intentamos servirla con 2 litros y debe dar error
        c1.agregarCafe(25); //la llenamos para que sobre
        c2.agregarCafe(1);
        c1.mostrarCafeDisponible();
        c2.mostrarCafeDisponible();//pedimos info
    }
}
