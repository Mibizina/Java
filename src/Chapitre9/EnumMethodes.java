/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 * ENUMERES METHODES: CAS PARTICULIERS DES CONSTRUCTEURS
 * @author Mihary
 */
public class EnumMethodes {
    public static void main (String args[])
    {
        System.out.println(" Noms des valeurs du type jour et leurs abréviations ");
        for (Jour2 j: Jour2.values())
            System.out.println(j + " : " + j.abreviation());
    }
}

enum Jour2
{
    lundi ("lu"), mardi ("ma"), mercredi ("me"), jeudi ("je"), vendredi ("ve"), samedi ("sa"), dimanche ("di");
    private Jour2 (String a)
    {
        abrege = a;
    }
    public String abreviation () {
        return abrege;
    }
    private String abrege;
}