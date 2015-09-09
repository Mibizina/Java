/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapitre6;

/**
 * ECHANGE D'INFORMATION AVEC LES METHODES
 * @author Mihary
 */
class Util
{
    public static void Echange(int a, int b)
    {
        System.out.println("Début Echange : " + a + " " + b);
        int c;
        c = a ; a = b ; b = c;
        System.out.println("Fin Echange : " + a + " " + b);
    }
}

public class Echange {
    public static void main (String args[])
    {
        int n = 10, p = 20;
        System.out.println("Avant appel : " + n + " " + p);
        Util.Echange(n, p);
        System.out.println("Apres appel : " + n + " " + p);// n = 10 ; p = 20
    }
}
