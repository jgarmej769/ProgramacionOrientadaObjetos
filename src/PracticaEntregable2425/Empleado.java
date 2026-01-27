package PracticaEntregable2425;

import java.time.LocalDate;

public class Empleado {
    private String nombreCompleto;
    private int numIdentificativo;
    private int telefono;
    private LocalDate fechaContrato;
    private String tipo; //camarero, cocinero, gerente y responsable

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getNumIdentificativo() {
        return numIdentificativo;
    }
}
