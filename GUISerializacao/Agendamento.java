package GUISerializacao;

import java.io.Serializable;

public class Agendamento implements Serializable {
    // atributos
    private String data;
    private String hora;
    private Usuario usuario;
    private String descricao;

    // metodos
    public Agendamento(String data, String hora, Usuario usuario, String descricao) {
        this.data = data;
        this.hora = hora;
        this.usuario = usuario;
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDescricao() {
        return descricao;
    }

}
