package br.uems.cursojava;

import java.util.ArrayList;
import java.util.TreeSet;

public abstract class Post {
    /*
    Este atributo foi removido pois os comentarios n vao ter titulos, só as perguntas. Implementar depois.
    private String titulo;
    */
    String texto;
    String data;
    ArrayList<Resposta> respostas;
    int votos;
    Usuario usuario;
    Votacao votacao;

    public abstract void vote(boolean vote);
    public abstract void novaResposta(Resposta resposta);
    public abstract void editaTexto(String novoTexto);
}
