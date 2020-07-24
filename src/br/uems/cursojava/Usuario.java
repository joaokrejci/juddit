package br.uems.cursojava;

public class Usuario{
    private final long ID;
    private String nome;
    private static long contador = -1;

    //cada usuario tem ID diferente para poder ser detectado pelo codigo e poderem ter nomes iguais
    public Usuario(String nome) {
        this.nome = nome;

        contador++;
        ID = contador;
    }

    public Usuario(long id, String nome) {
        this.nome = nome;

        /*
        Precisa de verificacao de um banco de dados para ver se ja existe algum usuario com este ID. Caso exista,
        joga excecao. IMPLEMENTAR DEPOIS!
         */
        this.ID = id;
    }

    public static Usuario parseUsuario(String usuario){
        String[] info = usuario.split(",");
        return new Usuario(Integer.parseInt(info[0]),info[1]);
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

    @Override
    public String toString() {
        return ID +", "+ nome;
    }
}

