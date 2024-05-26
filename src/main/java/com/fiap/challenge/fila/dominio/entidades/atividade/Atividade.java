package com.fiap.challenge.fila.dominio.entidades.atividade;

import com.fiap.challenge.fila.dominio.entidades.Fila;
import com.fiap.challenge.fila.dominio.entidades.Usuario;
import com.fiap.challenge.fila.dominio.entidades.evento.Evento;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Atividade {
    private UUID id;
    private String nome;
    private Evento evento;
    private String descricao;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private Integer setor;
    private Integer estande;
    private String responsavel;
    private Integer lotacao;
    private Fila fila;
    private List<Usuario> participantes;
    private List<String> recursos;

    public Atividade(String nome, Evento evento, LocalTime horaInicio, LocalTime horaFim, Integer lotacao, Fila fila) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.evento = evento;
        this.horaInicio = validaHoraInicio(horaInicio);
        this.horaFim = validaHoraTermino(horaFim);
        this.lotacao = lotacao;
        this.fila = fila;

        this.participantes = new ArrayList<Usuario>();
    }

    public void entrarAtividade(Usuario usuario) {
        if (this.participantes.size() == this.lotacao) {
            this.fila.entrarFila(usuario);
            System.out.println(usuario.getNome() + " entrou na FILA: " + this.fila.getNome());
        } else {
            this.participantes.add(usuario);
            usuario.setParticipacao(this);
            System.out.println(usuario.getNome() + " entrou na ATIVIDADE: " + this.nome);
        }
    }

    public void sairAtividade(Usuario usuario) {
        System.out.println(usuario.getNome() + " SAIU da ATIVIDADE: " + this.nome);
        this.participantes.remove(usuario);

        this.chamarProximoFila();
    }

    /**
     * @TODO implementação
     */
    private void chamarProximoFila() {
        Usuario proximo = this.fila.chamarProximo();
        System.out.println(proximo.getNome() + " É a sua vez de participar da atividade: " + nome);
    }

    private LocalTime validaHoraInicio(LocalTime horaInicio) throws DateTimeException {
        if (horaInicio.isBefore(evento.getDataIncio().toLocalTime())) {
            throw new DateTimeException("A hora de inicio da atividade não pode ser anterior a hora de inicio do Evento");
        }
        return horaInicio;
    }

    private LocalTime validaHoraTermino(LocalTime horaTermino) throws DateTimeException {
        if (horaTermino.isAfter(evento.getDataTermino().toLocalTime())) {
            throw new DateTimeException("A hora de término da atividade não pode ser posterior a hora de término do Evento");
        }
        return horaTermino;
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
