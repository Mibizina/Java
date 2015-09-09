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
public class CoupleM {
    public static void main (String args[])
    {
        Integer oi1 = 3;
        Double od1 =  2.5;
        Couple1 <Integer, Double> ch1 = new Couple1 <Integer, Double> (oi1, od1);
        ch1.affiche();
        
        Integer oi2 = 4 ;
        Couple1 <Integer, Integer> ch2 = new Couple1 <Integer, Integer> (oi1, oi2);
        ch2.affiche();
        
        Integer n = ch1.getPremier();
        System.out.println("premier element du couple ch1 = " + n );
    }
}
class Couple1<T, U>
{
    private T x;    // le premier element du couple
    private U y;    //le second element du couple
    public Couple1 (T premier, U second)
    {
        x =premier ; y = second;
    }
    public T getPremier ()
    {
        return x;
    }
    public void affiche ()
    {
        System.out.println("premiere valeur : " + x + " - deuxieme valeur : " + y);
    }
}