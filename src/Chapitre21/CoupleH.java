/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre21;

/**
 *
 * @author Mihary
 */

public class CoupleH {
public static void main (String args[])
    {
        Integer oi1 = 3; // equivalent à : Integer oi1 = new Integer (3)
        Integer oi2 = 5;
        Couple<Integer> ci = new Couple<Integer> (oi1,oi2);
        ci.affiche();
        Couple<Double> cd = new Couple <Double> (2.0, 12.0);
                //on peut fournir des arguments de type double qui seront
                //convertis automatiquement en Double
        cd.affiche();
        Double p = cd.getPremier();
        System.out.println("premier element du couple cd = " + p);
    }
}
class Couple<T>
{
    private T x,y; //les 2 elements du couple
    public Couple (T premier, T second)
    {
        x = premier ; y = second;
    }
    public T getPremier()
    {
        return x;
    }
    public void affiche()
    {
        System.out.println("premiere valeur : " + x + " - deuxieme valeur : " + y);
    }
}