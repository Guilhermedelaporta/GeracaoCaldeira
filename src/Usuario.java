//Construtores e instâncias, Qual das opções instancia corretamente um objeto da classe Usuario?

public class Usuario {
    String nome;
    int idade;

    public Usuario(String n, int i){
        nome = n;
        idade = i;
    }
    public static void main(String[] args){
        Usuario usuario1 = new Usuario("Guilherme De La Porta Martins", 23);
        System.out.println("Nome: " + usuario1.nome);
        System.out.println("Idade: " + usuario1.idade + " Anos");
    }
}
