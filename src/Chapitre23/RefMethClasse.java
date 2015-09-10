/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre23;

/**
 *  Utilisation de la référence à une méthode de classe
 * @author Mihary
 */
interface Distanciable {public int distance (Point1 p1, Point1 p2);}
public class RefMethClasse {
    public static void main (String args[])
    {
        Point1 p1 = new Point1(1, 3), p2 = new Point1(3, 8);
        Distanciable dlamb = (pp1, pp2) ->pp2.getX() - pp1.getX();
        System.out.println("distance entre p1 et p2 =  " + dlamb.distance(p1, p2)); //OK 2 arguments type Point, retour int
        Distanciable d1 = Point1::distance1;
        System.out.println("distance1 entre p1 et p2 = " + d1.distance(p1, p2)); //OK 2 arguments type Point, retour int
        Distanciable d2 = Point1::distance2;
        System.out.println("distance2 entre p1 et p2 = " + d2.distance(p1, p2)); //OK 2 arguments type Point, retour int
    }
    
}
class Point1
    {
        public Point1 (int x, int y) {this.x = x; this.y =y;}
        public int distance1 (Point1 p) {return p.x - x;}
        public int distance2 (Point1 p) {return p.y - y;}
        public int getX() {return x; }
        public int getY() {return y; }
        private int x, y;
    }