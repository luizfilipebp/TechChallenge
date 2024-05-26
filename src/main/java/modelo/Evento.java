package modelo;
import lombok.Getter;
import modelo.Usuario;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class Evento extends Atividade{

    @Getter
    private Integer eventoDoId;
    private String nome;
    private LocalDateTime data;
    private String endereco;
    private String descricao;
    private String organicacao;
    private Integer capacidade;
    private List<Usuario> usuario;


    public void setEventoDoId(Integer eventoDoId) {
        this.eventoDoId = eventoDoId;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setOrganicacao(String organicacao) {
        this.organicacao = organicacao;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

}


