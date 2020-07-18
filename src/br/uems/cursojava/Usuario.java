package br.uems.cursojava;

public class Usuario {
    private String ID;
    private String nome;
    private static int contador = 0;

    public Usuario(String nome) {
        this.nome = nome;

        contador++;
        ID = String.valueOf(contador);
    }

    public String getID() {
        return this.ID;
    }
}
