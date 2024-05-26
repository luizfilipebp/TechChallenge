package com.fiap.challenge.fila;

import modelo.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FilaOnlineApplication {

	public static void main(String[] args) {

		LocalDateTime dataLogin = LocalDateTime.now();

				Evento evento = new Evento();
		LocalDateTime dataEvento = LocalDateTime.of(2025, 5, 20, 9, 0);
		evento.setEventoDoId(1);
		evento.setNome("ComicCon");
		evento.setData(dataEvento);
		evento.setEndereco("Avenidada Paulista, n°3003");
		evento.setDescricao("O Commicon é um evento anual que reúne entusiastas da cultura pop, quadrinhos, filmes, jogos e ficção científica.");
		evento.setOrganicacao("Commicon Grup");
		evento.setCapacidade(10000);
		evento.setParticipantes(new ArrayList<>());

		Atividade atividade = new Atividade();
		atividade.setId(1);
		atividade.setNome("Marvel Heroes");
		atividade.setDescricao("Venha confirir conteudos inetidos do UCM");
		atividade.setInicio(dataEvento);
		atividade.setFim(dataEvento.plusMinutes(30));
		atividade.setSetor(1);
		atividade.setResponsavel("Bruno Lopes");
		atividade.setParticipantes(new ArrayList<>());
		atividade.setRecursos(new ArrayList<>());

		// Usuário
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setNome("Bruno Lopes");
		usuario.setEmail("Bruno_Lopes@gmail.com");
		usuario.setSenha("senha123");
		usuario.setDataRegistro(dataLogin);
		usuario.setUltimoLogin(dataLogin);
		usuario.setTipo("Administrador");
		usuario.setAtividadesInscritas(new ArrayList<>());
		usuario.setEventosOrganizados(new ArrayList<>());

		Fila fila = new Fila();
		fila.setId(1);
		fila.setNome("");
		fila.setCapacidadeMaxima(50);
		fila.setUsuarios(new ArrayList<>());
		fila.setEntrada(LocalDateTime.now());
		fila.setAtividade(atividade);
		fila.setStatus("Aberta");

		System.out.println("Informações do Evento:");
		System.out.println(evento);
		System.out.println("\nInformações da Atividade:");
		System.out.println(atividade);
		System.out.println("\nInformações do Usuário:");
		System.out.println(usuario);
		System.out.println("\nInformações da Fila:");
		System.out.println(fila);
	}

}


