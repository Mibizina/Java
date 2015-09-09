/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre22;

/**
 *
 * @author Mihary
 */
import java.util.*;
public class MaxMin {
    public static void main (String args[])
    {
        Point1 p1 = new Point1 (1, 3); Point1 p2 = new Point1 (2, 1);
        Point1 p3 = new Point1 (5, 2); Point1 p4 = new Point1 (3, 2);
        LinkedList<Point1> l = new LinkedList <Point1> ();
        l.add(p1); l.add(p2); l.add(p3); l.add(p4);
        
        Point1 pMax1 = Collections.max(l);
        System.out.print("Max suivant compareTo = "); pMax1.affiche();
        System.out.println();
        /*max de l, suivant l'ordre defini par compareTo  de Point1*/
        Point1 pMax2 = (Point1)Collections.max (l, new Comparator()
        {
            public int compare (Object o1, Object o2)
            {
                Point1 p1 = (Point1) o1; Point1 p2 =(Point1) o2;
                if (p1.y<p2.y) return -1;
                else if (p1.y == p2.y) return 0;
                else return 1;
            }
        }
        );
        System.out.print("Max suivant comparator = "); pMax2.affiche();
    }
}
class Point1 implements Comparable
{
    Point1 (int x, int y) {this.x = x; this.y = y;}
    public void affiche()
    {
        System.out.println("[" + x + " " + y + "] ");
    }
    public int compareTo (Object pp)
    {
        Point1 p = (Point1) pp;
        if (this.x<p.x) return -1;
        else if (this.x == p.x) return 0;
        else return 1;
    }
    public int x,y;
}
