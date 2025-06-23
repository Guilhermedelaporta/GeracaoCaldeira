package br.com.geracaocaldeira.exercicios;// Verificação de horário com LocalTime O que será impresso?

import java.time.LocalTime;

public class Horario {

    public static void executar() {

        LocalTime envio = LocalTime.of(23, 0);
        LocalTime limite = LocalTime.of( 22,59);

        if (!envio.isBefore(limite)) {
            System.out.println(" 13. Verificação de horário com LocalTime: Entrega fora do horário");
        } else {
            System.out.println(" 13. Verificação de horário com LocalTime: Tarefa enviada com sucesso");
        }

    }

}
