/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre10;

/**
 *  TRANSMISSION D'INFORMATION AU GESTIONNAIRE D'EXCEPTION
 * @author Mihary
 */
public class ExInfo1 {
public static void main (String args[])
{
    try
    {
        Point1 a = new Point1(1, 4);
        a.affiche1();
        a = new Point1(-3, 5);
        a.affiche1();
    }
    catch (ErrConst1 e)
    {
        System.out.println("Erreur construction point");
        System.out.println(" coordonnees souhaitees : " + e.abs + " " +e.ord);
        System.exit(-1);
    }
}
}
