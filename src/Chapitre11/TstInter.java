/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre11;

import Chapitre9.Clavier;

/**
 *  THREADS INFINIES
 * @author Mihary
 */
public class TstInter {
    public static void main (String args[])
    {
    Ecrit3 e1 = new Ecrit3("bonjour ", 5);
    Ecrit3 e2 = new Ecrit3("bonsoir  ", 10);
    Ecrit3 e3 = new Ecrit3("\n", 35);
    e1.start();
    e2.start();
    e3.start();
    
    Clavier.lireString();
    e1.interrupt(); // interruption premier thread
    System.out.println("\n**** Arret premier thread ***");
    Clavier.lireString();
    e2.interrupt();  //interruption deuxième
    e3.interrupt(); //interruption troisième
    System.out.println("\n *** Arret deux derniers threads ***");
    }
}
class Ecrit3 extends Thread
{
    public Ecrit3 (String texte, long attente)
    {
        this.texte = texte;
        this.attente = attente;
    }
    public void run()
    {
        try
        {
            while (true) //boucle infinie
            {
                if (interrupted()) return;
                System.out.print(texte);
                sleep(attente);
            }
        }
        catch (InterruptedException e)
        {
            return; // on peut omettre return ici
        }
    }
    private String texte; private long attente;
}