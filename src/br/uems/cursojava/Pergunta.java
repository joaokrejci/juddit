package br.uems.cursojava;

import java.util.ArrayList;

public class Pergunta implements Post {
    String titulo;

    public Pergunta(String texto, Usuario usuario) {
        postagem.texto = texto;
        postagem.usuario = usuario;
    }

    //revisar depois
    public static Pergunta parsePergunta(String pergunta) {
        String[] info =  pergunta.split(",");


        return new Pergunta(info[0], new Usuario(info[0]));
    }

    @Override
    public void vote(boolean vote) {
        this.votacao.votar(vote, postagem.usuario);
    }

    @Override
    public void novaResposta(Resposta resposta) {
        postagem.respostas.add(resposta);
    }

    @Override
    public void editaTexto(String novoTexto) {
        postagem.texto = novoTexto;
    }

}
