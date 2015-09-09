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

public class Accdir1 {
    public static void main (String args []) throws IOException
    {
        String nomfich; int n, num;
        RandomAccessFile entree;
        System.out.println("donner le nom du fichier a  consulter : ");
        nomfich = Clavier.lireString();
        entree = new RandomAccessFile(nomfich, "r");
        long taille = entree.length();
        do
        {
            System.out.println("Numero de l'entier recherche : ");
            num = Clavier.lireInt(); if (num == 0) break;
            int rang = 4*(num-1);
            if ((rang>0) && (rang<taille))
            {
                entree.seek(rang);
                n = entree.readInt();
                System.out.println(" valeur = " + n);
            }
            else {
                System.out.println("entier existant ");
            continue;
            }
        }
        while (num!= 0);
        entree.close();
        System.out.println(" *** fin consultation fichier ***");
    }
}
