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
public class Except2 {
public static void main (String args[])
{
    try
    {
        Point a = new Point(1, 4);
        a.affiche();
        a.deplace(-3, 5);
        a = new Point (-3, 5);
        a.affiche();
    }
    catch(ErrConst e)
    {
        System.out.println("Erreur de construction");
        System.exit(-1);
    }
    catch(ErrDepl e)
    {
        System.out.println("Erreur déplacement");
        System.exit(-1);
    }
    /*
    catch (ErrConst | ErrDepl e)
    {
        System.out.println("Erreur déplacement");
        System.exit(-1);
    }
    */
}
}
