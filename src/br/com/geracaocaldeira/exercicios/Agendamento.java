package br.com.geracaocaldeira.exercicios;//Sistema de br.com.geracaocaldeira.exercicios.Agendamento Qual será a saída?

import java.time.LocalDate;

public class Agendamento {
    public static void executar() {

        LocalDate base = LocalDate.of(2025, 6, 1);

        int dias = 7;

        LocalDate novaData = base.plusDays(dias * 2 - 3);

        System.out.println(" 1. Sistema de Agendamento a saída é: " + novaData.getDayOfMonth());
    }
}
