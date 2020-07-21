package br.uems.cursojava;

import java.util.ArrayList;
import java.util.TreeSet;

public abstract class Post {
    /*
    Este atributo foi removido pois os comentarios n vao ter titulos, só as perguntas. Implementar depois.
    private String titulo;
    */
    private String texto;
    private final String IDusuario;
    private final String data;
    private ArrayList<String> respostas;
    private TreeSet<String> IdUsuarios; //Pra depois
    private int votos = 0;

    public Post(String texto, Usuario usuario, String data){
        this.texto = texto;
        this.IDusuario = usuario.getID();
        this.data = data;

        // Pegar usuarios que ja votaram do banco de dados e dar eles para o tree set IdUsuarios depois
    }

    public abstract String getRespostas();
    public abstract String novaResposta();
    public abstract void editaTexto(String novoTexto);

    public void voto(boolean voto, Usuario usuario){
        for(String ID: IdUsuarios) {
            if(ID == usuario.getID()) return; //se ja tiver votado, ele sai da funcao.
        }

        if(voto)
            this.votos++;
        else
            this.votos--;

        IdUsuarios.add(usuario.getID()); //Quando ele votar, o id dele eh adicionado na lista pra n votar dnv
    }

    public int getVotos() {
        return this.votos;}

    public String getData() {
        return this.data;
    }

    public String getTexto() {
        return this.texto;
    }
}
