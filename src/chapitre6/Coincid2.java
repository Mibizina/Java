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
class Pointy
{
    public Pointy(int abs, int ord)
    {
        x = abs; y = ord;
    }
    public static boolean coincide2(Pointy p1, Pointy p2)
    {
        return ((p1.x == p2.x) && (p1.y == p2.y));
    }
    private int x,y;
}

public class Coincid2 {
     public static void main (String args[])
    {
        Pointy a = new Pointy(1,3);
        Pointy b = new Pointy(2,5);
        Pointy c = new Pointy(1,3);
        System.out.println("a et b : " + Pointy.coincide2(a,b));
        System.out.println("a et c : " + Pointy.coincide2(a,c));
    }
}
