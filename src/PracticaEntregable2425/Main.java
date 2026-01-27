package PracticaEntregable2425;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Restaurante garcia = new Restaurante("garcia");

        Platos plato1 = new Platos("Carrilleras", 5.5,10);
        Platos plato2 = new Platos("Patatas con huevo", 6.8, CategoriaPlato.Media_Racion, 8);
        Platos plato3 = new Platos("Percebes", 60, CategoriaPlato.Racion,5);

        Empleado empleado1 = new Empleado("Juan Garcia", 674847231,LocalDate.of(2024,8,14),TipoEmpleado.Gerente);
        Empleado empleado2 = new Empleado("Ceres Valcárcel", 655248205, LocalDate.of(2025,2,11), TipoEmpleado.Responsable);
        Empleado empleado3 = new Empleado("Maria Jose",682878732);

        //Añadimos el primer plato y sacamos la lista de platos
        garcia.insertarPlato(plato1);
        garcia.mosotrarMenu();

        garcia.insertarPlato(plato1); //provocamos el error 001

        //Añadimos el resto
        garcia.insertarPlato(plato2);
        garcia.insertarPlato(plato3);
        garcia.mosotrarMenu();

        //Visualizamos el Stock
        garcia.mostrarStock();
        //Introducimos un empleado y comprobamos
        garcia.anadirEmpleado(empleado1);
        garcia.mostarEmpleados();

        //Introducimos todos los demás
        garcia.anadirEmpleado(empleado2);
        garcia.anadirEmpleado(empleado3);
        garcia.anadirEmpleado(empleado1); //provocamos el error 002
        garcia.mostarEmpleados(); //mostramos todos los empleados y su informacion

        garcia.eliminarEmpleado(3); //eliminamos un empleado
        garcia.mostarEmpleados();

        //creamos otro empleado para comprobar que su código identificativo es 4, pero hay 3 empleados
        Empleado empleado4 = new Empleado("Juan Antonio", 629547155);
        garcia.mostarEmpleados();;

        //mostramos detalles de un empleado unitario
        empleado4.datosEmpleado();

        //mostramos los datos de un plato unitario
        plato3.datosPlato();
    }
}
