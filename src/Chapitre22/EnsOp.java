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
public class EnsOp {
    public static void main (String args[])
    {
        int t1[] = {2, 5, 6, 8, 9};
        int t2[] = {3, 6, 7, 9};
        HashSet<Integer> e1 = new HashSet<Integer>(), e2 = new HashSet<Integer>();
        for (int v : t1) e1.add(v);
        for (int v : t2) e2.add(v);
        System.out.println("e1 = " + e1); System.out.println("e1 = " + e2);
        
        //reunion de e1 et e2 en u1
        HashSet<Integer> u1 = new HashSet<Integer> ();
        copie (u1, e1);
        u1.addAll(e2);
        System.out.println("u1 = " + u1);
        
        // interaction de e1 et e2 dans i1
        HashSet<Integer> i1 = new HashSet<Integer>();
        copie (i1, e1);
        i1.retainAll(e2);
        System.out.println("i1 = " + i1);
    }
    public static <E> void copie (HashSet<E> but, HashSet<E> source)
    {
        Iterator <E> iter = source.iterator();
        while (iter.hasNext())
        {
            but.add(iter.next());
        }
    }
}
