/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 *
 * @author Mihary
 */
public class LambdaRappel {
    public static void main (String args[])
    {
        traite (5,  x -> x*x);
        traite (12, x -> 2*x*x + 3*x +5);
        Calculateur polynome = x -> 2*x*x + 3*x + 5;
        traite (1, polynome);
    }
    public static void traite (int n, Calculateur cal)
    {
        int res = cal.calcul(n);
        System.out.println("calcul (" + n + ") = " + res);
    }
}
