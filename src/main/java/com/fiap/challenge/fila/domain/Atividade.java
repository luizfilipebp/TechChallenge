package com.fiap.challenge.fila.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Atividade{

    private Integer id;
    private String nome;
    private String descricao;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Integer setor;
    private Integer estande;
    private String responsavel;
    private List<Usuario> participantes;
    private List<String> recursos;
    private Integer lotacao;
    private StatusAtividade status;
    private String codigoQRcode;
    private Fila fila;
    private Evento evento;
}

