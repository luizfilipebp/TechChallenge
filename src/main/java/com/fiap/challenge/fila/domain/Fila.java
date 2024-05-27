package com.fiap.challenge.fila.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class Fila {

    private Integer id;
    private String nome;
    private Integer capacidadeMaxima;
    private List<Usuario> usuarios;
    private LocalDateTime entrada;
    private Atividade atividade;
    private String status;
}
