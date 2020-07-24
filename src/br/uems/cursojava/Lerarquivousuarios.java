package br.uems.cursojava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Bruno
public class Lerarquivousuarios {
    public static void Lerarquivosusuarios(String[] args) {
        File arq = new File("usuarios.txt");
        Scanner filesc = null;

        {
            try {
                filesc = new Scanner(arq);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        Usuario[] usuario = new Usuario[4];
        filesc.nextLine();
        while (filesc.hasNext()){
            String all = filesc.nextLine();
            String[] values = all.split(",");
            int id = Integer.parseInt(values[0]);
            usuario[id] = new Usuario(values[1]);

        }


    }
}
