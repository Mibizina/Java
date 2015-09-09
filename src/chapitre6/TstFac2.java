/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapitre6;

/**
 *
 * @author Mihary
 */
class Util2
{
    public static long fac1(long n)
        {
            long res ;
            System.out.println("** entree fac : n = " + n);
            if (n<=1) res = 1;
            else res = fac1(n-1)*n;
            System.out.println("** sortie fac : res = " +res );
            return res;
        }
}
public class TstFac2 {
    public static void main (String [] args)
    {int n = 5;
     System.out.println("Factorielle " + n + " = " + Util2.fac1(n));
    }
}
