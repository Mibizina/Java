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
public class Array1 {
    public static void main (String args[])
    {
        ArrayList<Integer> v = new ArrayList <Integer>();
        System.out.println("En A : taille de v = " + v.size());
        
        /* on ajoute 10 objets de type Integer */
        for (int i=0 ; i<10 ; i++) v.add(new Integer(i));
        System.out.println("En B : taille de v = " + v.size());
        
        /* affichage du contenu, par acces direct (get) a chaque element */
        System.out.println("En B : contenu de v = ");
        for (Integer e:v)
            System.out.println(e + " ");
        System.out.println();
        
        /* suppression des elements de position donnee */
        v.remove(3);
        v.remove(5);
        v.remove(5);
        System.out.println("En C : contenu de v = " + v);
        
        /* ajout d'elements a une position donnee */
        v.add(2, new Integer(100));
        v.add(2, new Integer(200));
        System.out.println("En D : contenu de v = " + v);
        
        /* modification d'elements de position donnee */
        v.set(2, new Integer(1000)); // modification element de rang 2
        v.set(5, new Integer(2000)); // modification element de rang 5
        System.out.println("En D : contenu de v = " + v);
    }
}
