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
import java.nio.*;
import java.nio.file.*;
public class LecFichObjet {
    public static void main (String args[]) throws IOException, ClassNotFoundException
    {
        ObjectInputStream entree = new ObjectInputStream (new FileInputStream("point.dat"));
        Point p;
        int num;
        boolean eof = false;
        while (!eof)
        {
            try
            {
                num = entree.readInt();
                p = (Point) entree.readObject();
                System.out.print("point numero : " + num + " ; ");
                p.affiche();
            }
            catch (EOFException e)
            {
                eof = true ;
            }
        }
        entree.close();
    }
}
