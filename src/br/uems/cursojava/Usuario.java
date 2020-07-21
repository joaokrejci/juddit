package br.uems.cursojava;

public class Usuario {
    private String ID;
    private String nome;
    private static int contador = 0;

    //cada usuario tem ID diferente para poder ser detectado pelo codigo e poderem ter nomes iguais
    public Usuario(String nome) {
        this.nome = nome;

        contador++;
        ID = String.valueOf(contador);
    }

    public String getID() {
        return this.ID;
    }
}
