package br.com.geracaocaldeira.exercicios;//Ordenação de tarefas com Comparable, Qual será a saída após a ordenação?

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tarefa implements Comparable<Tarefa> {
    String titulo;

    public Tarefa(String titulo){
        this.titulo = titulo;
    }

    public int compareTo(Tarefa outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    @Override
    public String toString() {
        return titulo;
    }

    public static void executar() {
        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(new Tarefa("Estudar"));
        tarefas.add(new Tarefa("Almoçar"));
        tarefas.add(new Tarefa("Dormir"));
        Collections.sort(tarefas);
        System.out.println(" 14. Ordenação de tarefas com comparable: " + tarefas);
    }
}
