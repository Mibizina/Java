/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 *   CONVERSION D'UNE CHAINE EN INT
 * @author Mihary
 */
public class ConvChI {
    public static void main(String args[])
    {
        String ch;
        while (true)
        {
            System.out.print ("Donnez une chaine (vide pour finir) : ");
            ch = Clavier.lireString();
            if(ch.length() == 0) break;
            int n = Integer.parseInt(ch);
            System.out.println(" entier correspondant " + n);
        }
    }
}
