package PracticaEntregable2425;

import java.time.LocalDate;

public class Empleado {

    private String nombreCompleto;
    private int numIdentificativo;
    private int telefono;
    private LocalDate fechaContrato;
    private TipoEmpleado tipoEmpleado;
    static int ultimo_codigo = 1;


    public Empleado(String nombreCompleto, int telefono, LocalDate fechaContrato, TipoEmpleado tipoEmpleado ) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.fechaContrato = fechaContrato;
        this.tipoEmpleado = tipoEmpleado;
        this.numIdentificativo = ultimo_codigo;
        ultimo_codigo++;
    }

    public Empleado(String nombreCompleto, int telefono, LocalDate fechaContrato) {
        this(nombreCompleto, telefono, fechaContrato, TipoEmpleado.Camarero);
    }

    public Empleado(String nombreCompleto, int telefono) {
        this(nombreCompleto,telefono,LocalDate.now());//en caso de no especificarse, se cuenta como contratado hoy;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getNumIdentificativo() {
        return numIdentificativo;
    }

    public int getTelefono() {
        return telefono;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    void datosEmpleado(){
        System.out.println("===DATOS DEL EMPLEADO===");
        System.out.println("    Nombre Completo: "+ getNombreCompleto());
        System.out.println("    Número de identificación: "+ getNumIdentificativo());
        System.out.println("    Teléfono: "+ getTelefono());
        System.out.println("    Fecha de contratación: "+ getFechaContrato());
        System.out.println("    Puesto de trabajo: "+ getTipoEmpleado());
    }

    void cantidadEmpleados(){
        System.out.println("El restaurante ha contrato un total de "+ ultimo_codigo +" empleados");
    }
}
