package com.fiap.challenge.fila;

import com.fiap.challenge.fila.dominio.entidades.Fila;
import com.fiap.challenge.fila.dominio.entidades.Usuario;
import com.fiap.challenge.fila.dominio.entidades.atividade.Atividade;
import com.fiap.challenge.fila.dominio.entidades.evento.Evento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.LocalTime;

@SpringBootApplication
public class FilaOnlineApplication {

    public static void main(String[] args) throws Exception {

        // Cadastrar um evento

        Evento comicCon = new Evento(
                "ComicCon",
                LocalDateTime.of(2024, 6, 1, 8, 0, 0),
                LocalDateTime.of(2024, 6, 2, 23, 0, 0),
                5

        );


        Atividade marvelHero = new Atividade(
                "Marvel Heroes",
                comicCon,
                LocalTime.of(8, 0, 0),
                LocalTime.of(23, 0, 0),
                3,
                new Fila("Fila para o Marvel Heroes")
        );

        Usuario lorena = new Usuario("Lorena Antonella dos Santos", "886.910.425-75", "lorena_dossantos@gabiaatelier.com.br", "wNdedWuBAB");
        Usuario sandra = new Usuario("Sandra Pietra Almada", "259.870.709-53", "sandra_pietra_almada@yahoo.com.ar", "f34FuFmoHf");
        Usuario yago = new Usuario("Yago Ian Geraldo Duarte", "289.653.274-90", "yagoianduarte@agen-pegeuot.com.br", "gFdZHy3Kg5");
        Usuario bernardo = new Usuario("Bernardo Marcos Vinicius Silva", "145.883.544-85", "bernardo_silva@foxtech.com.br", "gWDtB7oRhp");
        Usuario yuri = new Usuario("Yuri Kauê Figueiredo", "253.261.394-72", "yuri-figueiredo81@gmnail.com", "J6jrYwFf4T");


        // Entrou no evento
        comicCon.entrarEvento(lorena);
        comicCon.entrarEvento(sandra);
        comicCon.entrarEvento(yago);
        comicCon.entrarEvento(bernardo);
        comicCon.entrarEvento(yuri);


        // O usuário entrou na marvelHero
        marvelHero.entrarAtividade(lorena);
        marvelHero.entrarAtividade(sandra);
        marvelHero.entrarAtividade(yago);
        marvelHero.entrarAtividade(bernardo);
        marvelHero.entrarAtividade(yuri);


        // O usuário saiu da marvelHero
        marvelHero.sairAtividade(lorena);


        System.out.println("========================================");

        System.out.println(lorena.getNome() + " Paticipou das seguintes atividades: " + lorena.getParticipacoes().toString());
        System.out.println(sandra.getNome() + " Paticipou das seguintes atividades: " + sandra.getParticipacoes().toString());
        System.out.println(yago.getNome() + " Paticipou das seguintes atividades: " + yago.getParticipacoes().toString());
        System.out.println(bernardo.getNome() + " Paticipou das seguintes atividades: " + bernardo.getParticipacoes().toString());
        System.out.println(yuri.getNome() + " Paticipou das seguintes atividades: " + yuri.getParticipacoes().toString());


    }
}

