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
class Obj {
    private static long nb = 0; //nb est un champ de classe ce champ est partagé
    public Obj()
    {
        System.out.print("++ creation objet Obj ; ");
        nb++;
        System.out.println("il y en a maintenant " + nb);
    }
}
public class TstObj
{
    public static void main (String args[])
    {
        Obj a;
        System.out.println("Main 1");
        a = new Obj();
        System.out.println("Main 2");
        Obj b;
        System.out.println("Main 3");
        b = new Obj();
        Obj c = new Obj();
        System.out.println("Main 4");
    }
}
/*
l'exécution donne l'incrémentation de nb
Main 1
++ creation objet Obj ; il y en a maintenant 1
Main 2
Main 3
++ creation objet Obj ; il y en a maintenant 2
++ creation objet Obj ; il y en a maintenant 3
Main 4
*/