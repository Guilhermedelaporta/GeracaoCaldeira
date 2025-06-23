package br.com.geracaocaldeira.exercicios;//Construtores e instâncias, Qual das opções instancia corretamente um objeto da classe br.com.geracaocaldeira.exercicios.Usuario?

public class Usuario {
    String nome;
    int idade;

    public Usuario(String n, int i){
        nome = n;
        idade = i;
    }
    public static void executar() {
        Usuario usuario1 = new Usuario("Guilherme De La Porta Martins", 23);
//        System.out.println("Nome: " + usuario1.nome);
//        System.out.println("Idade: " + usuario1.idade + " Anos");
        System.out.println("Usuario u = new Usuario(\"João\", 25);");
    }
}
