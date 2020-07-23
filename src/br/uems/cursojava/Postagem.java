package br.uems.cursojava;

import java.time.LocalDate;
import java.util.ArrayList;

class Postagem {
    public String texto;
    public Usuario usuario;
    public ArrayList<Resposta> respostas;
    public String data = LocalDate.now().toString();
    public Votacao votacao;
}
