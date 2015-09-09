/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre11;

import Chapitre7.Clavier;

/**
 *
 * @author Mihary
 */
public class Demons {
    public static void main (String args[])
    {
        Ecrit3 e1 = new Ecrit3 ("Bonjour ", 5);
        Ecrit3 e2 = new Ecrit3 ("Bonsoir ", 10);
        Ecrit3 e3 = new Ecrit3 ("\n", 35);
        e1.setDaemon(true); e1.start();
        e2.setDaemon(true); e2.start();
        e3.setDaemon(true); e3.start();
        Clavier.lireString(); //met fin au main, donc ici
                              //aux trois autres threads démons
    }
    
}
