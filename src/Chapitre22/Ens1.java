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
public class Ens1 {
    public static void main (String args[])
    {
        int t[] = {2, 5, -6, 2, -8, 9, 5};
        HashSet<Integer> ens = new HashSet<Integer>();
        
        /* on ajoute des objets de type Integer */
        for (int v : t)
        {
            boolean ajoute = ens.add(v);
            if (ajoute) System.out.println(" On ajoute " + v);
            else System.out.println("  " + v + " est déjà present ");
        }
        System.out.print("Ensemble en A = "); affiche(ens);
        
        /* on supprime un eventuel objet de valeur Integer(5) */
        Integer cinq = 5;
        boolean enleve = ens.remove(cinq);
        if (enleve) System.out.println(" On a supprime 5");
        System.out.print ("Ensemble en B = "); affiche(ens);
        
        /* on teste la presence de Integer(5) */
        boolean existe = ens.contains(cinq);
        if (!existe) System.out.println(" On ne trouve pas 5");
    }
    public static <E> void affiche (HashSet<E> ens)
    {
        Iterator<E> iter = ens.iterator();
        while (iter.hasNext())
        {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }
}
