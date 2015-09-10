/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 * Adaptation du programme précédent avec une expression lambda
 * @author Mihary
 */
interface Calculateur1 {public int calcul (int n);}
public class IntroLambda2 {
    public static void main (String args[])
    {
        int n1 = 5, n2 = 3;
        Calculateur1 carre = x -> x * x ;
        int res = carre.calcul(n1);
        System.out.println("Carre de " + n1 + " = " + res);
        System.out.println("Carre de " + n2 + " = " + carre.calcul(n2));
    }
}
