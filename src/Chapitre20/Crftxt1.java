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
public class Crftxt1 {
    public static void main (String args[]) throws IOException
    {
        String nomfich;
        int n;
        System.out.println("Donnez le nom du fichier a creer : ");
        nomfich = Clavier.lireString();
        PrintWriter sortie = new PrintWriter (new FileWriter(nomfich));
        do
        {
            System.out.println("donner un entier : ");
            n = Clavier.lireInt();
            if (n!= 0) sortie.println(n + " a pour carre " + n*n);
        }
        while(n != 0);
        sortie.close();
        System.out.println("*** fin création de fichier *** ");
    }
}
