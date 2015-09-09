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
public class Tri1 {
    public static void main (String args[])
    {
        int nb[] = {4, 9, 2, 3, 8, 1, 3, 5};
        ArrayList<Integer> t = new ArrayList <Integer> ();
        for (Integer v : nb) t.add(v);
        System.out.println("t initial       = " + t);
        Collections.sort (t);
        System.out.println("t trie          = " + t);
        Collections.shuffle(t);
        System.out.println("t melange       = " + t);
        Collections.sort(t, Collections.reverseOrder());
        System.out.println("t trie inverse  = " + t);
    }
}
