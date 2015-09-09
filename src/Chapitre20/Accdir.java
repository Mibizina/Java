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

public class Accdir {
public static void main (String args[]) throws IOException
{
    String nomfich;
    int n, num;
    RandomAccessFile entree;
    System.out.println("donner le nom du fichier à consulter ");
    nomfich = Clavier.lireString();
    entree =  new RandomAccessFile(nomfich, "r");
    do
    {
        System.out.print("Numero de l'entier recherche : ");
        num = Clavier.lireInt();
        if (num == 0) break;
        entree.seek(4*(num-1));/**
         cette formule se justifie par le fait que le premier octet est de rang 0 et ici, on a convenu pour l'utilisateur, le premier entier du fichier porterait le numéro 1
         */
        n = entree.readInt();
        System.out.println(" valeur = " + n);
    }
    while (num != 0);
    
    entree.close();
    System.out.println("*** fin consultation fichier ***");
}
}
