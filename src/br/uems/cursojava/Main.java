package br.uems.cursojava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<Pergunta> perguntas = new ArrayList<>();
    public static List<Resposta> respostas = new ArrayList<>();
    public static List<Votacao> votacoes = new ArrayList<>();
    public static List<Enquete> enquetes = new ArrayList<>();
    private static Scanner fileScanner;

    public static void readFromDB(String filepath, List list, Parser parser) throws FileNotFoundException {
        File usersFile = new File(filepath);
        fileScanner = new Scanner(usersFile);
        String line;

        while(fileScanner.hasNext()){
            line = fileScanner.nextLine();
            if(line.charAt(0) != '#')
                list.add(parser.parse(line));
        }

        fileScanner.close();
    }

    public static void main(String[] args) {
        try {
            readFromDB("files_database/usuarios.txt", usuarios, Usuario::parseUsuario);
            readFromDB("files_database/postagens.txt", perguntas, Pergunta::parsePergunta);
            readFromDB("files_database/respostas.txt", respostas, Resposta::parseResposta);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(Usuario u : usuarios){
            System.out.println(u.getNome());
        }
    }
}
