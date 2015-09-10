/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 * Interface fonctionnelle standard
 * @author Mihary
 */
import java.util.function.*; // pour intUnaryOperator
public class LambdaRappel2 {
    public static void main (String args[])
    {
        traite1 (5,      x -> x*x);
        traite1 (12,     x -> 2*x*x + 3*x + 5);
    }
    public static void traite1 (int n, IntUnaryOperator cal)
    {
        int res = cal.applyAsInt(n);
        System.out.println("calcul ( " + n +" ) = " + res);
    }
}
/*
IntUnaryOperator représente une fonction recevant un int et renvoyant un int et 
dont la méthode fonctionnelle se nomme applyAsInt
*/