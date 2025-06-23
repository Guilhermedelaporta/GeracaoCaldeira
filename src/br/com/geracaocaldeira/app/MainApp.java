package br.com.geracaocaldeira.app;

import br.com.geracaocaldeira.exercicios.*;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.println("Digite a sua opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> Agendamento.executar();
                case 2 -> Avaliacao.executar();
                case 3 -> Item.executar();
                case 4 -> ControleDeFluxo.executar();
                case 5 -> Notificacoes.executar();
                case 6 -> Array.executar();
                case 7 -> Livro.executar();
                case 8 -> Usuario.executar();
                case 9 -> System.out.println("git reset --mixed HEAD~1");
                case 10 -> System.out.println("git checkout Calculadora.java");
                case 11 -> Datas.executar();
                case 12 -> DiasUteis.executar();
                case 13 -> Horario.executar();
                case 14 -> Tarefa.executar();
                case 15 -> ForComFiltro.executar();

                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Digite um número válido.");

            }

        } while (opcao !=0);

            scanner.close();
    }

    public static void exibirMenu() {

        System.out.println("╔════════════════════════════════════════════════════╗");
        System.out.println("║            🌟 MENU DE RESPOSTAS - JAVA 🌟          ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║  1. Sistema de Agendamento                         ║");
        System.out.println("║  2. Plataforma de Estudos                          ║");
        System.out.println("║  3. Cadastro com Sobrecarga                        ║");
        System.out.println("║  4. Controle de Fluxo e Operadores                 ║");
        System.out.println("║  5. Valor final de Notificações                    ║");
        System.out.println("║  6. Saída com ArrayList                            ║");
        System.out.println("║  7. Construção de Classes e Métodos                ║");
        System.out.println("║  8. Construtores e Instâncias                      ║");
        System.out.println("║  9. Git no Fluxo de Trabalho                       ║");
        System.out.println("║ 10. Controle de Versão                             ║");
        System.out.println("║ 11. Datas com java.time                            ║");
        System.out.println("║ 12. Cálculo de Dias Úteis                          ║");
        System.out.println("║ 13. Verificação de Horário com LocalTime           ║");
        System.out.println("║ 14. Ordenação com Comparable                       ║");
        System.out.println("║ 15. Uso de For com Filtro                          ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.println("║  0. Sair                                           ║");
        System.out.println("╚════════════════════════════════════════════════════╝");
    }

}
