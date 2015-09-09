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
import Chapitre9.Clavier;
import java.io.*;
import java.util.*; //pour StringTokenizer
public class Lectxt2 {
    public static void main (String args[]) throws IOException
    {
        String nomfich;
        int nombre, carre;
        System.out.print("donner le nom du fichier a lister : ");
        nomfich = Clavier.lireString();
        BufferedReader entree = new BufferedReader(new FileReader(nomfich));
        System.out.println("nombres et carrés contenus dans le fichier ");
        while (true)
        {
            String ligneLue = entree.readLine();
                if (ligneLue == null) break;
            StringTokenizer tok = new StringTokenizer(ligneLue, " ");
            nombre = Integer.parseInt(tok.nextToken());
            for (int i = 0; i<3 ; i++) tok.nextToken(); //pour sauter : a pour carré
            carre = Integer.parseInt(tok.nextToken());
            System.out.println(nombre + " " + carre);
        }
        entree.close();
        System.out.println("*** fin liste fichier ***");
    }
}
