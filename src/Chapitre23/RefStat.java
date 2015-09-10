/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 *  Utilisation d'une référence à une methode statique
 * @author Mihary
 */
public class RefStat {
    public static void main (String [] args)
    {
        traite5 (5, RefStat::carre);    //au lieu de : traite (5, x -> x*x);
        traite5 (12, RefStat::trinome); //au lieu de : traite (12, x -> 2*x*x + 3*x + 5);
    }
    public static void traite5 (int n, Calculateur cal)
    {
        int res = cal.calcul(n);
        System.out.println("calcul ( "+ n + " ) = " + res);
    }
    public static int carre (int n) {return n*n;} //meme type de calcul
    public static int trinome (int n) {return 2*n*n+ 3*n +5;} //idem
}
