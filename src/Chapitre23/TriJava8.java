/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 * Les nouvelles methodes Java8 de l'interface Comparator
 * @author Mihary
 */
import java.util.*;
public class TriJava8 {
    public static void main (String args[])
    {
        List<Point8> liste = new ArrayList<Point8>();
        Point8 tab[] = {
            new Point8 (2, 5), new Point8(-2, 3), new Point8(6, -3), new Point8(-3, -2)
        };
        liste = Arrays.asList(tab); // methode statique construisant une liste a partir d'un tableau
        System.out.print("Aant tri                  : ");
        liste.forEach(pp -> pp.affiche());
        liste.sort((pp1, pp2) -> ((Integer)(pp1.getX())).compareTo((Integer)(pp2.getX())));
        System.out.print("\nTri abscisses           : ");
        liste.forEach(pp -> pp.affiche());
        liste.sort(Comparator.comparing(Point8::getY));
        System.out.print("\nTri ordonnees           : ");
        liste.forEach(pp -> pp.affiche());
        liste.sort(Comparator.naturalOrder());// possible parce que Point8 implemente Comparable
        System.out.print("\nTri ordre naturel       : ");
        liste.forEach(pp ->pp.affiche());
        liste.sort(Comparator.comparing(Point8::getY).reversed());
        System.out.print("\nTri ordonnees inverse : ");
        liste.forEach(pp -> pp.affiche());
    }
}
class Point8 implements Comparable<Point8> // Comparable pour naturalOrder
{
    public Point8 (int x, int y) 
    {this.x = x ; this.y = y ;}
    
        public void affiche(){System.out.println("[" + x + "," + y + "] ");}
        public int getY() { return y;}
        public int getX() { return x;}
        public int compareTo (Point8 p)
        {
            return (((Integer) (this.x)).compareTo((Integer)(p.x)));
        }
    
    private int x , y;
}