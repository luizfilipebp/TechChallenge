package com.fiap.challenge.fila.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class Usuario {

    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private LocalDateTime dataRegistro;
    private LocalDateTime ultimoLogin;
    private String tipo;
    private List<Atividade> atividadesInscritas;
    private List<Evento> eventosOrganizados;
}
