/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre10;

/**
 *
 * @author Mihary
 */
class Point2
{
    public Point2(int x, int y) throws ErrConst2
    {
        if ((x<0) || (y<0))
            throw new ErrConst2("Erreur construction avec coordonnées "+ x + " " + y);
        this.x  = x; this.y = y;
    }
    public void affiche2()
    {
        System.out.println("coordonnees : " + x + " " + y);
    }
    private int x, y;
}
class ErrConst2 extends Exception
{
    ErrConst2 (String mes)
    {
        super(mes);
    }
}
public class Exinfo2 {
    public static void main (String args[])
    {
        try
        {
            Point2 a = new Point2(1, 4);
            a.affiche2();
            a = new Point2(-3, 5);
            a.affiche2();
        }
        catch (ErrConst2 e)
        {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
    }
}
