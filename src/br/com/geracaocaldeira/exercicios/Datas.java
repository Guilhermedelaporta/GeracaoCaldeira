package br.com.geracaocaldeira.exercicios;//Manipulação de datas com Java.time. Qual será a data impressa?

import java.time.LocalDate;

public class Datas {

    public static void executar() {
        LocalDate hoje = LocalDate.of(2025, 6, 9);
        LocalDate prazo = hoje.plusDays(10);

        System.out.println(" 11. Manipulação de datas: " + (prazo));
    }

}
