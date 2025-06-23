package br.com.geracaocaldeira.exercicios;//Plataforma de estudos, Qual será a saída?

public class Avaliacao {
    public static void executar() {

        int nota = 7;

        int peso = 2;

        double media = (nota * peso + 6 * 3 ) / 5;

        if (media >= 7.0){
            System.out.println(" 2. Plataforma de estudos a saída é: Aprovado");
        } else {
            System.out.println(" 2. Plataforma de estudos a saída é: Revisar conteúdo");
        }

    }
}
