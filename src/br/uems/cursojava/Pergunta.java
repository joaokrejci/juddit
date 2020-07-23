package br.uems.cursojava;

import java.util.ArrayList;

public class Pergunta extends Post {
    String titulo;

    public Pergunta(String texto, Usuario usuario) {
        super(texto, usuario);
    }

    //revisar depois
    public static Pergunta parsePergunta(String pergunta) {
        String[] info =  pergunta.split(", ", 2);

        return new Pergunta(info[0], new Usuario(info[0]));
    }

    @Override
    public ArrayList<String> getRespostas() {
        return super.respostas;
    }

    @Override
    public void novaResposta(String resposta) {
        super.respostas.add(resposta);
    }

    @Override
    public void editaTexto(String novoTexto) {
        super.texto = novoTexto;
    }

}
