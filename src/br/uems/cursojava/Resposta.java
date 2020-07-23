package br.uems.cursojava;

public abstract class Resposta (String[] args){
    Resposta(int ID, String Usuario, String texto, String votacao, String resposta) {
        this.ID = ID;
        this.Usuario = Usuario;
        this.texto = texto;
        this.votacao = votacao;
        this.resposta  = resposta;

    }
    Resposta(String resposta){
        Resposta resp = Resposta.parseResposta(resposta);
        this.ID = resp.ID;
        this.Usuario = resp.Usuario;
        this.texto = resp.texto;
        this.votacao = resp.votacao;
        this.resposta = resp.resposta;
    }



    public static Resposta parseResposta(String resposta) {
        String[] informacoes = resposta.split(",");
        return new Resposta(
                informacoes[0],
                Integer.parseInt(informacoes[1]),
                Integer.parseInt(informacoes[2]),
                Integer.parseInt(informacoes[3]),
                Integer.parseInt(informacoes[4])
        );
    }
    int ID;
    String Usuario;
    String texto;
    String votacao;
    String resposta;

    String str = "345";
    int i = Integer.parseInt(str);

}
