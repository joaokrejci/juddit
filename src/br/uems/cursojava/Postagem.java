package br.uems.cursojava;

import java.time.LocalDate;
import java.util.ArrayList;

class Postagem {
    public String texto;
    public Usuario usuario;
    public ArrayList<Resposta> respostas;
    public String data;
    public Votacao votacao;

    public Postagem() {
        this.data = LocalDate.now().toString();
    }
}
