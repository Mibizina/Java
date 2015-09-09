/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 *
 * @author Mihary
 */
public class MotCol {
    public static void main (String args[])
    {
        String mot;
        mot = "bonjour";
        System.out.println("On va afficher le mot en colonne: " + mot);
        for (int i=0;i<mot.length();i++)
            System.out.println(mot.charAt(i));
        String ch = "chiffre = ";
        for (int j=0;j<=9;j++)
            ch +=j;
            System.out.println(ch);
    }
}
