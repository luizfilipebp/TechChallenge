package com.fiap.challenge.fila.service;

import com.fiap.challenge.fila.domain.Atividade;
import com.fiap.challenge.fila.domain.Evento;
import com.fiap.challenge.fila.domain.StatusAtividade;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AtividadeServiceImpl implements  AtividadeService{

    @Override
    public List<Atividade> obterTodasAsAtividadesDoEvento(Evento evento){
        //TODO: obter de um repository

        List<Atividade> atividades = new ArrayList<>();

        Atividade atividade1 = new Atividade();
        atividade1.setNome("Autografo com o Joaquin Phoenix");
        atividade1.setDescricao("Terá uma fila para pessoas que desejam tirar foto com o ator");
        //**Quantidade de pessoas que ficarão em um lobby/sala de espera até a próxima ser chamada
        atividade1.setLotacao(6);
        atividade1.setStatus(StatusAtividade.ATIVA);
        atividade1.setInicio(LocalDateTime.of(2024, 10, 27, 13, 30));
        atividade1.setFim(LocalDateTime.of(2024, 10, 27, 18, 30));
        atividade1.setEvento(evento);

        Atividade atividade2 = new Atividade();
        atividade2.setNome("Luta de Sabres de Luz");
        atividade2.setDescricao("Uma batalha supervisionada onde as pessoas se fantasiam e lutam com sabres digitais");
        //Quantidade de pessoas que ficarão em um lobby/sala de espera até a próxima ser chamada
        atividade2.setLotacao(10);
        //**Quando não tem data irá usar a data de inicio/fim do próprio evento
        atividade2.setStatus(StatusAtividade.ATIVA);
        atividade2.setEvento(evento);

        Atividade atividade3 = new Atividade();
        atividade3.setNome("Desviar de tiros de papel");
        atividade3.setDescricao("A pessoa terá que desviar de tiros de papel(simulando o Bojji de Ranking of kings) e ganhar brindes de acordo com sua pontuação");
        //**Quantidade de pessoas que ficarão em um lobby/sala de espera até a próxima ser chamada
        atividade3.setLotacao(10);
        atividade3.setStatus(StatusAtividade.ATIVA);
        atividade3.setEvento(evento);


        atividades.add(atividade1);
        atividades.add(atividade2);
        atividades.add(atividade3);

        return atividades;
    }

}
