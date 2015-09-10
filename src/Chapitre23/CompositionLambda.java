/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 * Composition d'expression lambda
 * @author Mihary
 */
interface FabriqueCalculateur { Calculateur fabrique () ;}
public class CompositionLambda {
    public static void main (String args[])
    {
        FabriqueCalculateur fabriqueCarre  = () -> (xx -> xx * xx );
        FabriqueCalculateur fabriqueDouble = () -> xx -> 2 * xx;
        traite3 (12,    fabriqueCarre.fabrique());
        traite3 (25,    fabriqueDouble.fabrique());
    }
    public static void traite3 (int n, Calculateur cal)
    {
        int res = cal.calcul(n);
        System.out.println("calcul ( " + n + " ) = " + res);
    }
}
