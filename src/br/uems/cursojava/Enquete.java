package br.uems.cursojava;

import java.util.LinkedList;

public class Enquete {
    /*
    declaração do titulo da enquete, lista responsavel
    por armazenar da opção da enquete e variavel que armazena a
    quantidade total de votos
     */
    private String titulo;
    private LinkedList<Opcao> opcoes= new LinkedList<>();
    private int totalVotos;

    //contrutor da enquete que define o titulo dela
    public Enquete(String titulo) {
        this.titulo = titulo;
    }

    //metodo responsavel por editar o titulo da enquete
    public void editarTitulo(String titulo){
        this.titulo=titulo;
    }

    //metodo que retorna o titulo da enquete
    public String getTitulo() {
        return titulo;
    }

    //metodo que adiciona um novo item a enquete
    public void adicionarOpcao(String descricaoOpcao){
        opcoes.add(new Opcao(descricaoOpcao));
    }

    //remove uma opção da enquete
    public void removeOpcao(int indexOpcao){
        if(indexOpcao<opcoes.size())
        opcoes.remove(indexOpcao);
        else System.out.println("index invalido");
    }

    //retorna a quantidade de opções da enquete
    public int qntOpcoes() {
        return opcoes.size();
    }

    //incrementa a quantidade de votos de item da enquete
    public void votar(int index){
        if (index<opcoes.size()){
            opcoes.get(index).votos++;
            totalVotos++;
        }
        else System.out.println("index invalido");
    }

    //retorna total de votos da enquete
    public int totalVotos(){
        return this.totalVotos;
    }

    //retorna a quantidade de votos na opção
    public int votosOpcao(int index){
        if(opcoes.size()>index)
        return opcoes.get(index).votos;
        else System.out.println("index invalido");
        return 0;
    }

    //altera a descrição de um item da enquete
    public void editarDescricao(int index,String descricao){
        if(index<opcoes.size()) opcoes.get(index).descricao=descricao;
        else System.out.println("index invalido");
    }

    //retorna a descrição de um item da enquete
    public String getDescricao(int index) {
        if(index<opcoes.size())
            return opcoes.get(index).descricao;
        else {
            System.out.println("index invalido");
            return null;}
    }

    //classe responsavel por cada opção
    private class Opcao{
        //construtor da opção que declara o valor inicial da descrição dela
        public Opcao(String descricao) {
            this.descricao = descricao;
        }
         //variaveis das opções
         int votos;
         String descricao;
    }
}
