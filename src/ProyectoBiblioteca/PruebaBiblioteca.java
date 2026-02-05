package ProyectoBiblioteca;

public class PruebaBiblioteca {
    public static void main(String[] args){
        //1. Creo un primer libro y muestro su información
        System.out.println("**** CASO 1 ****");
        Libro libro1=new Libro("J.K. Rowling","Harry Potter y la piedra filosofal");
        System.out.println(libro1.obtenerInformacion());

        //2. Registro la venta de 10000 libros y muestro de nuevo su información
        System.out.println("**** CASO 2 ****");
        libro1.registrarVenta(10000);
        System.out.println(libro1.obtenerInformacion());

        //3. Creo un segundo libro y registro 20000 ejemplares vendidos
        System.out.println("**** CASO 3 ****");
        Libro libro2=new Libro("J.K. Rowling","Harry Potter y la cámara secreta");
        libro2.registrarVenta(20000);
        System.out.println(libro2.obtenerInformacion());

        //4. Muestro la precuela y secuela de los libros creados
        System.out.println("**** CASO 4 ****");
        System.out.println(libro1.obtenerTituloPrecuela());
        System.out.println(libro1.obtenerTituloSecuela());
        System.out.println(libro2.obtenerTituloPrecuela());
        System.out.println(libro2.obtenerTituloSecuela());
        libro1.mostrarResumenSaga();

        //5. Añado el segundo libro como secuela del primero y muestro de nuevo la información
        System.out.println("**** CASO 5 ****");
        libro1.anadirSecuela(libro2);

        System.out.println(libro1.obtenerTituloPrecuela());
        System.out.println(libro1.obtenerTituloSecuela());
        System.out.println(libro2.obtenerTituloPrecuela());
        System.out.println(libro2.obtenerTituloSecuela());

        //6. Muestro información de la saga del libro 1
        System.out.println("**** CASO 6 ****");
        libro1.mostrarResumenSaga();

        //7. Muestro información de la saga del libro 2
        System.out.println("**** CASO 7 ****");
        libro2.mostrarResumenSaga();

        //8. Obtengo el array con los libros de la saga del libro2 y muestro su información
        System.out.println("**** CASO 8 ****");
        Libro[] saga=libro2.obtenerSaga();
        for (int i=0;i<saga.length;i++){
            System.out.println("El libro " + (i+1) + " de la saga es: " + saga[i].obtenerInformacion());
        }

        //9. Creo un tercer libro y registro 50000 ejemplares vendidos y muestro la información de su saga
        //En este caso el libro está aún en solitario
        System.out.println("**** CASO 9 ****");
        Libro libro3=new Libro("J.K. Rowling","Harry Potter y El prisionero de Azkaban");
        libro3.registrarVenta(50000);
        libro3.mostrarResumenSaga();

        //10. Añado el tercer libro com secuela del segundo y muestro la información de la saga del tercer libro
        System.out.println("**** CASO 10 ****");
        libro2.anadirSecuela(libro3);
        libro3.mostrarResumenSaga();

        //11. Muestro de nuevo la información de las sagas de los libros 1 y 2 y vemos que ha actualizado la información
        System.out.println("**** CASO 11 ****");
        libro1.mostrarResumenSaga();
        libro2.mostrarResumenSaga();

        //12. Obtengo el array con los libros de la saga del libro1 y muestro su información
        System.out.println("**** CASO 12 ****");
        Libro[] sagaNueva = libro1.obtenerSaga();
        for (int i=0;i<sagaNueva.length;i++){
            System.out.println("El libro " + (i+1) + " de la saga es: " + sagaNueva[i].obtenerInformacion());
        }
    }
}