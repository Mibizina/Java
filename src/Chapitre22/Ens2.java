/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre22;

/**
 *  Determination des lettres présentes dans le texte
 * @author Mihary
 */
import java.util.*;
public class Ens2 {
    public static void main (String args[])
    {
        String phrase = "Ceci est une phrase ";
        String voy = "aeiouy";
        HashSet <String> lettres = new HashSet <String>();
        for (int i = 0; i <phrase.length();i++)
        {
            lettres.add(phrase.substring(i, i+1));
        }
            System.out.println("lettres presentes : " + lettres);
            
            HashSet <String> voyelles = new HashSet<String>();
            for (int i=0; i<voy.length(); i++)
            {
                voyelles.add(voy.substring(i, i+1));
                
            }
        lettres.removeAll(voyelles);
        System.out.println("lettres sans les voyelles : " + lettres);
    }
}
