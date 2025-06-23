package br.com.geracaocaldeira.exercicios;//Qual será a saída?

import java.util.ArrayList;

public class Array {
    public static void executar() {

        ArrayList<String> horarios = new ArrayList<>();

        horarios.add("08:00");
        horarios.add("10:00");
        horarios.add("12:00");
        horarios.remove(1);
        horarios.add("14:00");

        System.out.println(" 6. A saída é: " + (horarios.get(1)));

    }
}
