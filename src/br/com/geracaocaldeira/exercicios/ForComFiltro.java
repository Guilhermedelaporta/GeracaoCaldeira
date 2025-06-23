package br.com.geracaocaldeira.exercicios;// Uso de for com filtro Qual será a saída?

import java.util.ArrayList;

public class ForComFiltro {

    public static void executar() {

        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Revisar código");

        for (String tarefa : tarefas){
            if (tarefa.contains("Java")) {
                System.out.println( " 15. Uso de for com filtro: " + "Tarefa de programação: " + tarefa);
            }
        }
    }
}
