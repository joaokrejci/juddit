package br.uems.cursojava;


import java.util.ArrayList;

public interface Post {
    void vote(boolean vote);
    void novaResposta(Resposta resposta);
    void editaTexto(String novoTexto);
    Votacao getVotacao();
    String getData();
    String getTexto();
    ArrayList<Resposta> getRespostas();
}
