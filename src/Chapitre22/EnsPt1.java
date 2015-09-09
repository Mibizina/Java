/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre22;

/**
 *  EXEMPLE DE REDEFINITION DE HASHCODE
 * @author Mihary
 */
import java.util.*;
public class EnsPt1 {
    public static void main (String args[])
    {
        Point p1 = new Point (1, 3), p2 = new Point (2, 2);
        Point p3 = new Point (4, 5), p4 = new Point (1, 8);
        Point p[] = {p1, p2, p1, p3, p4, p3};
        HashSet<Point> ens = new HashSet<Point>();
        for (Point px : p)
        {
            System.out.println("le point ");
            px.affiche();
            boolean ajoute = ens.add(px);
            if(ajoute) System.out.println(" a été ajouté");
            else System.out.println("est deja present");
            System.out.print("ensemble = "); affiche(ens);
        }
    }
    public static void affiche(HashSet<Point> ens)
    {
        Iterator<Point> iter = ens.iterator();
        while (iter.hasNext())
        {
            Point p = iter.next();
            p.affiche();
        }
        System.out.println();
    }
}
class Point
{
    Point (int x, int y)
    {
        this.x = x; this.y = y;
    }
    public int hashCode()
    {return x+y;}
    public boolean equals (Object pp)
    {
        Point p = (Point) pp;
        return ((this.x == p.x) & (this.y == p.y));
    }
    public void affiche()
    {
        System.out.print("[" + x + " " + y + "] ");
    }
    private int x,y;
}
/* // Adaptation de point TreeSet
class Point implements Comparable
{
    Point (int x,  int y ) {this.x = x ; this.y=y;}
    public int compareTo (Object pp)
    {
        Point p = (Point) pp; //egalité si coordonnees egales
        if (this.x<p.x) return -1;
        else if (this.x > p.x) return 1;
        else if (this.y < p.y) return -1;
        else if (this.y > p.y) return 1;
        else return 0;
    }
    public void affiche()
    {
        System.out.print("[" + x + " " + y + "] ");
    }
}
    */
