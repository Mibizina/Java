/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre7;

/**
 *
 * @author Mihary
 */
public class Moyenne {
public static void main (String args[])
{
    int i , nbEl, nbElSupMoy;
    double somme, moyenne;
    System.out.println("Combien d'elèves? ");
    nbEl = Clavier.lireInt();
    double notes[] = new double[nbEl];
    for (i=0; i<nbEl; i++)
    {
        System.out.print("Donnez la note numéro " + (i+1) + " : " );
        notes[i] = Clavier.lireDouble();
    }

for(i=0, somme=0; i<nbEl; i++) somme +=notes[i];
moyenne = somme/nbEl;
System.out.println("\nmoyenne de la classe " + moyenne);
for (i=0, nbElSupMoy=0; i<nbEl; i++)
    if (notes[i] > moyenne) nbElSupMoy++;
    System.out.println(nbElSupMoy + " élèves ont plus de la moyenne");
    System.out.println("Taille de notes" + notes.length);
}
}
