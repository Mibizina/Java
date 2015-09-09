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
import java.io.*; // pour les classes flux
public class Crsfic1 {
    public static void main (String args[]) throws FileNotFoundException, IOException
    {
        String nomfich;
        int n;
        System.out.print("donnez le nom de fichier a creer : ");
        nomfich = Clavier.lireString();
        DataOutputStream sortie = new DataOutputStream(new FileOutputStream(nomfich));
        do {System.out.print("donner un entier : ");
        n = Clavier.lireInt();
        if (n!= 0)
        {
            sortie.writeInt(n);
        }
        }
        while (n != 0);
        sortie.close();
        System.out.println("*** fin creation fichier ***");
    }       
}
