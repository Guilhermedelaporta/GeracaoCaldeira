package br.com.geracaocaldeira.exercicios;//Qual será o valor final de notificações?

public class Notificacoes {

    public static void executar() {

        int notificacoes = 0;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                notificacoes += 2;
            } else {
                notificacoes++;
            }
        }

        System.out.println(" 5. O valor final de notificações é: " + notificacoes);
    }

}