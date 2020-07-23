package br.uems.cursojava;

import java.util.ArrayList;

import static br.uems.cursojava.Main.usuarios;
import static br.uems.cursojava.Main.votacoes;

public class Resposta implements Post{
    private final Postagem postagem = new Postagem();

    Resposta(Usuario usuario, String texto, Votacao votacao, ArrayList<Resposta> respostas) {
        this.postagem.usuario = usuario;
        this.postagem.texto = texto;

        this.postagem.votacao = votacao;
        this.postagem.respostas = respostas;
    }

    public static Resposta parseResposta(String resposta) {
        String[] informacoes = resposta.split(",");
        ArrayList<Resposta> resps = new ArrayList<>();

        String[] resp_info = informacoes[4].split(":");
        for(String r : resp_info){
            resps.add(Main.respostas.get(Integer.parseInt(r)));
        }

        return new Resposta(
                usuarios.get(Integer.parseInt(informacoes[1])),
                informacoes[2],
                votacoes.get(Integer.parseInt(informacoes[3])),
                resps
        );
    }

    @Override
    public void vote(boolean vote) {
        this.postagem.votacao.votar(vote, this.postagem.usuario);
    }

    @Override
    public void novaResposta(Resposta resposta) {
        Main.respostas.add(resposta);
        this.postagem.respostas.add(resposta);
    }

    @Override
    public void editaTexto(String novoTexto) {
        this.postagem.texto = novoTexto;
    }

    @Override
    public Votacao getVotacao() {
        return null;
    }

    @Override
    public String getData() {
        return null;
    }

    @Override
    public String getTexto() {
        return null;
    }

    @Override
    public ArrayList<Resposta> getRespostas() {
        return null;
    }
}
