/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapitre9;

/**
 *
 * @author Mihary
 */
public class EnumMethode {
    public static void main(String args[])
    {
        System.out.println("Noms des valeurs de type Jour1 ");
        for (Jour1 j : Jour1.values()) j.affiche();
    }
}
enum Jour1
{ lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche;
public void affiche()
{
    System.out.println(this.toString());
}
}