package com.fiap.challenge.fila.service;

import com.fiap.challenge.fila.domain.Atividade;
import com.fiap.challenge.fila.domain.Evento;

import java.util.List;

public interface AtividadeService {

    List<Atividade> obterTodasAsAtividadesDoEvento(Evento evento);
}
