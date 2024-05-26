package com.fiap.challenge.fila.dominio.entidades;

import com.fiap.challenge.fila.dominio.entidades.atividade.Atividade;
import com.fiap.challenge.fila.dominio.entidades.evento.Evento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Usuario {
    private UUID id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private LocalDateTime dataRegistro;
    private LocalDateTime ultimoLogin;
    private String tipo;
    private List<Atividade> participacoes;
    private List<Evento> eventosOrganizados;


    public Usuario(String nome, String cpf, String email, String senha) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.dataRegistro = LocalDateTime.now();

        this.participacoes = new ArrayList<Atividade>();
    }

    public String getNome() {
        return nome;
    }


    public List<Atividade> getParticipacoes() {
        return participacoes;
    }

    public void setParticipacao(Atividade atividadesInscritas) {
        this.participacoes.add(atividadesInscritas);
    }
}
