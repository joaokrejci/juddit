package br.uems.cursojava;


import java.util.ArrayList;

public interface Post {
    public void vote(boolean vote);
    public void novaResposta(Resposta resposta);
    public void editaTexto(String novoTexto);
    public Votacao getVotacao();
    public String getData();
    public String getTexto();
    public ArrayList<Resposta> getRespostas();
}
