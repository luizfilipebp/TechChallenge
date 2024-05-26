package com.fiap.challenge.fila.dominio.entidades;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

public class Fila {
    private UUID id;
    private String nome;
    private Queue<Usuario> esperantes;
    private LocalDateTime entrada;
    private String status;

    public Fila(String nome) {
        this.id = UUID.randomUUID();
        this.nome = nome;

        this.esperantes = new LinkedList<Usuario>();
    }

    public int getQtdPresentes() {
        return this.esperantes.size();
    }

    public void entrarFila(Usuario usuario) {
        this.esperantes.add(usuario);
    }

    public Usuario chamarProximo() {
        return this.esperantes.poll();
    }

    public String getNome() {
        return nome;
    }
}
