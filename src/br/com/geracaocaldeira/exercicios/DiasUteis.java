package br.com.geracaocaldeira.exercicios;//Cálculo de dias úteis com LocalDate, Qual será a sata impressa?

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiasUteis {

    public static void executar() {

        LocalDate data = LocalDate.of(2025,6, 10);
        int diasUteis = 0;

        while (diasUteis < 7){
            data = data.plusDays(1);
            boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;

            boolean feriado = data.equals(LocalDate.of(2025,6,15));

            if (!fimDeSemana && !feriado) {
                diasUteis++;
            }
        }
        System.out.println(" 12. Calculo de dias úteis com LocalDate: " + (data));

    }

}
