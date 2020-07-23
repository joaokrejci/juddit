package br.uems.cursojava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeSet;


public interface Post {
    /*
    Este atributo foi removido pois os comentarios n vao ter titulos, só as perguntas. Implementar depois.
    private String titulo;
    */
    String data = LocalDate.now().toString();
    Votacao votacao = new Votacao();
    Postagem postagem = new Postagem();

    public abstract void vote(boolean vote);
    public abstract void novaResposta(Resposta resposta);
    public abstract void editaTexto(String novoTexto);
}
