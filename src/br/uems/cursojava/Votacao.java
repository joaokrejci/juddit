package br.uems.cursojava;

import java.util.ArrayList;
import java.util.TreeSet;

public class Votacao {
    private TreeSet<String> idUsuarios; //Pra depois
    private static int votos = 0;

    public void votar(boolean voto, Usuario usuario){
        for(String id: idUsuarios) {
            if(id == usuario.getID()) return; //se ja tiver votado, ele sai da funcao.
        }

        if(voto)
            votos++;
        else
            votos--;

        idUsuarios.add(usuario.getID()); //Quando ele votar, o id dele eh adicionado na lista pra n votar dnv
    }

    public static int getVotos() {
        return votos;
    }
}

