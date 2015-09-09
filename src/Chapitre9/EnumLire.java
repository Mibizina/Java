/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 *  ENUMERES + SAISIE AU CLAVIER
 * @author Mihary
 */
public class EnumLire {
        public static void main (String args[])
        {
            String chJour;
            System.out.println("Donner un jour de la semaine: ");
            chJour = Clavier.lireString();
            /* première démarche : provoque une exception si la valeur de chJour
               ne représente pas une valeur de type Jour
            */
            Jour courant = Jour.valueOf(chJour);
                           //ou: Jour courant = Enum.valueOf(chJour);
            int numJour = courant.ordinal();
            System.out.println("Méthode 1 :" + courant + " est le jour de rang "  +  numJour);
            
            //2 eme méthode
            for (Jour j : Jour.values())
            {
                if (chJour.equals(j.toString()))
                {
                    numJour = j.ordinal();
                    System.out.println("Methode 2 : " + courant + " est le jour de rang " + numJour);
                }
            }
        }
}
