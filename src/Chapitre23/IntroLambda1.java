/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 *  Utilisation d'une class anonyme pour paramétrer l'appel d'une fonction
 * @author Mihary
 */
interface Calculateur { public int calcul (int n);}
public class IntroLambda1 {
    public static void main (String args[])
    {
        int n1 = 5, n2 = 3;
        Calculateur carre = new Calculateur () {
                                                public int calcul (int n)
                                                {
                                                    return ( n* n);
                                                }
                                                };
        int res = carre.calcul(n1);
        System.out.println("Carre de " + n1 + " = " + res);
        System.out.println("Carre de " + n2 + " = " + carre.calcul(n2));
    }
}
