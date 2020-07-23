package br.uems.cursojava;

import java.util.ArrayList;
import java.util.TreeSet;

public abstract class Post {
    /*
    Este atributo foi removido pois os comentarios n vao ter titulos, só as perguntas. Implementar depois.
    private String titulo;
    */
    protected String texto;
    private final long iDusuario;
    private final String data;
    protected ArrayList<Resposta> respostas;
    private TreeSet<Long> IdUsuarios; //Pra depois
    private int votos = 0;

    public Post(String texto, Usuario usuario){
        this.texto = texto;
        this.iDusuario = usuario.getID();
        this.data = java.time.LocalDate.now().toString();

        // Pegar usuarios que ja votaram do banco de dados e dar eles para o tree set IdUsuarios depois
    }

    //usuario,texto,votacao
    protected Post(Usuario user, String texto, int votos) {
        this.iDusuario = user.getID();
        this.texto = texto;
        this.votos = votos;
        this.data = java.time.LocalDate.now().toString();
    }

    public abstract ArrayList<Resposta> getRespostas();
    public abstract void novaResposta(Resposta resposta);
    public abstract void editaTexto(String novoTexto);

    public void voto(boolean voto, Usuario usuario){
        for(Long ID: IdUsuarios) {
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
