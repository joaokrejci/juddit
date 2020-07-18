package br.uems.cursojava;

import java.util.Scanner;

public class Pesquisa {
    Scanner input = new Scanner(System.in);
    protected String keyWord;

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getKeyWord() {
        return keyWord;
    }

}