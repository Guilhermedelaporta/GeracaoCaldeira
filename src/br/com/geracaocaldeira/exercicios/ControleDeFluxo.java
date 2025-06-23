package br.com.geracaocaldeira.exercicios;//Controle de fluxo e operadores. O que será impresso?

public class ControleDeFluxo {

    public static void executar() {
        int prioridade = 4;
        int urgencia = 8;

        if (prioridade > 3 && urgencia > 7){
            System.out.println(" 4. Controle de fluxo e operadores será impresso: Tarefa crítica");
        } else if (prioridade > 3 || urgencia > 7){
            System.out.println(" 4. Controle de fluxo e operadores será impresso: Tarefa importante");
        } else {
            System.out.println(" 4. Controle de fluxo e operadores será impresso: Tarefa comum");
        }
    }

}
