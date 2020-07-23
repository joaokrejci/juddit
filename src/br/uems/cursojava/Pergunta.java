package br.uems.cursojava;

import java.util.ArrayList;

public class Pergunta extends Post {
    String titulo;

    public Pergunta(String texto, Usuario usuario) {
        this.texto = texto;
        this.usuario = usuario;
    }

    //revisar depois
    public static Pergunta parsePergunta(String pergunta) {
        String[] info =  pergunta.split(",");


        return new Pergunta(info[0], new Usuario(info[0]));
    }

    @Override
    public void vote(boolean vote) {
        this.votacao.votar(vote, usuario);
    }

    @Override
    public void novaResposta(Resposta resposta) {
        super.respostas.add(resposta);
    }

    @Override
    public void editaTexto(String novoTexto) {
        super.texto = novoTexto;
    }

}
