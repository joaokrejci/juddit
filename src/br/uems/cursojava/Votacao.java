package br.uems.cursojava;

import java.util.ArrayList;
import java.util.TreeSet;

public class Votacao {
    private TreeSet<Long> idUsuarios; //Pra depois
    private int votos = 0;

    public Votacao() {}

    Votacao(int votos) {
        this.votos = votos;
    }

    public void votar(boolean voto, Usuario usuario){
        for(long id: idUsuarios) {
            if(id == usuario.getID()) return; //se ja tiver votado, ele sai da funcao.
        }

        if(voto)
            votos++;
        else
            votos--;

        idUsuarios.add(usuario.getID()); //Quando ele votar, o id dele eh adicionado na lista pra n votar dnv
    }

    public int getVotos() {
        return votos;
    }
}

