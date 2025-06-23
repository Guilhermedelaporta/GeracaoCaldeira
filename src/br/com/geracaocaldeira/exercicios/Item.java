package br.com.geracaocaldeira.exercicios;//Cadastro com sobrecarga, Qual será a saída?

public class Item {
    String nome;
    int quantidade;

    public Item(String nome) {
        this.nome = nome;
        this.quantidade = 1;
    }

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public static void executar() {
        Item x = new Item("Caderno");
        Item y = new Item("Caneta", 3);
        System.out.println(" 3. Cadastro com Sobrecarga a saída é: " + (x.quantidade + y.quantidade));
    }
}
