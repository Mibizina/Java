/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre20;

/**
 * Utilisation de Tokenizer qui découpe les éléments d'une ligne
 * @author Mihary
 */
import Chapitre7.Clavier;
import java.io.*;
import java.util.*;

public class Lectxt3 {
    public static void main (String args[]) throws IOException
    {
        String nomfich;
        double x, som=0;
        System.out.print("donner le nom du fichier à lister : ");
        nomfich = Clavier.lireString();
        BufferedReader entree = new BufferedReader(new FileReader(nomfich));
        System.out.println("Flottants contenus dans le fichier " + nomfich + " : ");
        while (true)
        {
            String ligneLue = entree.readLine();
            if (ligneLue == null) break;
            StringTokenizer tok = new StringTokenizer(ligneLue, " ");
            int nv = tok.countTokens();
            for (int i=0; i<nv; i++)
            {
                x = Double.parseDouble(tok.nextToken());
                som += x;
                System.out.println(x + " ");
            }
        }
        entree.close();
        System.out.println("somme des nombres = " + som);
        System.out.println("*** fin liste de fichier ***");
    }
}
