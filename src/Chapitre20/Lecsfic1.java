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
import Chapitre7.Clavier;
import java.io.*;

public class Lecsfic1 {
public static void main (String args[]) throws IOException
{
    String nomfich;
    int n = 0;
    
    System.out.print("Donnez le nom du fichier a lister : ");
    nomfich = Clavier.lireString();
    DataInputStream entree = new DataInputStream(new FileInputStream(nomfich));
    System.out.println("valeurs lues dans le fichier " + nomfich + " : ");
    boolean eof = false; // sera mis en true par l'exception  EOFile
    while (!eof)
    {
        try 
        {
            n = entree.readInt();
        }
        catch (EOFException e)
        {
            eof = true;
        }
        if (!eof) System.out.println(n);
    }
    entree.close();
    System.out.println(" *** fin liste fichier *** ");
}
}
