package br.com.geracaocaldeira.exercicios;//Construção de classes e métodos, Qual será a saída?

public class Livro {
    String titulo;
    boolean emprestado;

    public void emprestar() {
        emprestado = true;
    }

    public String status() {
        if (emprestado){
            return " Indisponível";
        }
        return " Disponível/";
    }

    public static void executar() {
        Livro livro1 = new Livro();
        livro1.titulo = "Java para iniciantes";

        System.out.println(livro1.status());

        livro1.emprestar();

        System.out.println(livro1.status());
    }
}
