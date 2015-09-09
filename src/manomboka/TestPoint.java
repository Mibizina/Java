/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manomboka;

/**
 *
 * @author Mihary
 */
public class TestPoint {
    public static void main(String[] args) {
        Point1 a;
        a = new Point1();
        a.initialise(3, 5);
        a.affiche();
        a.deplace(2, 0);
        a.affiche();
        Point1 b = new Point1();
        b.initialise(5, 3);
        b.affiche();
        //a.x = 77; POSSIBLE DANS LE CAS OU x EST PUBLIQUE DANS Test.java
        //a.affiche();
        PointConstructeur c = new PointConstructeur(8,6);
        c.affiche();
    }
}
