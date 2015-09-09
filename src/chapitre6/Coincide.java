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
class Pointu
{
    public Pointu(int abs, int ord)
    {
        x = abs; y = ord;
    }
    public boolean coincide(Pointu pt)
    {
        return ((pt.x == x) && (pt.y == y));
    }
    private int x,y;
}
public class Coincide {
    public static void main (String args[])
    {
        Pointu a = new Pointu(1,3);
        Pointu b = new Pointu(2,5);
        Pointu c = new Pointu(1,3);
        System.out.println("a et b : " + a.coincide(b)+ " " + b.coincide(a));
        System.out.println("a et c : " + a.coincide(c)+ " " + c.coincide(a));
    }
}
