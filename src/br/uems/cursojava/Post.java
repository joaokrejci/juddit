package br.uems.cursojava;

public abstract class Post {
    private String texto;
    private String usuario;
    private String data;
    private int votos = 0;

    public Post(String texto, String usuario, String data){
        this.texto = texto;
        this.usuario = usuario;
        this.data = data;
    }

    public void voto(int voto, String usuario){
        this.votos += voto;

    }
}
