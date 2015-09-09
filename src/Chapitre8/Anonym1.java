/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre8;

/**
 *  CLASSE ANONYME
 * @author Mihary
 */

class A
{
    public void affiche()
    {
        System.out.println("Je suis un A");
    }
}
public class Anonym1 {
    public static void main (String args[])
    {
        A a;
        a = new A()
        { public void affiche() 
            {System.out.println("Je suis un anonyme derive de A");}
        };
    a.affiche();
    }
}
