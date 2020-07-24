package br.uems.cursojava;

import java.util.*;
import java.util.function.Consumer;

import static br.uems.cursojava.Main.perguntas;

public class Pesquisa<E> {
    public Pesquisa(String keyword, List<E> where) {
        this.keyword = keyword;
        this.collection = where;
    }

    private String keyword;
    private Collection<E> collection;
    private List<E> results;

    public void buscar(Filter<E, String> filter){
        for(E element: collection){
            if(filter.filter(element, keyword)){
                results.add(element);
            };
        }
    }

    public List<E> getResults(){
        return results;
    }
}

/*ALESSANDRA*/
