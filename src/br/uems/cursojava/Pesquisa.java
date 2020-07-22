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

/ALESSANDRA/
    
    
    
String busca = ""

            int cout = 0;
            for (Pergunta p : perguntas) {
                if (p.getTitulo().contains(busca)) {
                    cout++;
                }
            }
            for (Pergunta p : perguntas) {
                if (p.getTexto().contains(busca)) {
                    cout++;
                }
            }

            for (Pergunta p : perguntas) {
                if (p.getRespostas().contains(busca)) {
                    cout++;
                }
            }
            System.out.println(cout + "resultados encontrados");
        }
