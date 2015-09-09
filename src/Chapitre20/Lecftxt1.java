/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre20;

/**
 *
 * @author Mihary
 */
import java.io.*;
import manomboka.Clavier;

public class Lecftxt1 {
    public static void main (String args[]) throws IOException
    {
        String nomfich;
        String ligne;
        System.out.println("Donnez le nom du fichier a lister : ");
        nomfich = Clavier.lireString();
        BufferedReader entree = new BufferedReader(new FileReader(nomfich));
        do
        {
            ligne = entree.readLine();
            if (ligne != null) System.out.println(ligne);
        }
        while (ligne != null);
        entree.close();
        System.out.println ("*** fin liste fichier ***");
    }
}
