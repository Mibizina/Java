/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 * Utilisation d'une expression lambda dans une instruction return
 * @author Mihary
 */
public class ReturnLambda {
    public static void main (String [] args)
    {
        for (int i = 0; i<3 ; i++)
            traite2 (4, fabriqueStatique());
    }
    public static void traite2 (int n, Calculateur cal)
    {
        int res = cal.calcul(n);
        System.out.println("calcul ( " + n + " ) = " + res);
    }
    public static Calculateur fabriqueStatique() //tire un calculateur au hasard
    {
        double x = Math.random();
        if (x < 0.5) return xx -> xx * xx; // renvoie une expression labda
        else return xx -> 2 * xx; // renvoie une autre expression lambda
    }
}
