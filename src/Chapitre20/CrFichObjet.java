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

class Point implements Serializable{
    Point (int abs, int ord) {x = abs ; y = ord;}
    public void affiche()
    {
        System.out.println("Coordonnées = " + x + " " + y);
    }
    private int x,y;
}
public class CrFichObjet 
{
    public static void main (String args[]) throws IOException
    {
        ObjectOutputStream sortie = new ObjectOutputStream (new FileOutputStream("point.dat"));
        Point p;
        for (int i = 0 ; i<5 ; i++)
        {
            p = new Point (i, 2*i);
            sortie.writeInt(i);    //envoi de l'entier i sur le flux sortie
            sortie.writeObject(p); //envoi de l'objet p sur le flux sortie
        }
    }
}
