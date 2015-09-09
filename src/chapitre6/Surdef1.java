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
class Point
{
    public Point(int abs,int ord)
    {
        x = abs; y = ord;
    }
    public void deplace(int dx,int dy)
    {
        x +=dx; y +=dy;
    }
    public void deplace(int dx)
    {
        x +=dx;
    }
    public void deplace(short dx)
    {
        x +=dx;
    }
    private int x,y;
}
public class Surdef1 {
    public static void main (String args[])
    {
        Point a = new Point(1,2);
        a.deplace(1, 3);
        a.deplace(2);
        short p = 3;
        a.deplace(p);
        byte b = 2;
        a.deplace(b); //appelle deplace(short) apres conversion de b en short
    }
}
