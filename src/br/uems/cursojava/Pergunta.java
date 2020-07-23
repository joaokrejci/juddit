package br.uems.cursojava;

import java.util.ArrayList;

public class Pergunta extends Post {
    String titulo;

    public Pergunta(String texto, Usuario usuario, String titulo) {
        super(texto, usuario);

        this.titulo = titulo;
    }

    private Pergunta(Usuario user, String texto, int votos, String titulo) {
        super(user, texto, votos);

        this.titulo = titulo;
    }

    public static Pergunta parsePergunta(String pergunta) {
        //id,usuario,titulo,texto,votacao,respostas
        String[] info = pergunta.split(",");

        //nome, ID
        Usuario usuario = new Usuario(info[1], Long.parseLong(info[0]));

        //usuario, texto, votos, titulo
        Pergunta novaPergunta = new Pergunta(usuario, info[3], Integer.parseInt(info[4]), info[2]);

        String[] respostas = info[5].split(":");

        for(String resposta : respostas) {
            //respostas
            novaPergunta.novaResposta(Resposta.parseResposta(resposta));
        }

        return novaPergunta;
    }

    @Override
    public ArrayList<Resposta> getRespostas() {
        return super.respostas;
    }

    @Override
    public void novaResposta(Resposta resposta) {
        super.respostas.add(resposta);
    }

    @Override
    public void editaTexto(String novoTexto) {
        super.texto = novoTexto;
    }

    public String getTitulo() {
        return this.titulo;
    }
}
