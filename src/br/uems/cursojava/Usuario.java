package br.uems.cursojava;

public class Usuario {
    private final long ID;
    private String nome;
    private static long contador = 0;

    //cada usuario tem ID diferente para poder ser detectado pelo codigo e poderem ter nomes iguais
    public Usuario(String nome) {
        this.nome = nome;

        contador++;
        ID = contador;
    }

    public Usuario(String nome, long id) {
        this.nome = nome;

        /*
        Precisa de verificacao de um banco de dados para ver se ja existe algum usuario com este ID. Caso exista,
        joga excecao. IMPLEMENTAR DEPOIS!
         */
        this.ID = id;
    }

    public long getID() {
        return this.ID;
    }

    public void mudaNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getNome() {
        return this.nome;
    }
}
