package com.fiap.challenge.fila.dominio.entidades.evento;

import com.fiap.challenge.fila.dominio.entidades.Usuario;
import com.fiap.challenge.fila.dominio.entidades.atividade.Atividade;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Evento {
    private UUID eventoId;
    private String nome;
    private LocalDateTime dataIncio;
    private LocalDateTime dataTermino;
    private String endereco;
    private String descricao;
    private String organicacao;
    private Integer capacidade;
    private List<Usuario> usuarios;
    private List<Atividade> atividades;

    public Evento(String nome, LocalDateTime dataInicio, LocalDateTime dataTermino, Integer capacidade) {
        this.eventoId = UUID.randomUUID();
        this.nome = nome;
        this.dataIncio = validaDataIncio(dataInicio);
        this.dataTermino = validaDataTermino(dataTermino);
        this.capacidade = validaCapacidade(capacidade);
        this.usuarios = new ArrayList<>();
    }

    private LocalDateTime validaDataIncio(LocalDateTime dataIncio) throws DateTimeException {
        if (dataIncio.isBefore(LocalDateTime.now())) {
            throw new DateTimeException("Data inicio do Evento não pode ser anterior a data atual");
        }
        return dataIncio;
    }

    private LocalDateTime validaDataTermino(LocalDateTime dataTermino) {
        if (dataTermino.isBefore(this.dataIncio)) {
            throw new DateTimeException("Data término do EVENTO não pode ser anterior a data de inicio");
        }
        return dataTermino;
    }

    private int validaCapacidade(Integer capacidade) throws IllegalArgumentException {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade do evento não pode ser igual ou menor que 0.");
        }
        return capacidade;
    }

    public void entrarEvento(Usuario usuario) throws Exception {
        if (this.usuarios.size() >= this.capacidade){
            throw new Exception("O evento está com a sua capacidade máxima");
        }
        this.usuarios.add(usuario);
    }

    public void sairEvento(Usuario usuario){
        this.usuarios.remove(usuario);
    }

    public LocalDateTime getDataIncio() {
        return this.dataIncio;
    }

    public LocalDateTime getDataTermino() {
        return this.dataTermino;
    }
}
