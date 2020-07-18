package br.uems.cursojava;

import java.util.ArrayList;

public abstract class Post {
    private String texto;
    private String IDusuario;
    private String data;
    private static ArrayList<String> IdUsuarios; //Pra depois
    private int votos = 0;

    public Post(String texto, Usuario usuario, String data){
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
