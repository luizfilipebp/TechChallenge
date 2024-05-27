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
public class Evento {

    @Getter
    private Integer eventoId;
    private String nome;
    private LocalDateTime data;
    private String endereco;
    private String descricao;
    private String organicacao;
    private Integer capacidade;
    private List<Usuario> usuario;
}


