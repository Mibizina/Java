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
public class TableauLambda {
    public static void main (String args[])
    {
        Calculateur [] tabCalc = {x -> x*x, x-> 2*x, x -> (int)Math.sqrt(x)};
        for (Calculateur calc : tabCalc) traite4 (15,calc);
    }
    public static void traite4 (int n, Calculateur cal)
    {
        int res = cal.calcul(n);
        System.out.println("calcul ( " + n + " ) = " + res);
    }
}
