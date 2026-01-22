package TiempoRecreo;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime horaRecreo = LocalTime.of(11,30,0);

        LocalTime ahora = LocalTime.now();

        int diferenciaSegundos = horaRecreo.toSecondOfDay() - ahora.toSecondOfDay();

        if (diferenciaSegundos <0 ){
            System.out.println("El recreo de hoy ya ha pasado, vuelva mañana");
        }else{
            int horas = diferenciaSegundos / 3600;
            int minutos = (diferenciaSegundos % 3600) / 60;
            int segundos = diferenciaSegundos % 60;

            System.out.println("\n\nQuedan para el recreo "+horas+" horas, "+minutos+" minutos "+"y "+segundos+" segundos, y par kely");
        }
    }
}
