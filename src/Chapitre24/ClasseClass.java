/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre24;

/**
 *  Utilisation de Class et getClass
 * @author Mihary
 */
public class ClasseClass {
    public static void main (String args[])
    {
        Point1 p = new Point1();
        Class<?> c = p.getClass(); // ou c = Point.class;
        System.out.println("classe de c " + c.getName());
        // affichage de la conversion de c en String (méthode toString)
        System.out.println("classe de c (obtenue par toString) = " + c );
        
        Couple<Point1> cp = new Couple<Point1>();
        Couple<?> cj = new Couple<Point1>();
        System.out.println("classe Couple<Point> = " + cp.getClass().getName());
        System.out.println("classe Couple<?> = " + cj.getClass().getName());
    }
}
class Point1
{
    private int x,y;
}
class Couple<T>
{
    private T x,y;
}