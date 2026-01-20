package Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Agenda agenda = new Agenda();
        System.out.println("==BIENVENIDO A SU AGENDA 2.0==");
        boolean continuar = true;
        do {
            Scanner sc = new Scanner(System.in);
            menuInicio();
            int seleccion = sc.nextInt();
            switch (seleccion){
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nom = sc.next();
                    System.out.println("Ingrese el teléfono: ");
                    String tlf = sc.next();

                    Contacto nuevoContacto = new Contacto(nom , tlf);
                    if (agenda.insertarContacto(nuevoContacto)) {
                        System.out.println("¡Enhorabuena! El contacto se ha añadido correctamente.");
                    }
                    break;

                case 2:
                    System.out.println("Introduzca el teléfono que desea buscar:  ");
                    String telefonoBuscar = sc.next();

                    if (agenda.contactoExiste(telefonoBuscar)){
                        agenda.informacionContacto(agenda.buscarContactoTelefono(telefonoBuscar));
                    }
                    break;

                case 3:
                    agenda.mostrarAgendaOrdenada();
                    break;

                default:
                    System.out.println("Volviendo al menú de inicio...");
            }

            System.out.println("¿Desea realizar alguna otra opción?: \n1.Sí (Continuar)\n2.No (Salir)");
            int seguir = sc.nextInt();
            if (seguir != 1){
                continuar = false;
            }
        }while (continuar);


    }

    public static void menuInicio (){
        System.out.println("A continuación, seleccione la acción que desea realizar:");
        System.out.println("\n1.AGREGAR CONTACTO\n2.BUSCAR UN CONTACTO MEDIANTE SU TELÉFONO\n3.MOSTRAR TODOS LOS CONTACTOS");
    }
    public static void agregarContacto(){

    }

}
