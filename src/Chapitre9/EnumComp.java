/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 *  ENUMERES
 * @author Mihary
 */
public class EnumComp {
    public static void main (String args[])
    {
        Jour courant;
        courant = Jour.dimanche;
        if (courant == Jour.dimanche) System.out.println("On se repose ");
        else System.out.println("On bosse");
        if (courant.equals(Jour.dimanche)) System.out.println("On se repose");
        else System.out.println("On bosse");
        if (courant.compareTo(Jour.samedi)<0) System.out.println("Ce n'est pas encore le week-end");
        if (courant.ordinal() < 5) System.out.println("On est en semaine");
        System.out.println("Rang du jour dans la semaine (lundi = 1) : "+ (courant.ordinal()+1));
    }
}
enum Jour { lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche}