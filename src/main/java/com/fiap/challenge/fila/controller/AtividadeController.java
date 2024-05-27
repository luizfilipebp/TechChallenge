package com.fiap.challenge.fila.controller;

import com.fiap.challenge.fila.domain.Atividade;
import com.fiap.challenge.fila.domain.Evento;
import com.fiap.challenge.fila.service.AtividadeService;
import com.fiap.challenge.fila.service.AtividadeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AtividadeController {

    Logger log = LoggerFactory.getLogger(AtividadeController.class);

    @Autowired
    AtividadeService atividadeService;

    @GetMapping("/lista-atividades/")
    public ResponseEntity<List<Atividade>> listaAtividades() {
        log.info("listando atividades do evento {}");

        Evento evento = new Evento();
        evento.setNome("Anime Friends");
        evento.setDescricao("Evento de animes, mangas e cultura pop");

        return ResponseEntity.ok().body(atividadeService.obterTodasAsAtividadesDoEvento(evento));
    }

    @GetMapping("/lista-atividades/{event}")
    public ResponseEntity<List<Atividade>> listaAtividades(@PathVariable String event) {
        log.info("listando atividades do evento {}", event);

        Evento evento = new Evento();
        evento.setNome(event);

        return ResponseEntity.ok().body(atividadeService.obterTodasAsAtividadesDoEvento(evento));
    }
}
