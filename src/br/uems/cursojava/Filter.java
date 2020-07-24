package br.uems.cursojava;

public interface Filter<E,T> {
    boolean filter(E object, T param);
}
