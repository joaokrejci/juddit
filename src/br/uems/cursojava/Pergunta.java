package br.uems.cursojava;


import java.util.ArrayList;

import static br.uems.cursojava.Main.usuarios;

public class Pergunta implements Post {
    private final String titulo;
    private final Postagem postagem = new Postagem();

    public Pergunta(String texto, Usuario usuario, String titulo) {
        this.postagem.texto = texto;
        this.postagem.usuario = usuario;
        this.titulo = titulo;
        this.postagem.votacao = new Votacao();
    }

    //usado apena no parsePergunta
    private Pergunta(Usuario user, String texto, int votos, String titulo) {
        this.postagem.usuario = user;
        this.postagem.texto = texto;
        this.postagem.votacao = new Votacao(votos);

        this.titulo = titulo;
    }

    //id,usuario,titulo,texto,votacao,respostas
    public static Pergunta parsePergunta(String pergunta) {
        String[] info = pergunta.split(",");

        Usuario usuario = usuarios.get(Integer.parseInt(info[1]));

        Pergunta novaPergunta = new Pergunta(usuario, info[3], Integer.parseInt(info[4]), info[2]);

        String[] respostas = info[5].split(":");

        for(String resposta : respostas) {
            novaPergunta.novaResposta(Resposta.parseResposta(resposta));
        }

        return novaPergunta;
    }

    @Override
    public void vote(boolean vote) {
        this.postagem.votacao.votar(vote, this.postagem.usuario);
    }

    @Override
    public void novaResposta(Resposta resposta) {
        this.postagem.respostas.add(resposta);
    }

    @Override
    public void editaTexto(String novoTexto) {
        this.postagem.texto = novoTexto;
    }

    @Override
    public Votacao getVotacao() {
        return this.postagem.votacao;
    }

    @Override
    public String getData() {
        return this.postagem.data;
    }

    @Override
    public String getTexto() {
        return this.postagem.texto;
    }

    @Override
    public ArrayList<Resposta> getRespostas() {
        return this.postagem.respostas;
    }
}
