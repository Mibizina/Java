/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre8;

/**
 *  CLASSE ANONYME AVEC INTERFACE
 * @author Mihary
 */
interface Affichable{public void affiche();}

public class Anonym2 {
    public static void main (String args[])
    {
        Affichable a;
        a = new Affichable()
        {
            public void affiche()
            {
                System.out.println("Je suis un Anonyme implémentant Affichable");
            }
        };
        a.affiche();
    }
}
