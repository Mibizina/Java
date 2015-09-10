/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 * Une expression lambda constituée d'un bloc
 * @author Mihary
 */

public class CalculComplique {
    public static void main (String args[])
    {
        int n1 = 5, n2 = 4, n3 = -5;
        Calculateur complique = x ->    { if (x>0 && 2*(x/2)==x) return x;
                                            else if (x>0) return x+1;
                                            else return -x;
                                        };
        int res = complique.calcul(n1);
        System.out.println("Complique de " + n1 + " = " + res);
        System.out.println("Complique de " + n2 + " = " + complique.calcul(n2));
        System.out.println("Complique de " + n3 + " = " + complique.calcul(n3));
    }
}
