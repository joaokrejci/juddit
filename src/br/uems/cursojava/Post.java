package br.uems.cursojava;

import java.util.TreeSet;

public abstract class Post {
    private String titulo;
    private String texto;
    private final String IDusuario;
    private final String data;
    private TreeSet<String> IdUsuarios; //Pra depois
    private int votos = 0;

    public Post(String titulo, String texto, Usuario usuario, String data){
        this.titulo = titulo;
        this.texto = texto;
        this.IDusuario = usuario.getID();
        this.data = data;
    }

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
}
