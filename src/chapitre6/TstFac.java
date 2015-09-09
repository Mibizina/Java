/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapitre6;

/**
 *  RECURSIVITE
 * @author Mihary
 */
class Util1
{
    public static float fac (float n)
    {
    if (n>1) return (fac(n-1)*n);
    else return 1;
    }
}
public class TstFac {
    public static void main(String args[])
    {
        int n = 8;
        System.out.println("Factorielle : " + n + " = " + Util1.fac(n));
    }
}
