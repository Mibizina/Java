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
class Obj1
{public Obj1()
    {       System.out.print("++ creation objet Obj ; ");
            nb++;
            System.out.println("il y en a maintenant " + nb);
    }
        public static long nbObj1()
            {
            return nb;
            }
        private static long nb = 0;
    }

public class TstObj2 {
    public static void main (String [] args)
    {
        Obj1 a;
        System.out.println("Main 1 : nb objets = " + Obj1.nbObj1());
        a = new Obj1();
        System.out.println("Main 2 : nb objets = " + Obj1.nbObj1());
        Obj1 b;
        System.out.println("Main 3 : nb objets = " + Obj1.nbObj1());
        b = new Obj1();
        Obj1 c = new Obj1();
        System.out.println("Main 4 : nb objets = " + Obj1.nbObj1());
    }
}
